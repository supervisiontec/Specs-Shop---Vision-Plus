/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.birthday;

//import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateBirthday {

    String id = "";
    int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int mainYear=0;

    public CreateBirthday() {
    }

    public CreateBirthday(String id) {
        if (id.length()>10) {
            this.id=id.substring(2);
            mainYear=2000;
        }else{
            this.id = id;
            mainYear=1900;
            
        }
  
    }

    public int getYear() {
        return (mainYear + Integer.parseInt(id.substring(0, 2)));
    }

    public void setNIC(String id) {
        this.id = id;
    }

    public int getDays() {
        int d = Integer.parseInt(id.substring(2, 5));
        if (d > 500) {
            return (d - 500);
        } else {
            return d;
        }
    }

    public boolean getMonthDate() {
        int mo = 0, da = 0;
        int days = getDays();

        for (int i = 0; i < month.length; i++) {
            if (days < month[i]) {
                mo = i + 1;
                da = days;
                break;
            } else {
                days = days - month[i];
            }
        }
        SimpleDateFormat sdfDate = new SimpleDateFormat("MM");//dd/MM/yyyy
        Date now = new Date();
        int month = Integer.parseInt(sdfDate.format(now));
        if (mo == month) {
            SimpleDateFormat Date = new SimpleDateFormat("dd");//dd/MM/yyyy
            int date = Integer.parseInt(Date.format(now));
            if (da==date) {
                return true;
            }
        }
        return false;

    }

    public boolean isBirthDay() {
        if (getMonthDate()) {
            return true;
        }
        return false;
    }

    public String getSex() {
        String M = "Male", F = "Female";
        int d = Integer.parseInt(id.substring(2, 5));
        if (d > 500) {
            return F;
        } else {
            return M;
        }
    }

    public static void main(String[] args) {
        CreateBirthday N = new CreateBirthday("19933013650V");
//        N.setNIC("933013650V");
        System.out.println("Your Deatials of Date of Birth from NIC Number");
        System.out.println("Year : " + N.getYear());
        System.out.println(N.getMonthDate());
        System.out.println("Sex : " + N.getSex());
        System.out.println(N.isBirthDay());
    }
}
