package lesson04_Scanner;

import java.util.Scanner;

public class ScannerExercises_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu dai hinh chu nhat: ");
        double chieuDai = new Scanner(System.in).nextDouble();
        System.out.println("Nhap chieu rong hinh chu nhat: ");
        double chieuRong = new Scanner(System.in).nextDouble();
        System.out.println("Chieu dai la: " + chieuDai + " Chieu rong la: "+ chieuRong );

        double chuVi = (chieuDai + chieuRong) *2;
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi la: "+ chuVi);
        System.out.println("Dien tich la: "+ dienTich);
    }
}
