package HomeWork7;

//4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
public class Task7_4 {

    public static void main(String[] args) {
        String[] arrayStr = Helpers.enterStrings();
        String strWithDiffValue = findStrWithDiffValue(arrayStr);
        String textStrWithDiffValue ="Word with min different characters: " ;

        System.out.println( textStrWithDiffValue + strWithDiffValue);

    }

    private static String findStrWithDiffValue(String[] arrayStr) {
        int diffValue = arrayStr[0].length();
        String strWithDiffValue = arrayStr[0];
        for (int i = 0; i < arrayStr.length; i++) {
            if ((int) arrayStr[i].chars().distinct().count() < diffValue) {
                diffValue = (int) arrayStr[i].chars().distinct().count();
                strWithDiffValue =  arrayStr[i];
            }
        }
        return strWithDiffValue;
    }

}