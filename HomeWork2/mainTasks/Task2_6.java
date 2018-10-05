package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

//6. пройти по массиву и поменять местами каждые 2 соседних элемента 0-1, 2-3, 4-5
public class Task2_6 {

    public static void main(String[] args) {
        int[] workingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//CreateArrays.createRandomArray();
        CreateArrays.showArray(workingArray);
        exchangeNeighboringElements(workingArray);
    }

    private static void exchangeNeighboringElements(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i += 2) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        System.out.println("New array: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
