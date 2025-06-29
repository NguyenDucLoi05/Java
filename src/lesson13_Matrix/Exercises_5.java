package lesson13_Matrix;

import java.util.Scanner;

public class Exercises_5 {
    public static void main(String[] args) {
        //ve tam giac tren ben trai
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size matrix:");
        int size = sc.nextInt();
        System.out.println("Hinh Tam Giac tren ben trai trong matrix:");
        for (int i = size; i != 0; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println();
        }
    }
}
