package HomeWork7;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
public class Task7_3 {
    public static void main(String[] args) {
        String[] arrayStr = Helpers.enterStrings();
        int averageLength = findAverageLength(arrayStr);
        String averageLengthText = "Average length: ";
        System.out.println(averageLengthText + averageLength);

        for (String str : arrayStr) {
            if (str.length() < averageLength) {
                printStrAndLength(str);
            }
        }
    }

    private static int findAverageLength(String[] arrayStr) {
        int totalLength = 0;
        for (String str : arrayStr) {
            totalLength += str.length();
        }
        return totalLength / arrayStr.length;
    }
    private static void printStrAndLength(String str) {
        System.out.println("String with a length less than average: " +str );
        System.out.println("Length = "+ str.length());

    }
}