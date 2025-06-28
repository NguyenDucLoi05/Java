package lesson10_DoWhileLoop;

public class Exercises_2 {
    public static void main(String[] args) {
        int n = 0;
        while (true) {
            n++;
            System.out.println("n=" + n);
            if (n == 5)
                break;
        }
    }
}
