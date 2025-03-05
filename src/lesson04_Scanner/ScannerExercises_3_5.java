package lesson04_Scanner;

import java.util.Scanner;

public class ScannerExercises_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap Gia Tri a:");
        float a = sc.nextFloat();;
        System.out.println("Hay Nhap Gia Tri b:");
        float b = sc.nextFloat();
        System.out.println("Hay Nhap Gia Tri c:");
        float c = sc.nextFloat();

        double delta = Math.pow(b,2)-(4*a*c);
        if(delta>0)
        {
            System.out.println("Phuong Trinh Co 2 Nghiem Phan Biet");
            float x1 = (float)(-b+Math.sqrt(delta))/2;
            float x2 = (float)(-b-Math.sqrt(delta))/2;
            System.out.println("Nghiem x1 = "+x1);
            System.out.println("Nghiem x2 = "+x2);
        }
        else if (delta==0)
        {
            System.out.println("Phuong Trinh Co Nghiem Kep");
            float x = (float)(-b/2*a);
            System.out.println("Nghiem x1 = x2 = "+x);
        }
        else System.out.println("Phuong Trinh Vo Nghiem");
    }
}
