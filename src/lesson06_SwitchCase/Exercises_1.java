package lesson06_SwitchCase;

import java.util.Scanner;

public class Exercises_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi Nhap 1 So:");
        int a = sc.nextInt();
        int div = a%2;
        switch (div)
        {
            case 0:
                System.out.println(a+" La So Chan");
                break;
            default:
                System.out.println(a+" La So Le");
                break;
        }
    }
}
