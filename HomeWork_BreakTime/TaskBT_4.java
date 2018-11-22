package HomeWorks.HomeWork_BreakTime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4.Удалить все символы, кроме пробелов, не являющимися буквами.
// Между последовательностями подряд идущих букв оставить хотя бы один пробел.
public class TaskBT_4 {
    public static void main(String[] args) {
        StringBuilder testText = Helpers.enterText();
        String textOnyLetters = removeNotLetters(testText);
        System.out.println(textOnyLetters);
        String beautifulText = removeExtraSpaces(textOnyLetters);
        System.out.println(beautifulText);
    }

    private static String removeExtraSpaces(String testText) {
        String[] removeSpace = testText.trim().split("\\s+");
        String resultStr = "";
        for (int i = 0; i < removeSpace.length; i++) {
            resultStr = resultStr.concat(removeSpace[i] + " ");
        }
        return resultStr;
    }

    private static String removeNotLetters(StringBuilder testText) {
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m;
        for (int i = 0; i < testText.length(); i++) {
            m = p.matcher(testText.substring(i, i + 1));
            if (!m.matches()) {
                testText.replace(i, i + 1, " ");
            }
        }
        return testText.toString();
    }
}