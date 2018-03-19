/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.money_collection;

import com.sv.visionplus.account.money_collection.model.MAccount;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;

/**
 *
 * @author KAZA
 */
public class MoneyCollectionForm extends AbstractTransactionForm<MAccount>{

    @Override
    protected AbstractTransactionFormService<MAccount> getTransactionFormService() {
        return new MoneyCollectionService();
    }

    @Override
    protected AbstractObjectCreator<MAccount> getObjectCreator() {
        return new PCMoneyCollection(this);
    }
    
}
