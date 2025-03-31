package OnTap;

import java.util.Scanner;

public class Find_nth_Fibonaci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So Nguyen:");
        int soNguyen = sc.nextInt();
        boolean isNegative = soNguyen <0;
        if(isNegative)
        {
            System.out.println("Cann't Find Fibonaci");
            return;
        }
        System.out.println("Fibonaci Of Number is " + Fibonaci(soNguyen));
        sc.close();
    }
    public static int Fibonaci (int num){
        if(num==0)
            return 0;
        if (num==1)
            return 1;
        return Fibonaci(num-1)+Fibonaci(num-2);
    }
//    public static int Fibonaci(int num){
//        if(num==0)
//            return 0;
//        if(num==1)
//            return 1;
//        int pre = 0,curr = 1;
//        for(int i=2;i<=num;i++){
//            int next = pre + curr;
//            pre = curr;
//            curr = next;
//        }
//        return curr;
//    }
}

