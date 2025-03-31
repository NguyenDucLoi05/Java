package OnTap;

import java.util.Scanner;

public class Check_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi Nhap Vao 1 So Nguyen N: ");
        int soNguyen = sc.nextInt();

        if (isPrime(soNguyen))
        {
            System.out.println(soNguyen + " is a Prime number");
        } else
        {
            System.out.println(soNguyen + " is not a Prime number");
        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

