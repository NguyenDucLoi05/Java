package OnTap;

import java.util.Scanner;

public class Use_ForLoop {
    public static void main(String[] args) {
        //viet chuong trinh nhap vao so nguyen n,in ra ket qua n!
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen n:");
        int n = sc.nextInt();
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        System.out.println("n=" + n);
    }
}
