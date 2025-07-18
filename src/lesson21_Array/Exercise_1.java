package lesson21_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("a[" + i + "]:");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
