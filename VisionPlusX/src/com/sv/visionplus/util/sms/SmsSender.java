/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.sms;

import com.sv.visionplus.channel.channel_register.model.ChannelModelMix;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Supervision
 */
public class SmsSender {

    public static int messageSendForInvoice(String name, String mobile) {
        String message = name + "...Thank you for being our valued customer.vision plus opticians,No 24,NebodaRoad,Mathugama.TP 0342247466";
//            String APIKEY = "585bc4616167e";
        String correctMessage = message.replace(" ", "%20");
        if (mobile.length() == 11) {
            if ("94".equals(mobile.substring(0, 2))) {
                if ("7".equals(mobile.substring(2, 3))) {
                    return sender(mobile, correctMessage);
                }
            }
        }
        return -1;
    }

    public static int messageSendForOneNumber(String mobile, String message) {
        String messages = message;
        String correctMessage = messages.replace(" ", "%20");
//            String APIKEY = "585bc4616167e";
        if (mobile.length() == 11) {
            if ("94".equals(mobile.substring(0, 2))) {
                if ("7".equals(mobile.substring(2, 3))) {
                    return sender(mobile, correctMessage);
                }
            }
        }
        return -1;
    }

    public static int messageSendForListOfNumber(String mobile, String message) {
        String messages = message;
        String correctMessage = messages.replace(" ", "%20");
//            String APIKEY = "585bc4616167e";

        return sender(mobile, correctMessage);

    }

    public static int messageSendForAll(List<String> mobileList, String message) {
//        String messages = message;
        String correctMessage = message.replace(" ", "%20");
        List<String> newList = mobileList;
        int count = 0;
        String correctNumberList = "";
        for (String number : newList) {
            if ("94".equals(number.substring(0, 2))) {
                if ("7".equals(number.substring(2, 3))) {
                    correctNumberList += number + ",";
                    count++;
                }
            }
        }
        correctNumberList += "\b";
        int sender = sender(correctNumberList, correctMessage);
        if (sender == 200) {
            return count;
        }
//            String APIKEY = "585bc4616167e";

        return -1;

    }

    public static int sender(String mobile, String message) {
        try {
            String apikey = "2380250890";

            String URL = "http://smsserver.svisiontec.com/send_sms.php?api_key="+apikey+"&number="+mobile+"&message="+message;
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

    public static int messageSendForChannel(ChannelModelMix mix) {
        String message = "Thank you for payment received." + mix.getPatientName() + ",Time:" + mix.getTime() + "," + mix.getChannelDate() + ",Vision Plus Eye Clinic Dr.Chameera Bandara,Channel No:" + mix.getChannelId() + "No refund,No Cancellation.";
//            String APIKEY = "585bc4616167e";
        String correctMessage = message.replace(" ", "%20");
        String mobile = mix.getMobile();
        if (mobile.length() == 11) {
            if ("94".equals(mobile.substring(0, 2))) {
                if ("7".equals(mobile.substring(2, 3))) {
                    return sender(mobile, correctMessage);
                }
            }
        }
        return -1;
    }

    public static int messageSendForChecking(String name, String mobile) {
        String message = name + "...The Order you Placed with Vision Plus Opticians Matugama, is ready for Collection.Thanks";
//            String APIKEY = "585bc4616167e";
        String correctMessage = message.replace(" ", "%20");
        if (mobile.length() == 11) {
            if ("94".equals(mobile.substring(0, 2))) {
                if ("7".equals(mobile.substring(2, 3))) {
                    return sender(mobile, correctMessage);
                }
            }
        }
        return -1;
    }
}
