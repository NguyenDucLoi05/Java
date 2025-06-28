package lesson12_BreakContinue;

public class Exercises_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            if (i == 3)
                continue;
            else
                sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
