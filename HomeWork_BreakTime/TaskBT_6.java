package HomeWorks.HomeWork_BreakTime;

import java.util.*;

public class TaskBT_6 {
    //6. Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
    public static void main(String[] args) {
        String testText = Helpers.enterText().toString();
        String[] words = testText.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if (count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        for (String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}
