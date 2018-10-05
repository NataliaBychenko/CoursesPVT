package HomeWork2.additionalTasks;

import java.util.ArrayList;

/*Создать список ArrayList, заполнить его строковыми или числовыми значениями. при помощи
 цикла for each:
 - вывести все элементы списка
 - к каждому из элементов прибавить любое число (или строку, если список строковый)
 - удалить последовательно все элементы
 - удалить сразу все элементы
 */
public class AdditionalTask2_2 {
    public static void main(String[] args) {
        //Создать и добавить элементы
        ArrayList<String> workingArrayList = new ArrayList<>();
        workingArrayList.add("123");
        workingArrayList.add("qwerty");
        workingArrayList.add("фыва");
        workingArrayList.add("!@#");

        System.out.println("Вывод через foreach: ");
        showArrayList(workingArrayList);

        System.out.println("Добавить к каждому строку: ");
        String addedStr = " plus";
        addStrAndShow(workingArrayList, addedStr);

        System.out.println("Последовательно удалить элементы: ");
        removeElementsOneByOne(workingArrayList);

        System.out.println("Удалить сразу все элементы: ");
        workingArrayList.add("123");
        workingArrayList.add("qwerty");
        workingArrayList.add("фыва");
        removeAllElements(workingArrayList);
    }

    private static void addStrAndShow(ArrayList<String> workingArrayList, String addedStr) {
        for (String element : workingArrayList) {
            element += addedStr;
            System.out.println(element);
        }
    }

    private static void showArrayList(ArrayList<String> workingArrayList) {
        for (String element : workingArrayList) {
            System.out.println(element);
        }
    }

    private static void removeElementsOneByOne(ArrayList<String> workingArrayList) {
        System.out.println("origin size = " + workingArrayList.size());
        for (String element : new ArrayList<>(workingArrayList)) {
            workingArrayList.remove(element);
        }
        System.out.println("size = " + workingArrayList.size());
    }

    private static void removeAllElements(ArrayList<String> workingArrayList) {
        System.out.println("origin size = " + workingArrayList.size());
        for (String element : new ArrayList<>(workingArrayList)) {
            boolean clear = workingArrayList.removeAll(workingArrayList); // или clear();
            System.out.println("size = " + workingArrayList.size());
            if (clear) {
                System.out.println("Все элементы удалены.");
                break;
            }
        }
    }
}


