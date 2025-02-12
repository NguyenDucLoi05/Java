package lesson02_variables;

public class DataTypesDemo {
    public static void main(String[] args) {
        //Kieu so nguyen
        byte myByte = 100;
        short myShort = 30000;
        int myInt = 100000;
        long myLong = 10000000000L;// Can them 'L' o cuoi vi la so lon

        //Kieu so thuc
        float myFloat = 5.75f;//Can them 'f' o cuoi vi mac dinh la double
        double myDouble = 19.99;//Khong can hau to

        //Ky tu
        char myChar = 'A';//Dung dau nhay don

        //Boolean
        boolean myBoolean = true;

        //In ra man hinh
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("Boolean: " + myBoolean);
    }
}
