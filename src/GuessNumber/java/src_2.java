package GuessNumber.java;

import java.util.Random;
import java.util.Scanner;

public class src_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(0, 101);
        int guess;
        int attemps = 0;
        int invalidAttemps = 0;

        System.out.println("======================================================");
        System.out.println("Chào mừng bạn đã đến với trò chơi đoán số may mắn!!!!");
        System.out.println("Tôi đã chọn một số từ 0 đến 100.");
        System.out.println("Bạn hãy thử đoán xem số đó là số mấy!!");

        while (true) {
            System.out.print("Nhập số mà bạn đoán:");
            guess = scanner.nextInt();

            if (guess < 0 || guess > 100) {
                invalidAttemps++;
                if (invalidAttemps >= 3) {
                    System.out.println("Bạn đã nhập sai yêu cầu quá 3 lần!!!");
                    System.out.println("Không chơi game nữa nghỉ!!!");
                    return;
                } else {
                    System.out.println("Số bạn nhập không nằm trong yêu cầu!!!");
                    System.out.println("Bạn hãy nhập lại đúng theo yêu cầu nhé!!");
                    continue;
                }
            } else {
                attemps++;
                if (guess < secretNumber)
                    System.out.println("Số của bạn nhỏ hơn số bí mật!");
                else if (guess > secretNumber)
                    System.out.println("Số của bạn lớn hơn số bí mật!");
                else {
                    System.out.println("Chúc mừng bạn đã đoán trúng sau " + attemps + " lần thử!");
                    break;
                }
            }
        }
    }
}
