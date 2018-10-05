package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

public class Task2_9 {
    // 9. найти номер минимального-максимального элементов и вывести
    public static void main(String[] args) {
        int[] workingArray = CreateArrays.createRandomArray();
        findIndexesMinAndMaxElements(workingArray);
    }

    private static void findIndexesMinAndMaxElements(int[] array) {
        int min = array[0];
        int positionMin = 0;
        int max = array[0];
        int positionMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                positionMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                positionMax = i;
            }
        }
        System.out.println("min = " + min + " , position = " + positionMin);
        System.out.println("max = " + max + " , position = " + positionMax);
    }
}
