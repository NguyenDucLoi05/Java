package lesson14_JavaExceptionHandling;

public class Exercise_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("c= " + c);
        } catch (ArithmeticException ex)// bat loi toan hoc
        {
            System.out.println("co loi toan hoc roi!");
            ex.printStackTrace();
        } catch (Exception ex)// bat tat ca loi
        {
            System.out.println("co loi roi!");
            ex.printStackTrace();
        }
        //cong viec thuc thi cho du co loi hay khong co loi
        finally {
            System.out.println();
        }
        System.out.println("doan code co loi hay khong?");
    }
}
