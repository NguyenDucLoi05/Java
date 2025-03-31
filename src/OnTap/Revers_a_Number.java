package OnTap;

import java.util.Scanner;

public class Revers_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap 1 So Nguyen:");
        int soNguyen = sc.nextInt();
        int reversed = 0;
        boolean isNegative = soNguyen < 0; //Check if the number is negative

        //Handle Negative Number
        if(isNegative)
            soNguyen = -soNguyen;

        //Reverse the Number
        while(soNguyen!=0) {
            reversed = reversed*10 + soNguyen%10;
            soNguyen/=10;
        }
        //If the Original Number Was Negative, Add The Negative Sign Back
        if (isNegative)
            reversed = -reversed;
        System.out.println("The Reversed Number is " + reversed);
        sc.close();
    }
}
