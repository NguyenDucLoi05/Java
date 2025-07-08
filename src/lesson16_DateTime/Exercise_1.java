package lesson16_DateTime;

import java.util.Calendar;

public class Exercise_1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int Year = cal.get(Calendar.YEAR);
        int Month = cal.get(Calendar.MONTH);
        int DayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("year:" + Year);
        System.out.println("month:" + (Month + 1));// thang chay tu 0-11 ne phai cong 1
        System.out.println("Day:" + DayOfMonth);
        System.out.println();
        cal.set(Calendar.YEAR, 2005);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 11);
        int NamSinh = cal.get(Calendar.YEAR);
        int ThangSinh = cal.get(Calendar.MONTH);
        int NgaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngay thang nam sinh:" +
                NgaySinh + "/"
                + (ThangSinh + 1) + "/"
                + NamSinh);
    }
}
