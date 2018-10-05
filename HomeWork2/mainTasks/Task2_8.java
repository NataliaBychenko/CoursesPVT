package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

public class Task2_8 {
    // 8. найти минимальный-максимальный элементы и вывести
    public static void main(String[] args) {
        int[] workingArray = CreateArrays.createRandomArray();
        findMinAndMaxElements(workingArray);
    }

    private static void findMinAndMaxElements(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
