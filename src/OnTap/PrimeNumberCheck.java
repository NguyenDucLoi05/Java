package OnTap;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tiepTuc = true;
        while (tiepTuc) {
            System.out.println("Nhap 1 so nguyen:");
            int a = sc.nextInt();
            boolean laSoNguyenTo = true;
            if (a < 2)
                laSoNguyenTo = false;
            else {
                for (int i = 2; i <= i * i; i++) {
                    if (a % i == 0) {
                        laSoNguyenTo = false;
                        break;
                    }
                }
            }
            if (laSoNguyenTo)
                System.out.println(a + " la so nguyen to!");
            else System.out.println(a + " khong la nguyen to!");
            System.out.println("Ban co muon tiep tuc su dung phan mem khong? (c/k):");
            sc.nextLine();
            String traLoi = sc.nextLine();
            if (traLoi.equalsIgnoreCase("k")) {
                tiepTuc = false;
                System.out.println("Chuong trinh ket thuc! Cam on ban da su dung.");
            }
        }
        sc.close();
    }
}
