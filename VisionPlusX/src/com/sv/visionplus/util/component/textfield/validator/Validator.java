/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.component.textfield.validator;

import java.util.Date;

/**
 *
 * @author Mohan
 */
public interface Validator<V> {

    public enum ValidationLevel {

        ERROR,
        WARN,
        SUCCESS,
        NONE
    }

    public ValidationLevel isValid(V value);

    public static Validator STRING_VALIDATOR = new Validator<String>() {

        @Override
        public ValidationLevel isValid(String value) {
            if (value == null) {
                return ValidationLevel.ERROR;
            } else if (value.isEmpty()) {
                return ValidationLevel.WARN;
            } else {
                return ValidationLevel.SUCCESS;
            }
        }
    };

    public static Validator INTEGER_VALIDATOR = new Validator<Integer>() {

        @Override
        public ValidationLevel isValid(Integer value) {
            if (value == null) {
                return ValidationLevel.ERROR;
            } else if (value == 0) {
                return ValidationLevel.WARN;
            } else {
                return ValidationLevel.SUCCESS;
            }
        }
    };

    public static Validator DECIMAL_VALIDATOR = new Validator<Double>() {

        @Override
        public ValidationLevel isValid(Double value) {
            if (value == null) {
                return ValidationLevel.ERROR;
            } else if (value == 0.0) {
                return ValidationLevel.WARN;
            } else {
                return ValidationLevel.SUCCESS;
            }
        }
    };

    public static Validator DATE_VALIDATOR = new Validator<Date>() {
        @Override
        public ValidationLevel isValid(Date value) {
            if (value == null) {
                return ValidationLevel.ERROR;
            } else {
                return ValidationLevel.SUCCESS;
            }
        }
    };

}
