package lesson20_String;

public class Exercise_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("xin chao, ");
        sb.append("minh ngu");
        System.out.println(sb);
        sb.insert(3,"bla bla bla");
        System.out.println(sb);
        sb.delete(3,7);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
