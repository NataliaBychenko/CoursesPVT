package HomeWork8;

//В методе main другого класса (любого), лежащего в том же пакете что и Tester,
// создать объект класса Tester, используя любой из перегруженных конструкторов.
// продемонстрировать последовательный вызов всех методов класса Tester, если это возможно.
// если невозможно - написать комментарий почему.
public class HomeWork8 {

    public static void main(String[] args) {
        Tester tester = new Tester("XXX", "YYY");
        tester.setExperienceInYears(3);
        int experienceInYears = tester.getExperienceInYears();
        System.out.println(experienceInYears);
        // остальные сеттеры/геттеры аналогично

       // getDoubleSalary(); Не сработает, т.к. доступ только внутри класса

        int experienceInMonths = tester.getExperienceInMonths();
        System.out.println(experienceInMonths);

        tester.printNameSurname();
        tester.printAllToString();


        // PrivateTester privateTester1 = new PrivateTester();
        PrivateTester privateTester =  PrivateTester.createPrivateTester();
        privateTester.printMess();



    }

}
