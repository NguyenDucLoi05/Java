package OnTap;

import java.util.Scanner;

public class SeparateNumbersAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi so va chu de tach:");
        String chuoi = sc.nextLine();
        StringBuilder kyTu = new StringBuilder();
        StringBuilder so = new StringBuilder();
        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);
            if (Character.isLetter(c))
                kyTu.append(c);
            else if (Character.isDigit(c))
                so.append(c);
            else continue;
        }
        System.out.println("chuoi sau khi tach la:");
        System.out.println("ky tu: " + kyTu);
        System.out.println("so: " + so);
    }
}
