package OnTap;

import java.util.Scanner;

public class Find_Greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap So Thu Nhat: ");
        int so1 = sc.nextInt();
        System.out.println("Hay Nhap So Thu Hai: ");
        int so2 = sc.nextInt();
        boolean isNegative1 = so1 <0;
        boolean isNegative2 = so2 <0;
        if (isNegative2)
        {
            System.out.println("Khong The Tim Uoc Chung So Am");
            return;
        }
        if (isNegative2)
        {
            System.out.println("Khong The Tim Uoc Chung So Am");
            return;
        }
        while (so1 != so2) {
            if (so1 > so2)  so1 -= so2;
             else so2 -= so1;
        }
        System.out.println("GCD Of Number 1 and 2 is: "+ so1);
    }
}
