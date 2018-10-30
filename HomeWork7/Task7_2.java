package HomeWork7;
// 2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
public class Task7_2 {
    public static void main(String[] args) {
        String[] arrayStr = Helpers.enterStrings();

        String[] arrayStrSortAsc = sortArrayStrAscending(arrayStr);
        Helpers.printStringArray(arrayStrSortAsc);

        System.out.println("");

        String[] arrayStrSortDesc =  sortArrayStrDescending(arrayStr);
        Helpers.printStringArray(arrayStrSortDesc);

    }

    private static String[] sortArrayStrAscending(String[] arrayStr) {
        for (int i = 0; i < arrayStr.length; i++) {
            String temp;
            for (int j = 0; j < arrayStr.length - 1 - i; j++) {
                if (arrayStr[j].length() > arrayStr[j + 1].length()) {
                    temp = arrayStr[j];
                    arrayStr[j] = arrayStr[j + 1];
                    arrayStr[j + 1] = temp;
                }
            }
        }

        return arrayStr;
    }

    private static String[] sortArrayStrDescending(String[] arrayStr) {
        for (int i = 0; i < arrayStr.length; i++) {
            String temp;
            for (int j = 0; j < arrayStr.length - 1 - i; j++) {
                if (arrayStr[j].length() < arrayStr[j + 1].length()) {
                    temp = arrayStr[j];
                    arrayStr[j] = arrayStr[j + 1];
                    arrayStr[j + 1] = temp;
                }
            }
        }
        return arrayStr;
    }


}