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
public class CStringField extends CTextField<String> {

    @Override
    protected void initalize() {
        //set default generator
        setDefaultValueGenerator(GeneratorFactory.getGenerator(String.class));
        
        //set validator
        setValidator(Validator.STRING_VALIDATOR);
        
        //reset cvalue
        resetCValue();
    }

    @Override
    protected boolean isValidInput(String text) {
        return true;
    }

    @Override
    protected void focusGainedComponent(FocusEvent event) {
        selectAll();
    }

    @Override
    public String getCValue() {
        return getText();
    }

}
