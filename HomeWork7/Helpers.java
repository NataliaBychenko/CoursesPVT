package HomeWork7;

import java.util.Scanner;

public class Helpers {

    public static String[] enterStrings() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter count of strings: ");
        int countStrings = scan.nextInt();
        scan.nextLine();
        String[] arrayStr = new String[countStrings];
        for (int i = 0; i < countStrings; i++) {
            System.out.println("Enter string № " + i);
            arrayStr[i] = scan.nextLine();
        }
        scan.close();
        return arrayStr;
    }

    public static void printStringArray(String[] strings) {
        for (String out : strings) {
            System.out.println(out);
        }
    }

}
