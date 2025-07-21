package OnTap;

import java.util.ArrayList;

public class ArrayList_4_1 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(9);
        lst.add(3);
        lst.add(14);
        lst.add(5);
        lst.add(27);
        lst.add(8);
        System.out.println(lst);
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MIN_VALUE;
        for (int num : lst) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (min2 > num && num > min1) {
                min2 = num;
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("khong co gia tri lon t2");
        } else {
            System.out.println("so lon thu 2:" + max2);
            System.out.println("vi tri:" + lst.indexOf(max2));
        }
        if (min2 == Integer.MAX_VALUE) {
            System.out.println("khong co gia tri nho thu 2");
        } else {
            System.out.println("so nho thu 2:" + min2);
            System.out.println("vi tri:" + lst.indexOf(min2));
        }
    }
}
