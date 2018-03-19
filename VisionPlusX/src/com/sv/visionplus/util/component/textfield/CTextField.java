/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.component.textfield;

import com.sv.visionplus.util.component.textfield.generator.Generator;
import com.sv.visionplus.util.component.textfield.validator.ComponentValidationPaintor;
import com.sv.visionplus.util.component.textfield.validator.Validator;
import javax.swing.JFormattedTextField;
import static com.sv.visionplus.util.component.textfield.validator.Validator.ValidationLevel;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import javax.swing.SwingUtilities;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Mohan
 * @param <V>
 */
public abstract class CTextField<V> extends JFormattedTextField implements CComponent<V> {

    private Generator<V> generator;
    private Validator<V> validator;
    private boolean essential;

    public CTextField() {
        super();

        initalize();

        addFocusListener(new CTextFieldFocusListener());

        setSize(getWidth(), 23);
    }

    @Override
    public Validator<V> getValidator() {
        return this.validator;
    }

    @Override
    public void setValidator(Validator<V> validator) {
        this.validator = validator;
        updateMargin();
    }

    @Override
    public Generator<V> getDefaultValueGenerator() {
        return this.generator;
    }

    @Override
    public void setDefaultValueGenerator(Generator<V> generator) {
        this.generator = generator;
    }

    @Override
    public boolean isEssential() {
        return essential;
    }

    @Override
    public void setEssential(boolean essential) {
        this.essential = essential;
    }

    @Override
    public void setCValue(V value) {
        setValue(value);
//        if (isValueValid(value)) {
//        } else {
//            resetCValue();
//        }
    }

    @Override
    public void resetCValue() {
        setCValue(getDefaultValue());
    }

    @Override
    public boolean isCValueValid() {
        return isValueValid(getCValue());
    }

    @Override
    public void setCValueEditable(boolean status) {
        setEnabled(status);
    }

    @Override
    public boolean isCValueEditable() {
        return isEnabled();
    }

    private V getDefaultValue() {
        if (this.generator != null) {
            return this.generator.generateCValue();
        } else {
            return null;
        }
    }

    private boolean isValueValid(V value) {
        if (this.validator != null) {
            ValidationLevel validationLevel = this.validator.isValid(value);

            return (validationLevel == ValidationLevel.SUCCESS)
                    || (validationLevel == ValidationLevel.WARN);
        }

        return true;
    }

    /**
     * Its necessary to add document filter after changing the document.
     */
    @Override
    public void setDocument(Document doc) {
        super.setDocument(doc);

        addDocumentFilters((AbstractDocument) doc);
    }

    /**
     * Its necessary to reset document filters after changing the formatter of
     * the component.
     */
    @Override
    protected void setFormatter(AbstractFormatter format) {
        Document document = getDocument();
        DocumentFilter documentFilter = null;

        if (isAllowFilters()) {
            if (document instanceof AbstractDocument) {
                documentFilter = ((AbstractDocument) document).getDocumentFilter();
            }
        }

        super.setFormatter(format);

        if (documentFilter != null) {
            ((AbstractDocument) document).setDocumentFilter(documentFilter);
        }
    }

    /**
     * Some kind of text field such Integer, Double, and Date does not accept
     * some specific characters. The document filters helps to prevent those
     * inputs.
     *
     * @param abstractDocument
     */
    private void addDocumentFilters(AbstractDocument abstractDocument) {
        if (isAllowFilters()) {
            abstractDocument.setDocumentFilter(new DocumentFilter() {
                @Override
                public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                    if (isValidInput(text)) {
                        super.insertString(fb, offset, text, attr);
                    } else {
                        getToolkit().beep();
                    }
                }

                @Override
                public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    if (isValidInput(text)) {
                        super.replace(fb, offset, length, text, attrs);
                    } else {
                        getToolkit().beep();
                    }
                }
            });
        }
    }

    protected abstract void initalize();

    /**
     * checks the text input is valid for the component.
     *
     * @param text
     * @return
     */
    protected abstract boolean isValidInput(String text);

    /**
     * uses to identify current text field need to prevent some specified
     * inputs.
     *
     * @return
     */
    protected boolean isAllowFilters() {
        return true;
    }

    /**
     * fire this method when component focus gained
     *
     * @param event
     */
    protected abstract void focusGainedComponent(FocusEvent event);

    private ValidationLevel validateInput() {

        if (this.validator != null) {
            try {
                commitEdit();
                return validator.isValid(getCValue());
            } catch (ParseException ex) {
                return ValidationLevel.ERROR;
            }
        }

        return ValidationLevel.NONE;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ComponentValidationPaintor.paintValidation(this, validateInput(), g);
    }

    private void updateMargin() {
        if (validator != null) {
            setMargin(new Insets(
                    0,
                    0,
                    0,
                    20));
        }
        setSize(50, 23);
    }

    private class CTextFieldFocusListener extends FocusAdapter {

        @Override
        public void focusGained(final FocusEvent e) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }

                    if (isCValueEditable()) {
                        focusGainedComponent(e);
                    }
                }
            };
            SwingUtilities.invokeLater(runnable);
        }

        @Override
        public void focusLost(FocusEvent e) {
            try {
                commitEdit();

                if (!isCValueValid()) {
                    throw new ParseException("Invalid input", 0);
                }
            } catch (ParseException parseException) {
                requestFocus();
                getToolkit().beep();
            }
        }

    }

}
