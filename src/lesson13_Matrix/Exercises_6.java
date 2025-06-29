package lesson13_Matrix;

import java.util.Scanner;

public class Exercises_6 {
    public static void main(String[] args) {
        //ve tam giac tren ben phai
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size matrix:");
        int size = sc.nextInt();
        System.out.println("Hinh Tam Giac tren ben phai trong matrix:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("\t");
            for (int j = 1; j <= size + 1 - i; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println();
        }
    }
}
