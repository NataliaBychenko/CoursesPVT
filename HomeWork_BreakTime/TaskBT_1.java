package HomeWorks.HomeWork_BreakTime;

//1.	В тексте после k-го символа вставить заданную подстроку.
public class TaskBT_1 {

    public static void main(String[] args) {
        System.out.print("I need text. ");
        StringBuilder testText = Helpers.enterText();
        System.out.print("I need insert text. ");
        StringBuilder param = Helpers.enterText();
        int positionParam = Helpers.enterPosition();
        StringBuilder newText = enterTextInPositions(testText, positionParam, param);
        System.out.println(newText);
    }

    private static StringBuilder enterTextInPositions(StringBuilder testText, int positionParam, StringBuilder param) {
        return positionParam < testText.length()
                ? testText.insert(positionParam, param)
                : testText;
    }
}
