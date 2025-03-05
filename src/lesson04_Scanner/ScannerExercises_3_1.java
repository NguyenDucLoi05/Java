package lesson04_Scanner;

import java.util.Scanner;

public class ScannerExercises_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Tong:");
        double Tong = sc.nextDouble();
        System.out.println("Nhap Hieu:");
        double  Hieu = sc.nextDouble();

        double x,y;
        x = (Tong + Hieu) /2;
        y = Tong - x;
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
    }
}
