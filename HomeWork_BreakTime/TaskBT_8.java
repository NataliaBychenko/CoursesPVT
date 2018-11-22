package HomeWorks.HomeWork_BreakTime;

import java.util.ArrayList;
import java.util.List;

//8.	В тексте определить все согласные буквы, встречающиеся не более чем в двух словах.
public class TaskBT_8 {
    public static void main(String[] args) {
        String testText = Helpers.enterText().toString();
        List<Character> result = findCons(testText);
        System.out.println("Consonants meet no more in 2 words: " + result);
    }

    private static List<Character> findCons(String testText) {
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
                'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        List<Character> findCons = new ArrayList();
        String[] words = testText.split(" ");
        for (int i = 0; i < consonants.length; i++) {
            int charCount = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].indexOf(consonants[i]) >= 0) {
                    charCount++;
                }
            }
            if (charCount > 0 && charCount <= 2) {
                findCons.add(consonants[i]);
            }
        }
        return findCons;
    }
}
