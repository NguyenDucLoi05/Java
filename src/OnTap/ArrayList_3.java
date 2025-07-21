package OnTap;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap size cho ArrayList:");
        int size = sc.nextInt();
        Random number = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < size; i++) {
            list.add(number.nextInt(100));
            if (list.get(i) < 80) {
                count++;
            }
        }
        System.out.println(list);
        System.out.println("Co " + count + " so nho hon 80");
        if (count == 0)
            return;
        System.out.println("Vi tri index cac so do la:");
        for (int i = 0; i < size; i++) {
            if (list.get(i) < 80)
                System.out.print(i + "\t");
        }
    }
}
