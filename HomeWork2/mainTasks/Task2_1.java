package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

//1. пройти по массиву, вывести все элементы в прямом и в обратном порядке.
public class Task2_1 {
    public static void main(String[] args) {
        // int []   workingArray = CreateArrays.createArrayFromConsole(size);
        int[] workingArray = CreateArrays.createRandomArray();

        // все элементы вперед
        showArray(workingArray);
        // все элементы назад
        showRevertArray(workingArray);

    }
   public static void  showArray( int[] array){
        System.out.println("\nМассив вперед:");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
    public static void  showRevertArray( int[] array){
        System.out.println("\nМассив назад:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

}