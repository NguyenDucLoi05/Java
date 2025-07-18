package OnTap;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao do dai mang:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap vao gia tri a[" + i + "]:");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("sau khi reverse:");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Mang sau khi dao nguoc:");
        Reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void Reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
