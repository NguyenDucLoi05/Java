package OnTap;
//trich loc String tu duong dan: D:/galailaptrinh/music/remix.mp3
//tach ten tep bao gom ca duoi: remix.mp3
//tach ten file: remix

public class ExtraStringFromTheURL {
    //    public static void main(String[] args) {
//        String str = "D:/galailaptrinh/music/remix.mp3";
//        String[] temp = str.split("/");
//        for (int i = temp.length; ; ) {
//            System.out.println(temp[i - 1]);
//            break;
//        }
//        int c = str.lastIndexOf("/");
//        String str1 = str.substring(c+1, str.length() - 4);
//        System.out.println(str1);
//    }
    public static void main(String[] args) {
        String str = "D:/galailaptrinh/music/remix.mp3";
        int lastSlashIndex = str.lastIndexOf("/");
        String fileName = str.substring(lastSlashIndex + 1);
        System.out.println(fileName);
        int lastDotIndex = fileName.lastIndexOf(".");
        String name = fileName.substring(0, lastDotIndex);
        System.out.println(name);
    }
}
