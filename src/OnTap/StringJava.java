package OnTap;

import java.util.Scanner;

public class StringJava {
    public static void main(String[] args) {
//        /*nhap vao 1 chuoi tu ban phim
//        1.dem xem co bao nhieu ky tu thuong.
//        2.bao nhieu in hoa.
//        3.bao nhieu so.
//        4.bao nhieu space.*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hay nhap vao 1 chuoi bat ky:");
//        String Chuoi = sc.nextLine();
//        int dem = 0;
//        int demInHoa = 0;
//        int demSo = 0;
//        int demSpace = 0;
//        for(int i = 0;i<Chuoi.length();i++)
//        {
//            char temp = Chuoi.charAt(i);
//            if(Character.isLowerCase(temp))
//                dem++;
//            else if (Character.isUpperCase(temp))
//                demInHoa++;
//            else if (Character.isDigit(temp))
//                demSo++;
//            else if (Character.isWhitespace(temp))
//                demSpace++;
//        }
//        System.out.println("Chuoi co:");
//        System.out.println(dem+" ky tu thuong");
//        System.out.println(demInHoa+" ky tu hoa");
//        System.out.println(demSo+" ky tu so");
//        System.out.println(demSpace+" space");
        /*
        cho String str1 = "English = 78 Science = 83 Math = 68 History = 65"
        1.tinh tong cac so trong chuoi tren.
        2.tinh trung binh cong
         */
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;
        String[] numbers = str1.split("\\D+");
        for (String num : numbers) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
                count++;
            }
        }
        System.out.println("tong: " + sum);
        System.out.println("trung binh cong: " + (double)sum / count);

    }
}
