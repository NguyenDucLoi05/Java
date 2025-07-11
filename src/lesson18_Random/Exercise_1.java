package lesson18_Random;

import java.sql.SQLOutput;
import java.util.Random;

public class Exercise_1 {
    public static void main(String[] args){
        Random rd = new Random();
        int ngauNhien = rd.nextInt(-50,50);
        System.out.println(ngauNhien);
        double ngauNhien1=rd.nextDouble(-50,50);
        System.out.println(ngauNhien1);
    }
}
