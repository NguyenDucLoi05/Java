package OnTap;

import java.util.Scanner;

public class Find_The_Largest_Element_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So Luong Phan Tu Cho Mang:");
        int soLuong = sc.nextInt();
        int[] Array = new int[soLuong];
        System.out.println("Nhap Cac Phan Tu Cho Mang:");
        for(int i=0;i<soLuong;i++){
            Array[i]= sc.nextInt();
        }

        int max = Array[0];
        for(int i =1;i<soLuong;i++)
        {
            if(Array[i]>max)
                max = Array[i];
        }
        System.out.println("The Largest Element In Array is: "+ max);
    }
}
