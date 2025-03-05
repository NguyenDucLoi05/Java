package lesson04_Scanner;

import java.util.Scanner;

public class ScannerExercises_3_IF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi Nhap Diem Trung Binh: ");
//        double dtb =  sc.nextDouble();
//        if(dtb>=5.0)
//            System.out.println("Ban Do");
//        else
//            System.out.println("Ban Tach");
        System.out.println("Moi Nhap Diem Trung Binh: ");
        double diemTrungBinh = sc.nextDouble();

        if(diemTrungBinh<=10&&diemTrungBinh>=8)
            System.out.println("HSG");
        else if (diemTrungBinh>=6.5)
            System.out.println("HSK");
        else if (diemTrungBinh>=5)
            System.out.println("HSTB");
        else
            System.out.println("HSY");
    }
}
