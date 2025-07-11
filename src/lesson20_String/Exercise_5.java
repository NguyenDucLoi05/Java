package lesson20_String;

public class Exercise_5 {
    public static void main(String[] args) {
        String s = "     hoc hoc ngu hoc hoai       ";
        String s1 = s.replaceAll("\\s+$","");
        System.out.println(s1);

        // su dung while loop
        while(s.endsWith(" "))
        {
            s=s.substring(0,s.length()-1);
        }
        System.out.println(s);

        String s2 = s.replaceAll("^\\s+","");
        System.out.println(s2);
        while(s.startsWith(" "))
        {
            s=s.substring(1);
        }
        System.out.println(s);
    }
}
