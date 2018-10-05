package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

//5. найти и вывести номер нулевых элементов.
// если нулевых элементов нет - вывести сообщение, что их нет
public class Task2_5 {

    public static void main(String[] args) {
        int[] workingArray = CreateArrays.createRandomArray();
        findIndexZeroElements(workingArray);
    }

    private static void findIndexZeroElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
                System.out.println("Position zero element = " + i);
            }
            if (i == array.length - 1 && count == 0)
                System.out.println("Zero value not available.");
        }
    }

}

