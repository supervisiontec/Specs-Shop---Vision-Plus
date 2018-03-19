/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.component.textfield;

import com.sv.visionplus.util.component.textfield.generator.GeneratorFactory;
import com.sv.visionplus.util.component.textfield.validator.Validator;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Mohan
 */
public class CDateField extends CTextField<Date> {

    private Object oldValue;
    private String DATE_PATTERN;
    private DefaultFormatterFactory DATE_FORMATTER_FACTORY;
    private SimpleDateFormat DATE_FORMAT;
    private MaskFormatter DATE_MASK_FORMAT;
    private static final String[] DATE_FORMAT_PATTERN_LETTERS = {
        "G", "y", "M", "w", "W", "D", "d", "F", "E", "a", "H", "k", "K", "h", "m", "s", "S", "z", "Z"
    };
    private static final char PLACE_HOLDER = '#';

    //custom date field for bug fix
    private class CDate extends Date {

        public CDate() {
            super();
        }

        public CDate(String d) {
            super();
            setText(DATE_FORMAT.format(d));
        }

        public CDate(Date date) {
            super();
            setTime(date.getTime());
        }

        @Override
        public String toString() {
            return DATE_FORMAT.format(this);
        }
    }

    public CDateField() {
    }

    @Override
    protected void initalize() {
        //initialize masks and other related stuff
        initMask();
        
        //set generator
        setDefaultValueGenerator(GeneratorFactory.getGenerator(Date.class));
        
        //validator
        setValidator(Validator.DATE_VALIDATOR);
        
        //reset cvalue
        resetCValue();
    }

    @Override
    protected boolean isValidInput(String text) {
        return true;
    }

    @Override
    protected boolean isAllowFilters() {
        return false;
    }

    @Override
    protected void focusGainedComponent(FocusEvent event) {
        selectAll();
    }

    @Override
    public Date getCValue() {
        return (getValue() == null)
                ? null
                : (Date) getValue();
    }

    private void initMask() {
        //default value
        oldValue = new CDate();

        //date pattern
        DATE_PATTERN = "yyyy-MM-dd";

        //date format
        DATE_FORMAT = new SimpleDateFormat(DATE_PATTERN);

        //mask format for date
        DATE_MASK_FORMAT = new MaskFormatter() {
            @Override
            public Object stringToValue(String value) throws ParseException {
                return new CDate(DATE_FORMAT.parse(value));
            }

            @Override
            public String valueToString(Object value) throws ParseException {
                String ret;
                try {
                    ret = DATE_FORMAT.format(value);
                } catch (Exception e) {
                    ret = DATE_FORMAT.format(oldValue);
                }
                return ret;
            }
        };

        //create and set mask
        String mask = DATE_PATTERN;
        for (String c : DATE_FORMAT_PATTERN_LETTERS) {
            mask = mask.replace(c, String.valueOf(PLACE_HOLDER));
        }
        try {
            DATE_MASK_FORMAT.setMask(mask);
            DATE_MASK_FORMAT.setPlaceholderCharacter(PLACE_HOLDER);
        } catch (ParseException ex) {
            Logger.getLogger(CDateField.class.getName()).log(Level.SEVERE, null, ex);
        }
        //config formatter factory
        DATE_FORMATTER_FACTORY = new DefaultFormatterFactory();
        DATE_FORMATTER_FACTORY.setDisplayFormatter(new DateFormatter(DATE_FORMAT));
        DATE_FORMATTER_FACTORY.setEditFormatter(DATE_MASK_FORMAT);
        DATE_FORMATTER_FACTORY.setNullFormatter(DATE_MASK_FORMAT);
        setFormatterFactory(DATE_FORMATTER_FACTORY);
        
        try {
            //commit edit for first time
            commitEdit();
        } catch (ParseException ex) {
            Logger.getLogger(CDateField.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
