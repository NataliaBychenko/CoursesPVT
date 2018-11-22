package HomeWorks.HomeWork_BreakTime;

import java.util.Scanner;

//5.Удалить из текста его часть, заключенную между двумя символами,
// которые вводятся ( напр, между скобками {} или звездочками)
public class TaskBT_5 {
    private static String startSymbol;
    private static String endSymbol;

    public static void main(String[] args) {
        StringBuilder testText = Helpers.enterText();
        initParam();
        String string = removeSubstrInsideParam(testText, startSymbol, endSymbol);
        System.out.println(string);
    }

    private static String removeSubstrInsideParam(StringBuilder testText, String startSymbol, String endSymbol) {
        int startIndex = testText.indexOf(startSymbol) + 1;
        int endIndex = testText.lastIndexOf(endSymbol);
        return String.valueOf(testText.replace(startIndex, endIndex, ""));
    }

    private static void initParam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start symbol: ");
        startSymbol = scanner.nextLine();
        System.out.println("Enter end  symbol: ");
        endSymbol = scanner.nextLine();
        scanner.close();
    }
}
