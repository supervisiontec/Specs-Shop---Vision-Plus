package com.sv.visionplus.util.account;

/**
 *
 * @author Mohan
 */
//XXX:Nidura
public class AccountUtil {

    //singleton init AccountUtil
    private static AccountUtil INSTANCE;

    public static AccountUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AccountUtil();
        }

        return INSTANCE;
    }
}
