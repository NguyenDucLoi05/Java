package lesson04_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerJava {
    public static void main(String[] args) {
        //Khoi tao 1 doi tuong Scanner
        Scanner sc = new Scanner(System.in);

//        //Cho phep nhap chuoi
//        System.out.println("Moi nhap vao mk 1: ");
//        String mk1 = sc.nextLine();
//        System.out.println("Mat khau 1: "+ mk1);
//
//        //Nhap 1 so nguyen
//        System.out.println("Moi nhap vao 1 so nguyen: ");
//        int a = sc.nextInt();
//        System.out.println("So nguyen la: "+ a );
//
//        //Nhap 1 so thuc
//        System.out.println("Moi nhap vao 1 so thuc: ");
//        float b = sc.nextFloat();
//        System.out.println("So thuc la: "+b);
//
//        //Cho phep nhap chuoi
//        System.out.println("Moi nhap vao mk 2: ");
//        String mk2 = sc.nextLine();
//        System.out.println("Mat khau 1: "+ mk2);

        //Nhap chuoi cach khac loi!
        System.out.println("Moi nhap ten: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Ten la: " + ten);

        System.out.println("Moi nhap gioi tinh: ");
        String gt = new Scanner(System.in).nextLine();
        System.out.println("Gioi tinh " + gt);

        System.out.println("Moi nhap chieu cao: ");
        float cao = new Scanner(System.in).nextFloat();
        System.out.println("Chieu cao la: "+ cao);

        System.out.println("Moi nhap lai ten: ");
        String ten1 = new Scanner(System.in).nextLine();
        System.out.println("Ten la: "+ ten1);
    }
}
