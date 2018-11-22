package HomeWorks.HomeWork_BreakTime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//10.	Подсчитать количество содержащихся в данном тексте знаков препинания.
public class TaskBT_10 {
    public static void main(String[] args) {
        StringBuilder testText = Helpers.enterText();
        int result = countPunctMark(testText);
        System.out.println("Count of punctuation marks: " + result);
    }

    private static int countPunctMark(StringBuilder testText) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\.|,|!|\\?|:|\\;");
        Matcher matcher = pattern.matcher(testText);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
