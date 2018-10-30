package HomeWork7;

//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
public class Task7_1 {

    public static void main(String[] args) {
        String[] arrayStr = Helpers.enterStrings();
        String shortStr  = findShortestStr(arrayStr);
        String longStr  = findLongestStr(arrayStr);

        String textForLenghtStr = ". Length string: ";
        String textForShortestStr = "Shortest string is ";
        String textForLongestStr = "Longest string is ";

        System.out.println(textForShortestStr + shortStr
                + textForLenghtStr + shortStr.length());
        System.out.println(textForLongestStr + longStr
                + textForLenghtStr + longStr.length());
    }

    private static String findLongestStr(String[] arrayStr) {
        String longStr = arrayStr[0];
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].length()> longStr.length()){
                longStr = arrayStr[i];
            }
        }
        return longStr;
    }

    private static String findShortestStr(String[] arrayStr) {
        String shortStr = arrayStr[0];
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].length()< shortStr.length()){
                shortStr = arrayStr[i];
            }

        }
        return shortStr;
    }


}