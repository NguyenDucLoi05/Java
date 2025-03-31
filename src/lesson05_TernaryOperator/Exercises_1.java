package lesson05_TernaryOperator;

import java.util.Scanner;

public class Exercises_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi Nhap Vao So Nguyen:");
        int n = sc.nextInt();
        String traloi = (n%2==0) ? "Chan":"Le";
        System.out.println(traloi);
    }
}
