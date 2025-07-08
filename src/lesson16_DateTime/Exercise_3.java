package lesson16_DateTime;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        //viet chuong trinh nhap vao ngay thang nam sinh, cho biet co tuoi va in ra man hinh
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println();
        int day, month, year, date;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay sinh:");
        day = sc.nextInt();
        System.out.println("Nhap thang sinh");
        month = sc.nextInt();
        System.out.println("Nhap nam sinh");
        year = sc.nextInt();
        cal.set(year, month - 1, day);
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngay thang nam sinh:"
                + ngaySinh + "/"
                + (thangSinh+1) + "/"
                + namSinh);
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        date = namHienTai - namSinh;
        System.out.println("tuoi tho nam nay la:" + date);
    }
}
