package HomeWork2;

import java.util.Scanner;

public class CreateArrays {

    public static int[] createRandomArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        int[] mas = new int[size];
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

    public static int[] createRandomArray(int size) {
        int[] mas = new int[size];
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

    public static int[] createArrayFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");

        int size = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Enter number to position  " + i + ": ");
            mas[i] = sc.nextInt();
        }
        System.out.println("Your array is:");
        for (int x : mas) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
        return mas;
    }

    public static int[][] createRandom2DArray() {
        Scanner sc = new Scanner(System.in);
        int sizeX = 0;
        int sizeY = 0;

        System.out.println("Enter size x: ");
        if (sc.hasNextInt()) {
            sizeX = sc.nextInt();
        }
        System.out.println("Enter size y: ");
        if (sc.hasNextInt()) {
            sizeY = sc.nextInt();
        }

        int[][] mas = new int[sizeX][sizeY];
        int min = 0;
        int max = 50;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = min + (int) (Math.random() * (max - min));
            }
        }
        show2DArray(mas);
        return mas;
    }

    public static void showArray(int[] array) {
        System.out.println("Your array is:");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }

    public static void show2DArray(int[][] array) {
        System.out.println("Your array is:");
        for (int i[] : array) {
            for (int j : i) {
                System.out.print(j+" ");

            }
            System.out.println("");
        }


    }
}