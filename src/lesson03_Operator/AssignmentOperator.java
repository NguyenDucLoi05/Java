package lesson03_Operator;

public class AssignmentOperator {
    public static void main(String[] args) {
        //Gan Cong
        int x = 8;
        x+=5;
        System.out.println("x="+x);

        //Gan Tru
        int x2 = 8;
        x2-=5;
        System.out.println("x2="+x2);

        //Gan Nhan
        int x3=8;
        x3*=5;
        System.out.println("x3="+x3);

        int a = 8;
        int b = 9;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a<b);
    }
}
