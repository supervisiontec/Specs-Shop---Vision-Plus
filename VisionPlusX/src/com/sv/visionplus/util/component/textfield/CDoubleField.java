/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class CDoubleField extends CTextField<Double> {

    @Override
    protected void initalize() {
        //formatter factory
        setFormatterFactory(DOUBLE_FORMATTER_FACTORY);

        //set default value generator
        setDefaultValueGenerator(GeneratorFactory.getGenerator(Double.class));

        //validator
        setValidator(Validator.DECIMAL_VALIDATOR);

        //reset cvalue
        resetCValue();
    }

    @Override
    protected boolean isValidInput(String text) {
        return text.matches("^\\d+$") || text.equals(".");
    }

    @Override
    protected void focusGainedComponent(FocusEvent event) {
        selectAll();
    }

    @Override
    public Double getCValue() {
        return getValue() == null
                ? null
                : ((Number) getValue()).doubleValue();
    }

    private static final String DOUBLE_PATTERN = "#,##0.00";
    private static final javax.swing.text.DefaultFormatterFactory DOUBLE_FORMATTER_FACTORY = new javax.swing.text.DefaultFormatterFactory();
    private static final java.text.DecimalFormat DOUBLE_FORMAT = new java.text.DecimalFormat(DOUBLE_PATTERN);

    static {
        DOUBLE_FORMATTER_FACTORY.setDefaultFormatter(new javax.swing.text.NumberFormatter(DOUBLE_FORMAT));
    }

}
