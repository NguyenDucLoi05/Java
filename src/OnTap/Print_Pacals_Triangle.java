package OnTap;

import java.util.Scanner;

public class Print_Pacals_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Triangle:");
        int num = sc.nextInt();

        printPacaslsTriangle(num);
        sc.close();

    }
    public static void printPacaslsTriangle(int num){
        for(int i = 0;i<num;i++){
            int number =1;

            for(int j = 0; j < num - i - 1; j++){
                System.out.print(" ");
            }

            for (int j = 0;j<=i;j++){
                System.out.print(number +" ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
            }
        }
    }
