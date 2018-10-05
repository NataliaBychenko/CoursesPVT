package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

public class Task2_10 {
    //10. проверить, является ли массив возрастающей последовательностью
    // (каждое следующее число больше предыдущего)
    //В двух любых задачах на выбор использовать цикл while()
    public static void main(String[] args) {
        int[] workingArray = CreateArrays.createRandomArray();
        //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (checkAscArray(workingArray)) {
            System.out.println("Массив возрастающий.");
        } else System.out.println("Массив не возрастающий.");
    }

    private static boolean checkAscArray(int[] array) {
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
}
