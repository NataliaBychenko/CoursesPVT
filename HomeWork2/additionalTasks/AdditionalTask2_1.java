package HomeWork2.additionalTasks;

import HomeWork2.CreateArrays;

/*
* 1. По аналогии создать двумерный массив, заполнить его случайными числами или вручную. для
этого массива:
- вывести все элементы в прямом и обратном порядке
- найти минимальный и максимальный элементы
*/
public class AdditionalTask2_1 {
    public static void main(String[] args) {
        int[][] workingArray = CreateArrays.createRandom2DArray();
        System.out.println("\nМассив вперед:");
        showArray(workingArray);
        System.out.println("\nМассив назад:");
        showRevertArray(workingArray);
        System.out.println("\nнайти минимальный и максимальный элементы:");
        findMinAndMaxElements(workingArray);
    }

    private static void showArray(int[][] workingArray) {
        for (int i[] : workingArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    private static void showRevertArray(int[][] workingArray) {
        for (int i = workingArray.length - 1; i >= 0; i--) {
            for (int j = workingArray[i].length - 1; j >= 0; j--) {
                System.out.print(workingArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void findMinAndMaxElements(int[][] workingArray) {
        int min = workingArray[0][0];
        int max = workingArray[0][0];

        for (int i[] : workingArray) {
            for (int j : i) {
                if (j < min) {
                    min = j;
                }
                if (j > max) {
                    max = j;
                }
            }
        }
        System.out.println("min = " + min + "\nmax = " + max);
    }
}
