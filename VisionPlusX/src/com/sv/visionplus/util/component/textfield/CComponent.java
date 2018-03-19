/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.component.textfield;

import com.sv.visionplus.util.component.textfield.generator.Generator;
import com.sv.visionplus.util.component.textfield.validator.Validator;

/**
 *
 * @author Mohan
 */
public interface CComponent<V> {

    //value generation
    /**
     * The generator is used to generate values according to specific logic. The
     * default value generator generates and sets the value to the component
     * when it calls resetCValue method. Use this method to set the default
     * value generator to the component.
     *
     * @param generator
     */
    public void setDefaultValueGenerator(Generator<V> generator);

    /**
     * Returns the default value generator of the component.
     *
     * @return
     */
    public Generator<V> getDefaultValueGenerator();

    //value
    /**
     * The CValue is the represented value of the component. This method returns
     * the current value of the component.
     *
     * @return
     */
    public V getCValue();

    /**
     * Sets the CValue which is the current value of the component.
     *
     * @param value
     */
    public void setCValue(V value);

    /**
     * It resets the value of the component. It uses the default value generator
     * to generate the default value for the component.
     */
    public void resetCValue();

    /**
     * It changes the current editable status of the component. The use cannot
     * modify when it is false.
     *
     * @param status
     */
    public void setCValueEditable(boolean status);

    /**
     * Returns the current editable status of the component.
     *
     * @return
     */
    public boolean isCValueEditable();

    //validation
    /**
     * Validator is use to check the current component value is acceptable to
     * process. The validator is returns using this method.
     *
     * @return
     */
    public Validator<V> getValidator();

    /**
     * It sets the current validator of the component.
     *
     * @param validator
     */
    public void setValidator(Validator<V> validator);

    /**
     * This method is used to check the current value of the component is
     * useable to process. The validator has three different status such ERROR,
     * WARN, and SUCCESS. It returns true when validator return SUCCESS or WARN.
     * The component value is not acceptable when the validation output is
     * ERROR.
     *
     * @return
     */
    public boolean isCValueValid();

    public void setEssential(boolean status);

    public boolean isEssential();
}
