package OnTap;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang:");
        int size = sc.nextInt();
        int[] array = new int[size];
        Random number = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = number.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Mang sau khi Reverse:");
        Reverse(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Mang sau khi sap xep (tang dan):");
        Arrays.sort(array);
        ;
        System.out.println(Arrays.toString(array));
        System.out.println("Tong cac phan tu trong mang la:" + sum(array));
        System.out.println("Hay nhap 1 gia tri de kiem tra:");
        int temp = sc.nextInt();
        indexInArray(array, temp);
    }

    public static boolean checkNumberInArray(int array, int temp) {
        boolean plag = false;
        if (array == temp)
            plag = true;
        return plag;
    }

    public static void indexInArray(int[] array, int temp) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkNumberInArray(array[i], temp)) {
                System.out.println("Cac vi tri ma gia tri bang vs gia tri trong mang la:");
                System.out.print(i + "\t");
            } else {
                count++;
            }
        }
        if (count == 5)
            System.out.println("khong tim thay gia tri trong mang!");
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void Reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
