package HomeWorks.HomeWork_BreakTime;

import java.util.Scanner;

public class Helpers {

    public static StringBuilder enterText() {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        return new StringBuilder(scanner.nextLine());
    }

    public static int enterPosition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positions: ");
        int position = scan.nextInt();
        scan.close();
        return position;
    }

    public static int enterParam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Parameter. 0 or 1: ");
        int param = scanner.nextInt();
        scanner.close();
        return param;
    }
}


