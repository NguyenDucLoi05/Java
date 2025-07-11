package lesson19_TheCharDataType;

public class Exercise_3 {
    public static void main(String[] args) {
        char ch = '1';
        char ch1 = 'a';
        char ch2 = ' ';
        char ch3 = 'A';
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isWhitespace(ch2));
        System.out.println(Character.isUpperCase(ch3));
    }
}
