package lesson10_DoWhileLoop;

public class Exercises_1 {
    public static void main(String[] args) {
        //tinh tong cac so tu 1-5 su dung do while
        int a = 1;
        int sum = 0;
        do {
            sum += a;
            a++;
        }
        while (a <= 5);
        System.out.println("Tong tu 1 den 5 la:" + sum);
    }
}
