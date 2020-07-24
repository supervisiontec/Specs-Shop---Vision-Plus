
import java.util.*;

class Example {

    public static void main(String args[]) {
        Date date = new Date(); // your date
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        cal.setTime(date);
        String year = String.valueOf(cal.get(Calendar.YEAR));
        System.out.println(year.substring(2, 4));
    }

}
