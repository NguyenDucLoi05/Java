package lesson04_Scanner;

import java.util.Scanner;

public class ScannerExercises_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Thang Bat Ky:");
        int thang = sc.nextInt();
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                System.out.println("Thang Co 31 Ngay");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("Thang Co 30 Ngay");
                break;
            }
            case 2:
            {
                System.out.println("Nhap Nam De Xac Dinh:");
                int Nam = sc.nextInt();
                if((Nam%4==0)&&(Nam%100!=0)||(Nam%400==0))
                    System.out.println("Day La Nam Nhuan Nen Thang 2 Co 29 Ngay");
                else System.out.println("Day La Nam Khong Nhuan Nen Thang 2 Co 28 Ngay");
            }
        }
    }
}
