package OnTap;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size cho ArrayList:");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random number = new Random();
        for (int i = 0; i < size; i++) {
            list.add(number.nextInt(15));
        }
        System.out.println(list);
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < size; i++) {

            newList.add(list.get(i) * list.get(i));
        }
        System.out.println(newList);
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (newList.get(i) > 50)
                count++;
            else continue;
        }
        System.out.println("co " + count + " lon hon 50!");
    }
}
