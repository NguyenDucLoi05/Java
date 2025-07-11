package lesson20_String;

public class Exercise_4 {
    public static void main(String[] args) {
        String s = "hoc hoc nua hoc mai";
        String s1= "ngu";
        System.out.println(s.replace("hoc",s1));
        System.out.println(s.replaceFirst("nua",s1));
        String s2 = "      dajsl kd ak  dla   ";
        System.out.println(s2);
        System.out.println(s2.trim());
    }
}
