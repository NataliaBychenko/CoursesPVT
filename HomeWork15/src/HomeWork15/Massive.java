package HomeWork15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Massive {
   public int[] array;
    int size;

    public Massive() {
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

    public int methodWithException()  {
        return 10/0;
    }

    public int[] getReverseMassive(int[] array) {
        int reverseArray[] = array.clone();
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }

    public  int getSumOfElements(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ;
    }

   public int productAllElements(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }

    public boolean checkAscArray(int[] array) {
        boolean temp = true;
        int i = 0;
        while (temp && i < array.length - 1) {
            if (array[i] - array[i + 1] > 0) {
                temp = false;
            }
            i++;
        }
        return temp;
    }

    public int [] multipleBy3(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            if (i % 3 == 0)
                array[i - 1] *= 2;
        }
        System.out.println("\nModified array:");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
    return  array;
    }

    public int findCountZeroElement(int[] array) {
        int count = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}