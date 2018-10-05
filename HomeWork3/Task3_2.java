package HomeWork3;

/*
* Дедлайн: 00:00 01.10
* Порядок оформления:Каждый пункт должен быть выполнен в отдельном файле (Task3_2.java, Task3_1.java и т.д.,
 * а также добавлен скриншот успешной работы программы)
 *
 * Общее домашнее задание
 * Методы:Создать класс со следующими статическими методами:
 * - Найти минимальное число из 2 чисел, вернуть минимальное
 * - Проверить четное число или нечетное, вернуть boolean результат
 * - Возвести число в квадрат, вернуть результат возведения
 * - Возвести число в куб, вернуть результат возведения
 *
 * Все методы должны возвращать значения нужного типа.
 * Примеры использования этих методов привести в main- методе текущего класса.
 *
 * Дополнительное домашнее задание:
 * Преобразовать домашнее задание с занятия 2, функционал разнести по методам.
*
* */
public class Task3_2 {

    public static void main(String args[]) {
        int a =  createRandomNumber();
        int b = createRandomNumber();
        int minNumber = minOfNumbers(a, b);
        System.out.println("Min number of " +a +" and "+ b +" is "+minNumber +".");
        boolean isEvenNumber = checkEvenNumber(a);
        System.out.println("Method isEvenNumber return =  "+ isEvenNumber);
        int numberInSquare = raisingToPower(a, 2);
        System.out.println("numberInSquare from the method raisingToPower("+ a+")  =  "+ numberInSquare);
        int cubeNumber = raisingToPower(b, 3);
        System.out.println("cubeNumber from the method raisingToPower("+ b +")  =  "+ cubeNumber);
    }
    //генерация числа
    private static int createRandomNumber() {
        int min = 0;
        int max = 10;
        int  randomNumber = min + (int) (Math.random() * (max - min));
        System.out.println("Your random number = "+ randomNumber);
        return randomNumber;
    }
    // найти минимальное из двух
    private static int minOfNumbers(int number1, int number2) {
        if (number1 > number2){
            return number2;
        }else
            return number1;
    }
    //четное/нечетное
    private static boolean checkEvenNumber(int number) {
        if (number%2==0){
            System.out.println("Your number "+ number+" is even. ");
            return true;
        }else
            System.out.println("Your number "+ number+" is odd. ");
        return false;
    }
    //возведение в степень
    private static int raisingToPower(int number, int power) {
        number = (int) Math.pow(number,power);
        return number;
    }
}