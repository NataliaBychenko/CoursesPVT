package HomeWorks.HomeWork_BreakTime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//11.	В заданном тексте найти сумму всех встречающихся цифр.
public class TaskBT_11 {
    public static void main(String[] args) {
        StringBuilder testText = Helpers.enterText();
        int summAllNumbers = summAllNumbers(testText);
        System.out.println("Summ all numbers in string = " + summAllNumbers);
    }

    private static int summAllNumbers(StringBuilder testText) {
        int summ = 0;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher;
        for (int i = 0; i < testText.length(); i++) {
            matcher = pattern.matcher(testText.substring(i, i + 1));
            if (matcher.matches()) {
                summ += Integer.parseInt(testText.substring(i, i + 1));
            }
        }
        return summ;
    }
}
