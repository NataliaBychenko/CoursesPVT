package HomeWorks.HomeWork_BreakTime;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 7.	В тексте найти первую подстроку максимальной длины, не содержащую букв.
//"qwuhrbvgjh 174124712 19748753587 jrhgku 745hg875h 475g77g7g7g uryg";
public class TaskBT_7 {
    public static void main(String[] args) {
        StringBuilder testText = Helpers.enterText();
        String result = findSubstrMaxLengthNotLetters(testText);
        System.out.println("Substring of maximum length, not containing letters: " + result);
    }

    private static String findSubstrMaxLengthNotLetters(StringBuilder testText) {
        String[] sub = testText.toString().split(" ");
        Pattern pattern = Pattern.compile("^.*[a-zA-Z]+.*$");
        ArrayList<String> newSub = new ArrayList();
        for (int i = 0; i < sub.length; i++) {
            Matcher matcher = pattern.matcher(sub[i]);
            if (!matcher.matches()) {
                newSub.add(sub[i]);
            }
        }
        int longestLength = 0;
        int longestIndex = 0;
        for (int i = 0; i < newSub.size(); i++) {
            if (newSub.get(i).length() > longestLength) {
                longestLength = newSub.get(i).length();
                longestIndex = i;
            }
        }
        return newSub.get(longestIndex);
    }
}

