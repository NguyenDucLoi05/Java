package lesson04_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExercises_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Chieu Cao (m):");
        float chieuCao = sc.nextFloat();
        System.out.println("Nhap Can Nang (kg):");
        float canNang = sc.nextFloat();
        double BMI = canNang/(Math.pow(chieuCao,2));
        System.out.println("BMI Cua Ban La: "+BMI);

        if (BMI>=35)
            System.out.println("Than Hinh Qua Beo");
        else if (BMI>=30)
            System.out.println("Than Hinh Beo");
        else if (BMI>=25)
            System.out.println("Than Hinh Hoi Beo");
        else if (BMI>=18.5)
            System.out.println("Than Hinh Binh Thuong");
        else if (BMI>=16)
            System.out.println("Than Hinh Hoi Gay");
        else if (BMI>=15)
            System.out.println("Than Hinh Gay");
        else
            System.out.println("Than Hinh Qua Gay");
    }
}
