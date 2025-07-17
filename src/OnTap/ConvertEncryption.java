package OnTap;

import java.util.Scanner;

public class ConvertEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        System.out.println(a);
        System.out.println(b);
        System.out.println("Moi nhap vao chuoi can ma hoa:");
        String chuoi = sc.nextLine();
        String temp = "";
        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);
            int index = a.indexOf(c);
            if (index == -1)
                temp += chuoi;
            else
                temp += b.charAt(index);
        }
        System.out.println("sau khi ma hoa la: " + temp);
    }
}
