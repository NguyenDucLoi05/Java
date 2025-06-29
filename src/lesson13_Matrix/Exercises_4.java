package lesson13_Matrix;

import java.util.Scanner;

public class Exercises_4 {
    public static void main(String[] args) {
        //ve tam giac duoi ben trai
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size matrix:");
        int size = sc.nextInt();
        System.out.println("Hinh Tam Giac Duoi ben trai trong matrix:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i-1; j++) {
                    System.out.print(i + "" + j + "\t");
            }
            System.out.println();
        }
    }
}
