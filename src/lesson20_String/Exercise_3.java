package lesson20_String;

public class Exercise_3 {
    public static void main(String[] args) {
        String s = "toi di tim ai di dau";
        System.out.println(s.indexOf("ai"));
        System.out.println(s.lastIndexOf("di"));
        String s1 = "bla bla blu blu blo";
        String s2 = "bla blu";
        boolean check = s1.contains(s2);
        if(check)
            System.out.println("co nha");
        else System.out.println("dell thay");
        String s3 = s1.substring(1,9);
        String s4 = s1.substring(5);
        System.out.println(s4);
        System.out.println(s3);
    }
}
