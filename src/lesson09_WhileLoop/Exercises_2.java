package lesson09_WhileLoop;

import java.util.Scanner;

public class Exercises_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi Nhap Vao 1 So Nguyen Tu 1 -> 99: ");
        int soNguyen = sc.nextInt();
        while(soNguyen<1||soNguyen>99)
        {
            System.out.println("Nhap Lai SO Nguyen, So Nguyen Chi Duoc Phep Tu 1 -> 99:");
            soNguyen = sc.nextInt();
        }
        System.out.println("Ban Da Nhap So Nguyen: "+soNguyen);
    }
}
