package OnTap;

public class TheNumbersDivisibleBy3From10To50 {
    public static void main(String[] args) {
        for (int i = 10; i <= 50; i++) {
            if (i % 3 != 0) {
                i += 1;
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
