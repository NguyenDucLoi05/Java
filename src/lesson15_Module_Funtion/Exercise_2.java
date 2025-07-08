package lesson15_Module_Funtion;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        String kq = PhuongTrinhBac2(1, 2, 3);
        String kq1 = PhuongTrinhBac2(1, 2, 1);
        String kq2 = PhuongTrinhBac2(1, 2, -3);
        System.out.println(kq);
        System.out.println(kq1);
        System.out.println(kq2);

        // gianh cho nguoi dung
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap gia tri a:");
        double a = sc.nextDouble();
        System.out.println("Hay nhap gia tri b:");
        double b = sc.nextDouble();
        System.out.println("Hay nhap gia tri c:");
        double c = sc.nextDouble();
        String kq4 = PhuongTrinhBac2(a, b, c);
        System.out.println(kq4);
    }

    public static String PhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0 && c == 0)
                return "pt co vo so nghiem";
            else if (b == 0 && c != 0) {
                return "pt vo nghiem";
            } else return "pt co nghiem: " + (-c / b);
        } else {
            double delta = (b * b) - (4 * a * a * c);
            if (delta < 0)
                return "pt vo nghiem";
            else if (delta == 0) {
                double x = -b / (2 * a);
                return "pt co nghiem kep: " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "pt bac 2 co 2 nghiem phan biet la: " + x1 + " va " + x2;
            }
        }
    }
}
