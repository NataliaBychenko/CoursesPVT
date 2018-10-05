package HomeWork2.mainTasks;

import HomeWork2.CreateArrays;

public class Task2_12 {
    //12. циклически сдвинуть все элементы вправо на 2 позиции
    // (1-й элемент станет 3-м, 2-й станет 4-м и т.д.)
    public static void main(String[] args) {
        int step = 2;
        int[] workingArray = CreateArrays.createRandomArray();
        int[] newWorkingArray = moveElementsRight(workingArray, step);

        System.out.println("newWorkingArray: ");
        CreateArrays.showArray(newWorkingArray);

        int[] mass = CreateArrays.createRandomArray();
        int[] mass2 = new int[10];
        int movePosition = 2;
        for (int i = 0; i < mass.length; i++) {
            if ((movePosition + i) >= mass.length) {
                mass2[i - mass.length + movePosition] = mass[i];
            } else {
                mass2[i + movePosition] = mass[i];
            }
            System.out.println("mass: ");
            CreateArrays.showArray(mass);
        }

    }

    private static int[] moveElementsRight(int[] array, int step) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++) {
            int newIndex = i + step;
            if (newIndex < newArray.length) {
                newArray[newIndex] = array[i];
            } else {
                newArray[newIndex - newArray.length] = array[i];
            }
        }
        return newArray;
    }


}


