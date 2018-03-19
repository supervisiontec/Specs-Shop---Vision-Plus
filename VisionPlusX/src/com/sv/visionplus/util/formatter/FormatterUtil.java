package com.sv.visionplus.util.formatter;

import java.sql.Time;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mohan
 */
public class FormatterUtil {

    //formatters
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#,##0.00");
    private static final DecimalFormat INTEGER_FORMAT = new DecimalFormat("#,##0");
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    //singleton instance
    private static FormatterUtil INSTANCE;

    public static FormatterUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FormatterUtil();
        }

        return INSTANCE;
    }

    //functions
    public String formatDouble(Double d) {
        return DECIMAL_FORMAT.format(d);
    }

    public String formatInteger(Integer i) {
        return INTEGER_FORMAT.format(i);
    }

    public String formatDate(Date d) {
        return DATE_FORMAT.format(d);
    }
    

    public Double parseDouble(String s) throws ParseException {
        return (Double) DECIMAL_FORMAT.parse(s);
    }

    public Integer parseInteger(String s) throws ParseException {
        return (Integer) INTEGER_FORMAT.parse(s);
    }

    public Date parseDate(String s) throws ParseException {
        return (Date) DATE_FORMAT.parse(s);
    }
   
    public String getTime(){
        return new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    }

}
