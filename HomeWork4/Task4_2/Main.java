package HomeWork4.Task4_2;

import HomeWork4.Task4_2.Massive;

/**
 * Пример вызова каждого из методов показать в методе main в другом классе в следующей последовательности:
 * Создать массив array с данными
 * Создать объект класса Massive
 * Используя методы класса Massive вывести созданный выше array в прямом и обратном порядке
 * Используя методы класса Massive вывести сумму элементов array
 * Используя методы класса Massive умножить созданный array на 3
 * Используя методы класса Massive вывести полученный после умножения array в прямом и обратном порядке
 */

public class Main {
    public static void main(String args[]) {
        int[] workingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//CreateArrays.createRandomArray();
        Massive massive = new Massive();

        massive.printMassiveAsLine(workingArray);
        massive.printReverseMassiveAsLine(workingArray);
        massive.getSumOfElements(workingArray);
        massive.multipleBy3(workingArray);
        massive.printMassiveAsLine(workingArray);
        massive.printReverseMassiveAsLine(workingArray);
    }


}
