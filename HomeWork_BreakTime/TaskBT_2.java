package HomeWorks.HomeWork_BreakTime;

import java.util.ArrayList;
import java.util.Arrays;

//2.	После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово.
public class TaskBT_2 {
    public static void main(String[] args) {
        System.out.print("I need text. ");
        String testText = Helpers.enterText().toString();
        System.out.print("I need substring. ");
        String substr = Helpers.enterText().toString();
        System.out.print("I need insert word. ");
        String insertStr = Helpers.enterText().toString();
        ArrayList<String> newText = enterTextAfterSubstr(testText, substr, insertStr);
        newText.stream().forEach(word -> System.out.print((word) + " "));
    }

    private static ArrayList<String> enterTextAfterSubstr(String testText, String substr, String insertStr) {
        ArrayList<String> text = new ArrayList<>(Arrays.asList(testText.split("\\s+")));
        ArrayList<String> newText = new ArrayList<String>();
        for (String word : text) {
            newText.add(word);
            if (word.endsWith(substr)) {
                newText.add(insertStr);
            }
        }
        return newText;
    }
}