package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

public class Task2_3 {
    // 3. каждый 3-й элемент умножить на 2 (2-мя способами)
    public static void main(String[] args) {
        int[] workingArray1 = CreateArrays.createRandomArray();
        System.out.println("Вариант 1: ");
        multiplyEveryThirdElement_var1(workingArray1);
        System.out.println("Вариант 2: ");
        int[] workingArray2 = CreateArrays.createRandomArray();
        multiplyEveryThirdElement_var2(workingArray2);
    }

    public static void multiplyEveryThirdElement_var1(int[] array) {
        for (int i = 2; i < array.length; i += 3) {
            array[i] *= 2;
        }
        System.out.println("Modified array:");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    public static void multiplyEveryThirdElement_var2(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            if (i % 3 == 0)
                array[i - 1] *= 2;
        }
        System.out.println("Modified array:");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }
}
       /*
        System.out.println("Вариант 3: ");
        int[] workingArray3 = CreateArrays.createRandomArray();
        for (int i = 2; i < workingArray3.length; i += 3) {
            workingArray3[i] *= 2;
        }
        for (int x : workingArray3) {
            System.out.print(x + " ");
        }
        System.out.print("\n");

*/



        /*
         System.out.println(" Вариант 1: ");// берет с нулевого элемента
        int[] workingArray1 = CreateArrays.createRandomArray();
        for (int i = 0; i < workingArray1.length; i += 3) {
            workingArray1[i] *= 2;
        }
        for (int x : workingArray1) {
            System.out.print(x + " ");
        }
        System.out.print("\n");

        System.out.println(" Вариант 2: ");
        int[] workingArray2 = CreateArrays.createRandomArray();
        for (int i = 1; i <= workingArray2.length; i++) {
            if (i % 3 == 0)
                workingArray2[i-1] *= 2;
        }
        for (int x : workingArray2) {
            System.out.print(x + " ");
        }
        System.out.print("\n");

         */


