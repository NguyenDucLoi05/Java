package lesson02_variables;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = (double) a/b;

        //ép kiểu hẹp
        int c = 300;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d); // sai giá trị bởi vì int >>byte và value c > MAX.VALUE byte

        int e =15;
        byte f = (byte) e;
        System.out.println(e);
        System.out.println(f);
    }
}
