package HomeWorks.HomeWork_BreakTime;

//3 В зависимости от признака (0/1) в каждой строке текста удалить указанный символ везде,
// где он встречается, или вставить его после k-го символа.
public class TaskBT_3 {
    public static void main(String[] args) {
        System.out.print("I need text. ");
        StringBuilder testText = Helpers.enterText();
        System.out.print("I need substring. ");
        StringBuilder subStr = Helpers.enterText();
        int param = Helpers.enterParam();
        if (param == 0) {
            System.out.println(removeSubstr(testText, subStr));
        } else if (param == 1) {
            int positionSubstr = Helpers.enterPosition();
            System.out.println(insertSubstr(testText, subStr, positionSubstr));
        } else
            System.out.println("Your parameter is not 0 or 1.");
    }

    private static StringBuilder insertSubstr(StringBuilder testText, StringBuilder subStr, int positionSubstr) {
        return positionSubstr < testText.length()
                ? testText.insert(positionSubstr, subStr)
                : testText;
    }

    private static String removeSubstr(StringBuilder testText, StringBuilder subStr) {
        return testText.toString().replace(subStr, "");
    }
}
