package HomeWork3;
/*
1. Написать метод, который принимает два числа a и b, выводит на экран их разность
2. Написать метод, который принимает три числа a, b, c. Выводит на экран a + b + c
3. Написать описанные выше методы таким образом, чтобы они возвращали результат, а не выводили его
4. Написать метод, которые выводит любой переданный массив
5. Написать метод, который выводит длину переданного массива
6. Написать метод, который получает массив типа double, а возвращает сумму его элементов.
7. Написать метод, который получает массив типа float, а возвращает новый массив, заменив каждый третий элемент на -1
* */

import java.util.Scanner;

public class Task3_1 {
    public static void main(String args[]) {
        int a = createRandomNumber();
        int b = createRandomNumber();
        int c = createRandomNumber();
        // принимает два числа a и b, выводит на экран их разность
        showDifferenceNumbers(a, b);

        // принимает три числа a, b, c. Выводит на экран a + b + c
        showSumNumbers(a, b, c);

        //методы возвращают результат, а не выводят его
        System.out.println(a + " - " + b + " = " + differenceNumbers(a, b));
        System.out.println(a + " + " + b + " + " + c + " = " + sumNumbers(a, b, c));

        // выводит любой переданный массив
        int[] workingArray = createRandomArray();
        showArray(workingArray);

        //выводит длину переданного массива
        System.out.println("Length  = " + showLengthArray(workingArray));

        //получает массив типа double, а возвращает сумму его элементов.
        double[] doubleArray = createRandomDoubleArray();
        System.out.println("Sum elements double array = " + sumOfDoubleArray(doubleArray));

        //получает массив типа float, а возвращает новый массив, заменив каждый третий элемент на -1
        float[] floatArray = createRandomFloatArray();
        showFloatArray(
                replaceEach3(floatArray, -1));
    }

    private static void showDifferenceNumbers(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    private static void showSumNumbers(int a, int b, int c) {
        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
    }

    private static int differenceNumbers(int a, int b) {
        return a - b;
    }

    private static int sumNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static void showArray(int[] array) {
        System.out.println("Your array is:");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }

    private static int showLengthArray(int[] array) {
        return array.length;
    }

    private static double sumOfDoubleArray(double[] array) {
        double sum = 0;
        for (double d : array) {
            sum += d;
        }
        return sum;
    }

    private static float[] replaceEach3(float[] array, float number) {
        for (int i = 2; i < array.length; i += 3) {
            array[i] = number;
        }
        return array;
    }

    private static void showFloatArray(float[] array) {
        System.out.println("Modified array:");
        for (float x : array) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    private static int createRandomNumber() {
        int min = 0;
        int max = 20;
        int randomNumber = min + (int) (Math.random() * (max - min));
        System.out.println("Your random number = " + randomNumber);
        return randomNumber;
    }

    private static double[] createRandomDoubleArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        double[] mas = new double[size];
        int min = 0;
        int max = 50;
        System.out.println("Your array is:");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = min + (int) (Math.random() * (max - min));
            System.out.print(mas[i] + " ");
        }
        System.out.print("\n");
        return mas;
    }

    private static float[] createRandomFloatArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        float[] mas = new float[size];
        int min = 0;
        int max = 50;
        System.out.println("Your array is:");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = min + (int) (Math.random() * (max - min));
            System.out.print(mas[i] + " ");
        }
         System.out.print("\n");
        return mas;
    }

    private static int[] createRandomArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        int[] mas = new int[size];
        int min = 0;
        int max = 50;
        // System.out.println("Your array is:");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = min + (int) (Math.random() * (max - min));
            //  System.out.print(mas[i] + " ");
        }
        //System.out.print("\n");
        return mas;
    }

}
