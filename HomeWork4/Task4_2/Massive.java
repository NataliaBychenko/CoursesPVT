package HomeWork4.Task4_2;

/**
 Создать класс Massive со следующими методами:
 метод printMassiveAsLine, который принимает в качестве аргументов массив и печатает его в консоли в одну строку, ничего не возвращает;
 метод printReverseMassiveAsLine, который принимает в качестве аргументов массив и печатает его в консоли в одну строку в обратном порядке, ничего не возвращает;
 метод getSumOfElements, который принимает массив, а возвращает сумму его элементов;
 метод multiptyBy3, который принимает массив, умножает каждый элемент массива на 3 и возвращает умноженный массив;

 Пример вызова каждого из методов показать в методе main в другом классе в следующей последовательности:
 Создать массив array с данными
 Создать объект класса Massive
 Используя методы класса Massive вывести созданный выше array в прямом и обратном порядке
 Используя методы класса Massive вывести сумму элементов array
 Используя методы класса Massive умножить созданный array на 3
 Используя методы класса Massive вывести полученный после умножения array в прямом и обратном порядке

 */
public class Massive {

    public void printMassiveAsLine(int [] array){
        System.out.println("\nYour array is:");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }

    public void printReverseMassiveAsLine(int [] array){
        System.out.println("\nRevert array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }System.out.print("\n");
    }

    public static int getSumOfElements(int[] array) {
        int multiply = 1;
        for (int i = 0; i < array.length; i++) {
            multiply += array[i];
        }
        return multiply;
    }

    public static void multipleBy3(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            if (i % 3 == 0)
                array[i - 1] *= 2;
        }
        System.out.println("\nModified array:");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }

}
