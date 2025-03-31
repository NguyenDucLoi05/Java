package lesson06_SwitchCase;

import java.util.Scanner;

public class Exercises_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Tim Theo Ten");
        System.out.println("2. Tim Theo Tac Gia");
        System.out.println("3. Tim Theo Nha Xuat Ban");
        System.out.println("4. Tim Theo Tieu De");
        System.out.println("Vui Long Bam So De Chon:");
        int so = sc.nextInt();
        switch (so)
        {
            case 1:
                System.out.println("Chon Tim Theo Ten");
                break;
            case 2:
                System.out.println("Chon Tim Theo Nha Xuat Ban");
                break;
            case 3:
                System.out.println("Chon Tim Theo Tac Gia");
                break;
            case 4:
                System.out.println("Chon Tim Theo Tieu De");
                break;
            default:
                System.out.println("Phim Bam 0 Hop le");
                break;
        }
    }
}
