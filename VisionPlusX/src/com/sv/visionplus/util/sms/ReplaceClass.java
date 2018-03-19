/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.sms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Supervision
 */
public class ReplaceClass {
    
    public static int sender(String mobile, String message) {
        try {
            String NAME = "9494201701169";
            String PASSWORD = "3873";
            String MOBILE_NUMBER = mobile;
            String MESSAGE = message;

            String URL = "http://www.svisiontec.com/sms/sms.php?name="
                    + NAME + "&password="
                    + PASSWORD + "&to="
                    + MOBILE_NUMBER + "&text="
                    + MESSAGE;
            URL url = new URL(URL);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            return code;

        } catch (MalformedURLException ex) {
            Logger.getLogger(SmsSender.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (IOException ex) {
            Logger.getLogger(SmsSender.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    public static void main(String[] args) {
        sender("94711727579", "Message_send-successfully.............");
    }
}
