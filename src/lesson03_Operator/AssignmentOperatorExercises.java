package lesson03_Operator;

public class AssignmentOperatorExercises {
    public static void main(String[] args) {
        int a = 6;
        a+=3;
        System.out.println("a="+(a));

        a-=5;
        System.out.println("a="+(a));

        a*=2;
        System.out.println("a="+(a));

        a %=5;
        System.out.println("a="+(a));

        int b=2;
        a=a-(b+7);
        System.out.println("a="+a);
    }
}
