package OnTap;

public class TheSumOfFactorialsFrom1To10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            int sum1 = 1;
            for (int j = 1; j <= i; j++) {
                sum1 *= j;
            }
            sum += sum1;
        }
        System.out.println("tong gia thua tu 1 den 10 la: " + sum);
    }
}
