/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.component.textfield.generator;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Channa
 */
public class GeneratorFactory {

    private static final Map<Class, Generator> GENERATOR_MAP = new HashMap<>();

    public static void registerGenerator(Class c, Generator generator) {
        GENERATOR_MAP.put(c, generator);
    }

    public static Generator getGenerator(Class c) {
        return GENERATOR_MAP.get(c);
    }

    static {
        //integer generator
        Generator<Integer> defaultIntegerGenerator = new Generator<Integer>() {

            @Override
            public Integer generateCValue() {
                return 0;
            }
        };
        registerGenerator(Integer.class, defaultIntegerGenerator);
        
        //double generator
        Generator<Double> defaultDoubleGenerator = new Generator<Double>() {

            @Override
            public Double generateCValue() {
                return 0.0;
            }
        };
        registerGenerator(Double.class, defaultDoubleGenerator);
        
        //string generator
        Generator<Date> defaultDateGenerator = new Generator<Date>() {

            @Override
            public Date generateCValue() {
                return new Date();
            }
        };
        registerGenerator(Date.class, defaultDateGenerator);
        
        //string generator
        Generator<String> defaultStringGenerator = new Generator<String>() {

            @Override
            public String generateCValue() {
                return "";
            }
        };
        registerGenerator(String.class, defaultStringGenerator);
    }
}
