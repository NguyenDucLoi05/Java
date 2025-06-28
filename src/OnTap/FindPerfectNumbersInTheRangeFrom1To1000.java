package OnTap;

public class FindPerfectNumbersInTheRangeFrom1To1000 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            if (i <= 3)
                continue;
            int temp = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    temp += j;
            }
            if (temp == i)
                System.out.println(i + " ");
        }
    }
}
