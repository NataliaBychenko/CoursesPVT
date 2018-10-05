package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

public class Task2_4 {
    //4. найти количество нулевых элементов, вывести количество.
    // если нулевых элементов нет - вывести сообщение, что их нет
    //В двух любых задачах на выбор использовать цикл while()
    public static void main(String[] args) {
        int[] workingArray = CreateArrays.createRandomArray();
        findCountZeroElement(workingArray);
    }

    private static int findCountZeroElement(int[] array) {
        int count = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == 0) {
                count++;
            }
            i++;
        }
        if (count != 0) {
            System.out.println("Count zero element = " + count);
        } else System.out.println("Zero value not available.");

        return count;
    }
}



