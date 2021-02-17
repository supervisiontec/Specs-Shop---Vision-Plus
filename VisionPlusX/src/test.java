
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

class Example {

    private static final String SERIAL_SPECIAL_CHAR_GIFT_VOUCHER = "GV";
    private static final String SERIAL_SPECIAL_CHAR_DISCOUNT_VOUCHER = "DV";

    public static String newGenaratedGiftVoucherSerial(Integer transactionNo, BigDecimal amount) {
        //String amountFormat = String.format("%05d", amount.intValue());
        String transactionNoFormat = String.format("%06d", transactionNo);
        Date date = new Date(); // your date
        String y = "20";
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Colombo"));
        cal.setTime(date);
        String year = String.valueOf(cal.get(Calendar.YEAR));
        y = year.substring(2, 4);
        return SERIAL_SPECIAL_CHAR_GIFT_VOUCHER + y + transactionNoFormat;
    }
    public static void main(String args[]) {
        String newGenaratedGiftVoucherSerial = newGenaratedGiftVoucherSerial(2, new BigDecimal(BigInteger.ONE));
        System.out.println("newGenaratedGiftVoucherSerial");
        System.out.println(newGenaratedGiftVoucherSerial);
    }

}
