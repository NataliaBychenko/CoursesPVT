package HomeWork7;

//Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке возрастания их кодов.
// Если таких слов несколько, найти первое из них.
public class Task7_6 {
    public static void main(String[] args) {
        String[] arrayWords = Helpers.enterStrings();

        for (String word : arrayWords) {
            int temp = 0;
            for (int i = 0; i < word.length() - 1; i++) {
                int charCode = word.charAt(i);
                int nextCharCode = word.charAt(i + 1);


                if (nextCharCode < charCode) {
                    break;
                } else
                    temp++;

                if (temp == word.length() - 1) {
                    System.out.println("Word is : " + word);
                     return;
                }

            }
        }
    }

}