package HomeWork14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * В классе написать как минимум 4 метода,
 в каждом методе добавить проверку на исключительные ситуации, используя:
 1. try- catch
 2. try-catch, где catch будет несколько
 3. try -catch, с использованием multi-catch
 4. try-catch-finally
 * */
public class Massive {
    int[] array;
    int size;
    String description;
    int summAllElements;

    public Massive() {
    }

    public void enterSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        try {
            size = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + " You entered not a number. Try again. ");
            size = 0;
        } finally {
            sc.close();
        }
    }

    public String initDescription() {
        File file = new File("D:\\description.txt");
        int size = 100;
        char[] textFromFile = new char[size];
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            fileReader.read(CharBuffer.wrap(textFromFile));
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return String.valueOf(textFromFile);
    }

    public int findElementByIndex(int index) {
        try {
            return this.array[index];
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Element is not found.");
            return this.array.length;
        }
    }

    public int[] initializeMassive() {
        array = new int[size];
        int min = 0;
        int max = 50;
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min));
        }
        showArray(array);
        return array;
    }

    public static void showArray(int[] array) {
        System.out.println("Your array is:");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }

    public void exchangeNeighboringElements(int index) {
        int temp;
        try {
            temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Nothing to change.");
        }

    }



}