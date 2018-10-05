package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

//2. найти произведения всех элементов массива, вывести
public class Task2_2 {
    public static void main(String[] args) {
        int[] workingArray = CreateArrays.createRandomArray();
        int product = productAllElements(workingArray);
        System.out.println("Произведение =  " + product);
    }

    private static int productAllElements(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product += array[i];
        }
        return product;
    }
}
