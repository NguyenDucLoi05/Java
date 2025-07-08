package lesson15_Module_Funtion;

public class Exercise_1 {
    public static void main(String[] args) {
        int kq = Cong(1, 3, 5);
        System.out.println("kq cong la: " + kq);
        int kq1 = Cong(4, 3, 5);
        System.out.println("kq cong la: " + kq1);

        XinChao("Female");
        XinChao("Male");
    }

    public static int Cong(int x, int y, int z) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return x + y + z;

    }

    public static void XinChao(String gioitinh) {
        if (gioitinh.equals("Female"))
            System.out.println("la nu");
        else if (gioitinh.equals("Male"))
            System.out.println("la nam");
    }
}
