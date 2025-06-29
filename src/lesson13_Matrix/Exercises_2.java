package lesson13_Matrix;

import java.util.Scanner;

public class Exercises_2 {
    public static void main(String[] args) {
        //ve N
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ti le cho ma tran vuong:");
        int size = sc.nextInt();
        System.out.println("Hinh N trong ma tran vuong!");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size || i == j)
                    System.out.print(i + "" + j + "\t");
                else System.out.print(" " + "\t");
            }
            System.out.println();
        }
    }
}
