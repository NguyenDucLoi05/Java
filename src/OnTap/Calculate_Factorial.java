package OnTap;

import java.util.Scanner;

public class Calculate_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap Vao 1 So Nguyen:");
        int soNguyen = sc.nextInt();
        boolean isPrime = soNguyen<0;
        if (isPrime){
            System.out.println("Factorial is not defined for negative numbers.");
            return;}
        int pre = Recrusion(soNguyen);
        System.out.println("Factorial Of" + soNguyen + " is: " + pre);
        sc.close();
    }
    public static int Recrusion(int num){
        if(num==0)
            return 1;
        return num * Recrusion(num-1);
    }
}
