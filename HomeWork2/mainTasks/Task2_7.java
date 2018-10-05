package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

public class Task2_7 {
// 7. поменять местами первый и последний, второй и предпоследний и т.д.
    public static void main(String[] args) {
        int[] workingArray = CreateArrays.createRandomArray();
        exchangeOfElement(workingArray);
    }

    public static void exchangeOfElement(int[] array)  {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - 1 - i] = temp;
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
