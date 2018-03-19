/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.component.textfield;

import com.sv.visionplus.util.component.textfield.generator.GeneratorFactory;
import com.sv.visionplus.util.component.textfield.validator.Validator;
import java.awt.event.FocusEvent;

/**
 *
 * @author Mohan
 */
public class CIntegerField extends CTextField<Integer> {

    public CIntegerField() {
        super();
    }

    @Override
    protected void initalize() {
        //number formatter factory
        setFormatterFactory(INTEGER_FORMATTER_FACTORY);

        //generator
        setDefaultValueGenerator(GeneratorFactory.getGenerator(Integer.class));

        //validator
        setValidator(Validator.INTEGER_VALIDATOR);

        //reset value
        resetCValue();
    }

    @Override
    public Integer getCValue() {
        return (getValue() == null)
                ? null
                : ((Number) getValue()).intValue();
    }

    @Override
    protected boolean isValidInput(String text) {
        return text.matches("^\\d+$"); //numbers only
    }

    @Override
    protected void focusGainedComponent(FocusEvent fe) {
        selectAll();
    }

    private static final String INTEGER_PATTERN = "###0";
    private static final javax.swing.text.DefaultFormatterFactory INTEGER_FORMATTER_FACTORY = new javax.swing.text.DefaultFormatterFactory();
    private static final java.text.DecimalFormat INTEGER_FORMAT = new java.text.DecimalFormat(INTEGER_PATTERN);

    static {
        INTEGER_FORMATTER_FACTORY.setDefaultFormatter(new javax.swing.text.NumberFormatter(INTEGER_FORMAT));
    }
}
