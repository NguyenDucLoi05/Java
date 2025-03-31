package OnTap;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Vao So Nguyen N:");
        int soNguyen = sc.nextInt();
        int sum = 0;
        while(soNguyen!=0)
        {
            sum += soNguyen%10;
            soNguyen /=10;
        }
        System.out.println("Sum Of Digits is" + sum);
        sc.close();
    }
}
