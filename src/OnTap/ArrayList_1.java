package OnTap;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_1 {
    public static void main(String[] args) {
        Random number = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size cho ArrayList:");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(number.nextInt(100));
        }
        System.out.println(list);
    }
}
