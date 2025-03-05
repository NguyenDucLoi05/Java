package lesson04_Scanner;

import java.util.Scanner;

public class ScannerExercises_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 Nam Duong Lich: ");
        int Nam = sc.nextInt();
        if((Nam%4==0)&&(Nam%100!=0)||(Nam%400==0))
            System.out.println("Day La Nam Nhuan");
        else
            System.out.println("Day La Nam Khong Nhuan");
    }
}
