package lesson04_Scanner;

import java.util.Scanner;

public class ScannerExercises_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap Thang:");
        int thang = sc.nextInt();
        switch (thang)
        {
            case 1:
            case 2:
            case 3:
            {
                System.out.println("Quy 1");
                break;
            }
            case 4:
            case 5:
            case 6:
            {
                System.out.println("Quy 2");
                break;
            }
            case 7:
            case 8:
            case 9:
            {
                System.out.println("Quy 3");
                break;
            }
            case 10:
            case 11:
            case 12:
            {
                System.out.println("Quy 4");
                break;
            }
        }
    }
}
