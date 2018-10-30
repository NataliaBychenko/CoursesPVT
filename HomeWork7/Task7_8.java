package HomeWork7;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
// Если таких слов больше одного, найти второе из них.
public class Task7_8 {
    public static void main(String[] args) {
        String[] arrayStr = Helpers.enterStrings();
        ArrayList<String> numbers = findOnlyNumber(arrayStr);
        System.out.println("Array with only number: ");
        numbers.forEach(System.out::println);

        ArrayList<String> palindromes = findPalindromes(numbers);
        System.out.println("Array with palindromes: ");
        palindromes.forEach(System.out::println);

        if (palindromes.size() > 1) {
            System.out.println("Second palindrome: " + palindromes.get(1));
        } else {
            System.out.println("Palindrome: " + palindromes.get(0));
        }
    }

    private static ArrayList<String> findOnlyNumber(String[] arrayStr) {
        ArrayList<String> numbers = new ArrayList<String>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m;
        for (String str : arrayStr) {
            m = p.matcher(str);
            if (m.matches()) {
                numbers.add(str);
            }
        }
        return numbers;
    }

    private static ArrayList<String> findPalindromes(ArrayList<String> arrayStr) {
        ArrayList<String> palindromes = new ArrayList<>();

        for (String str : arrayStr) {
            if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
                palindromes.add(str);
            }
        }
        return palindromes;
    }

}