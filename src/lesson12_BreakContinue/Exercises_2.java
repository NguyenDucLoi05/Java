package lesson12_BreakContinue;

public class Exercises_2 {
    public static void main(String[] args) {
        int n = 0;
        while (n < 100) {
            System.out.println("n=" + n);
            if (n == 15)
                break;
            n++;
        }
    }
}
