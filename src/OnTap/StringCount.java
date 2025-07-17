package OnTap;

import java.sql.SQLOutput;

public class StringCount {
    public static void main(String[] args) {
        String a = "toi cham hoc toi chiu kho toi dep zai";
        System.out.println(a);
        int count = 0;
        String[] word = a.split(" ");
        for (String tu : word) {
            if (tu.equals("toi"))
                count++;
        }
        System.out.println("Co " + count + " tu toi trong cau tren!");
    }
}
