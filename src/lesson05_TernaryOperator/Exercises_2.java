package lesson05_TernaryOperator;

import java.util.Scanner;

public class Exercises_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Diem Trung Binh:");
        float diemTrungBinh = sc.nextFloat();

        String xeploai = diemTrungBinh>=8?"Gioi":
                (diemTrungBinh>=6.5?"Kha":
                        (diemTrungBinh>=5?"TrungBinh":"Yeu"));
        System.out.println(xeploai);
    }
}
