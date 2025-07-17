package OnTap;

import java.util.Calendar;
import java.util.Scanner;

public class CheckPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap pass:");
        String pass = sc.nextLine();
        int count = 5;
        do {
            if (check(pass)) {
                System.out.println("mo cua");
                break;
            } else {
                count--;
                System.out.println("nhap chua du du kien vui long nhap lai:");
                pass = sc.nextLine();
            }
            if (count == 0) {
                System.out.println("khoa dang nhap thoat chuong trinh");
                break;
            }
        }
        while (true);
    }

    public static boolean check(String password) {
        if (password.length() < 6)
            return false;
        boolean hasLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }
        if (!hasLetter)
            return false;
        boolean hasNumber = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }
        if (!hasNumber)
            return false;
        return true;
    }
}
