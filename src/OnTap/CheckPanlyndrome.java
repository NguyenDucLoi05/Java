package OnTap;

import java.util.Scanner;

public class CheckPanlyndrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi de check:");
        String str = sc.nextLine();
        String temp = new StringBuilder(str).reverse().toString();
        if (temp.equalsIgnoreCase(str)) {
            System.out.println("Day la Panlyndrome");
        } else System.out.println("khong phai Panlyndrome");
    }
}
