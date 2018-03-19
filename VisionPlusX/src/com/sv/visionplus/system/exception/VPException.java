/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.system.exception;

/**
 *
 * @author Mohan
 */
public class VPException extends Exception {

    public VPException(String message) {
        super(message);
    }

    public VPException(String message, Throwable cause) {
        super(message, cause);
    }

}
