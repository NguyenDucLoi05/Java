package OnTap;

import java.util.Scanner;

public class CalculateTheSumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            int sum = 0;
            for (int i = 0; i <= a; i += 2) {
                sum += i;
            }
            System.out.println("tong chan tu 0 den " + a + " la " + sum);
        } else System.out.println("toi khong tinh tong le, bye bye!");
    }
}
