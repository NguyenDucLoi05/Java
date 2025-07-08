package lesson16_DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Exercise_2 {
    public static void main(String[] args) {
        //XUAT DINH DANG NGAY/THANG/NAM GIO/PHUT/GIAY
        //Tao 1 doi tuong SimpleDateFormat vs chuoi dinh dang dd/MM/yyyy
        //Can import Java.text.SimpleDateFormat
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //Tao 1 doi tuong DateGet thoi gian bien cal
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        Date date =cal.getTime();
        //Chuyen doi ngay thanh chuoi dinh dang dd/MM/yyyy va in ra man hinh
        String formattedDate = dinhDang.format(date);
        System.out.println(formattedDate);
    }
}
