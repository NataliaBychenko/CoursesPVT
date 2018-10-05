package HomeWork2.mainTasks;

import java.util.Scanner;

public class Task2_11 {
    /* 11. заменить все элементы массива на полусумму соседних элементов
    * второй на полусумму 1-го и 3-го, 3-й на полусумму 2-го и 4-го и тд....
    * */
    public static void main(String[] args) {
        double[] workingArray = createRandomArray();
                //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        replaceElementWithHalfsum(workingArray);
        showArray(workingArray);
    }
    private static void replaceElementWithHalfsum(double[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = (array[i - 1] + array[i + 1]) / 2;
        }
    }

    public static double[] createRandomArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        double[] mas = new double[size];
        int min = 0;
        int max = 50;
        System.out.println("Your array is:");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = min + (int) (Math.random() * (max - min));
            System.out.print(mas[i] + " ");
        }
        System.out.print("\n");
        return mas;
    }

    public static void showArray(double[] array) {
        System.out.println("Your array is:");
        for (double x : array) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }
}
