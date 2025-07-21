package OnTap;

import java.util.ArrayList;

public class ArrayList_4 {
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
        int max1 = -999, max2 = -1000, min1 = 999, min2 = 1000;
        for (int i = 0; i < lst.size(); i++) {

            if (lst.get(i) > max1) {
                max2 = max1;
                max1 = lst.get(i);
            } else if (lst.get(i) < min1) {
                min1 = lst.get(i);
                min2 = min1;
            }
        }
        if (max2 == -999) {
            System.out.println("khong co gia tri lon t2");
            return;
        }
        if (min2 == 999) {
            System.out.println("khong co gia tri nho thu 2");
            return;
        }
        for (int i = 0; i < lst.size(); i++) {
            if (max2 == lst.get(i)) {
                System.out.println("so lon thu 2:" + max2);
                System.out.println("vi tri:" + i);
            }
            if (min2 == lst.get(i)) {
                System.out.println("so nho thu 2:" + min2);
                System.out.println("vi tri:" + i);
            }
        }

    }
}
