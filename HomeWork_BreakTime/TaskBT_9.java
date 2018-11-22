package HomeWorks.HomeWork_BreakTime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//9Преобразовать текст так, чтобы каждое слово, не содержащее неалфавитных символов, начиналось с заглавной буквы.
public class TaskBT_9 {
    public static void main(String[] args) {
        String testText = Helpers.enterText().toString();
        String[] textArray = testText.split(" ");
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m;
        for (int i = 0; i < textArray.length; i++) {
            m = p.matcher(textArray[i]);
            if (m.matches()) {
                System.out.print(textArray[i].substring(0, 1).toUpperCase()
                        + textArray[i].substring(1) + " ");
            } else System.out.print(textArray[i] + " ");
        }
    }
}
