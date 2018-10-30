package HomeWork7;

//Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них.
public class Task7_7 {
    public static void main(String[] args) {

        String[] arrayStr = Helpers.enterStrings();

        for (String str : arrayStr) {
            if (str.length() == str.chars().distinct().count()) {
                System.out.println("Word of different symbols: " + str);
                break;
            } else
                System.out.println("Word not found.");
        }

    }
}
