package OnTap;

import java.util.Scanner;

public class CalculateTheSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap so n:");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            if (n % 2 != 0 && n != 3) {
                sum += n;
            }
            n--;
            //thu break khi n = 3
            /*if (n % 2 != 0) {
                if (n == 3) continue;
                sum += n;
            }
            n--*/
        }
        System.out.println("tong le la " + sum);
    }
}
