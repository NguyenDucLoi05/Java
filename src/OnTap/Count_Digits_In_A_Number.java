package OnTap;

import java.util.Scanner;

public class Count_Digits_In_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap 1 So Nguyen ");
        int soNguyen = sc.nextInt();
        int count = 0, pre = soNguyen;
        while(pre!=0){
            pre /=10;
            count++;
        }
        System.out.println("So Luong Chu So La: " + count);
    }
}
