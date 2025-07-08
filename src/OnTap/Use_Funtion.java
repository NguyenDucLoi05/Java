package OnTap;

import java.util.Scanner;

public class Use_Funtion {
    public static void main(String[] args) {
        /*viet chuong trinh nhap vao tu ban phim 2 so a,b
        Nhap 1 ky tu +,-,/,*
        Dung funtion neu nhap ky tu nao thi dung ky tu do de tinh a vs b
        */
        Scanner sc = new Scanner(System.in);
        //su dung string
        System.out.println("Nhap 1 trong 4 ky tu sau +,-,*,/:");
        String KyTu = sc.nextLine();
        CacPhepToanCoBanSuDungString(KyTu);
        //su dung char
        System.out.println("Nhap 1 trong 4 ky tu sau +,-,*,/:");
        char Kytu = sc.next().charAt(0);
        CacPhepToanCoBanSuDungChar(Kytu);
        sc.close();
    }

    public static void CacPhepToanCoBanSuDungString(String KyTu) {
        Scanner sc = new Scanner(System.in);
        if (KyTu.equals("+")) {
            System.out.println("Nhap vao so a de tinh");
            double a = sc.nextDouble();
            System.out.println("Nhap vao so b de tinh");
            double b = sc.nextDouble();
            System.out.println("Ket Qua Phep Cong: " + Sum(a, b));
        } else if (KyTu.equals("-")) {
            System.out.println("Nhap vao so a de tinh");
            double a = sc.nextDouble();
            System.out.println("Nhap vao so b de tinh");
            double b = sc.nextDouble();
            System.out.println("Ket Qua Phep Tru: " + Subtraction(a, b));
        } else if (KyTu.equals("*")) {
            System.out.println("Nhap vao so a de tinh");
            double a = sc.nextDouble();
            System.out.println("Nhap vao so b de tinh");
            double b = sc.nextDouble();
            System.out.println("Ket Qua Phep Nhan: " + Multiplication(a, b));
        } else if (KyTu.equals("/")) {
            System.out.println("Nhap vao so a de tinh");
            double a = sc.nextDouble();
            System.out.println("Nhap vao so b de tinh");
            double b = sc.nextDouble();
            if (Division(a, b) == -999999)
                System.out.println("Khong the thuc hien phep tinh");
            else
                System.out.println("Ket Qua Phep Chia: " + Division(a, b));
        } else System.out.println("Khong ton tai phep tinh do!");
    }

    public static double Sum(double a, double b) {
        return a + b;
    }

    public static double Subtraction(double a, double b) {
        return Math.abs(a - b);
    }

    public static double Multiplication(double a, double b) {
        return a * b;
    }

    public static double Division(double a, double b) {
        if (b == 0)
            return -999999;
        return a / b;
    }

    public static void CacPhepToanCoBanSuDungChar(char Kytu) {
        Scanner sc = new Scanner(System.in);
        switch (Kytu) {
            case '+': {
                System.out.println("Nhap vao so a de tinh");
                double a = sc.nextDouble();
                System.out.println("Nhap vao so b de tinh");
                double b = sc.nextDouble();
                System.out.println("Ket Qua Phep Cong: " + Sum(a, b));
                break;
            }
            case '-': {
                System.out.println("Nhap vao so a de tinh");
                double a = sc.nextDouble();
                System.out.println("Nhap vao so b de tinh");
                double b = sc.nextDouble();
                System.out.println("Ket Qua Phep Tru: " + Subtraction(a, b));
                break;
            }
            case '*': {
                System.out.println("Nhap vao so a de tinh");
                double a = sc.nextDouble();
                System.out.println("Nhap vao so b de tinh");
                double b = sc.nextDouble();
                System.out.println("Ket Qua Phep Nhan: " + Multiplication(a, b));
                break;
            }
            case '/': {
                System.out.println("Nhap vao so a de tinh");
                double a = sc.nextDouble();
                System.out.println("Nhap vao so b de tinh");
                double b = sc.nextDouble();
                if (Division(a, b) == -999999)
                    System.out.println("Khong the thuc hien phep tinh!");
                else
                    System.out.println("Ket Qua Phep Chia: " + Division(a, b));
                break;
            }
            default:
                System.out.println("Khong ton tai phep tinh do!");
        }
    }
}
