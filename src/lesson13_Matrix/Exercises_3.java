package lesson13_Matrix;

import java.util.Scanner;

public class Exercises_3 {
    public static void main(String[] args) {
        //ve hinh vuong
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size matrix:");
        int size = sc.nextInt();
        System.out.println("Hinh Vuong trong matrix:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size || i == 1 || i == size)
                    System.out.print(i + "" + j + "\t");
                else System.out.print(" " + "\t");
            }
            System.out.println();
        }
    }
}
