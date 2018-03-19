/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.base.transaction;

import com.sv.visionplus.system.exception.VPException;

/**
 *
 * @author Mohan
 */
public abstract class AbstractTransactionFormService<T> {

    protected abstract T select(Integer indexNo) throws VPException;

    protected abstract void save(T object) throws VPException;

    protected abstract void update(T object) throws VPException;

    protected abstract void delete(T object) throws VPException;
}
