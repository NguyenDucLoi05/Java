package OnTap;

import java.util.Scanner;

public class Check_Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap So N:");
        int num = sc.nextInt();
        int pre = num;
        int reversed = 0;
        boolean isNegative = num < 0;
        if(isNegative)
        {
            System.out.println(num + " is not Palindrome");
            return;
        }
        while(pre != 0)
        {
            reversed = reversed*10 + pre%10;
            pre /=10;
        }
        if (reversed == num)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
        sc.close();
    }
}
