package OnTap;

import java.util.Scanner;

public class UseWhileLoop {
    public static void main(String[] args) {
        //viet chuong trinh nhap vao so nguyen n,in ra ket qua n!
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen n:");
        int n = sc.nextInt();
        int sum = 1;
        while (n != 0) {
            sum *= n;
            n--;
        }
        System.out.println("Gia thua cua n: " + sum);
    }
}
