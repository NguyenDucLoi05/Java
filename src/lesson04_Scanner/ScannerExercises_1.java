package lesson04_Scanner;

import java.util.Scanner;

public class ScannerExercises_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh cua hinh tron: ");
        double banKinh= new Scanner(System.in).nextDouble();
        System.out.println("Ban kinh vua nhap la: "+ banKinh);
        System.out.println("Nhap vao chieu cao cua hinh tron: ");
        double chieuCao= new Scanner(System.in).nextDouble();
        System.out.println("Chieu cao vua nhap la: "+ chieuCao);
        double chuVi = 2*Math.PI*banKinh;
        double dienTich = Math.PI*Math.pow(banKinh,2);
        double theTich = 2*Math.PI*banKinh*chieuCao;

        System.out.println("Chu vi la: "+ chuVi);
        System.out.println("Dien tich la: "+ dienTich);
        System.out.println("The tich la: "+ theTich);

    }
}
