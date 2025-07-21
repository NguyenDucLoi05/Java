package lesson22_ArrayListAndHashmap;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exercise_1 {
    public static void main(String[] args) {
        ArrayList<Integer> alr = new ArrayList<>();
        alr.add(5);
        alr.add(4);
        alr.add(2);
        alr.add(0);
        System.out.println(alr);
        System.out.println("do dai:"+alr.size());
        System.out.println("gia tri list tai 2:"+alr.get(2));
        alr.remove(2);
        System.out.println(alr);
        alr.remove(Integer.valueOf(5));
        System.out.println(alr);
        alr.set(1,99);
        System.out.println(alr);
        if(alr.contains(99))
            System.out.println("co");
        else System.out.println("ko");
        Collections.sort(alr);
        System.out.println(alr);
        Collections.reverse(alr);
        System.out.println(alr);
        alr.clear();
        System.out.println(alr);
    }
}
