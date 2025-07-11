package lesson19_TheCharDataType;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        //khai bao
        char ch = 'a';//khoi tao
        char ch2 = 66;//khoi tao
        System.out.println(ch2);
        char ch3;//khai bao
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 ky tu:");
        String a = sc.nextLine();
        char ch4 = a.charAt(0);
        System.out.println("ky tu vua nhap la:" + ch4);
    }
}
