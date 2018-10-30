package HomeWork8;

/**  Создать класс Tester со следующими полями:
 * -name
 * -surname
 * -experienceInYears
 * -englishLevel
 * -salary
 * Самостоятельно решить, какое модификатор доступа будет иметь каждое из полей, при этом использовать все изученные модификаторы.
 * private / friendly / protected / Public*/

/**
1. Перегрузить в этом классе 3 конструктора, каждый из которых будет последовательно вызывать другой используя this(...);
 Конструктор с наибольшим числом параметров сделать с уровнем доступа отовсюду.
2. Написать для каждого поля get- и set- методы с уровнем доступа только внутри пакета.
3. Написать метод с уровнем доступа только внутри класса, который будет возвращать salary*2;
4. Написать метод с уровнем доступа только внутри пакета, который будет возвращать количество опыта в месяцах;
5. Написать метод с уровнем доступа внутри пакета и для наследников в других пакетах, который выводит на экран имя и фамилию;
6. Написать метод с уровнем доступа отовсюду, который в одну строку будет выводить всю информацию о пользователе.
 */

public class Tester {
    public String name;
    public String surname;
    protected int experienceInYears;
    String englishLevel;
    private double salary;

    Tester(String name) {
        this.name = name;
    }

    Tester(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    Tester(String name, String surname, int experienceInYears) {
        this(name, surname);
        this.experienceInYears = experienceInYears;
    }

    //Конструктор с наибольшим числом параметров сделать с уровнем доступа отовсюду.
    public Tester(String name, String surname, int experienceInYears, int salary) {
        this(name, surname, experienceInYears);
        this.salary = salary;
    }

    //2. Написать для каждого поля get- и set- методы с уровнем доступа только внутри пакета. (friendly)
     String getName() {
        return name;
    }

     String getSurname() {
        return surname;
    }

     int getExperienceInYears() {
        return experienceInYears;
    }

     String getEnglishLevel() {
        return englishLevel;
    }

     double getSalary() {
        return salary;
    }

     void setName(String name) {
        this.name = name;
    }

     void setSurname(String surname) {
        this.surname = surname;
    }

     void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

     void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

     void setSalary(double salary) {
        this.salary = salary;
    }

//3. Написать метод с уровнем доступа только внутри класса, который будет возвращать salary*2;
    private double getDoubleSalary(){
        int  multiplier = 2;
        return salary * multiplier;
    }
//4.Написать метод с уровнем доступа только внутри пакета, который будет возвращать количество опыта в месяцах;
    int getExperienceInMonths(){
        int monthsInYears = 12;
        return experienceInYears * monthsInYears;
    }

//5. Написать метод с уровнем доступа внутри пакета и для наследников в других пакетах, который выводит на экран имя и фамилию;
    protected void printNameSurname(){
        String textForName = "Name and Surname: ";
        System.out.println(textForName+ name + " " + surname);
    }
//6. Написать метод с уровнем доступа отовсюду, который в одну строку будет выводить всю информацию о пользователе.
    public void printAllToString() {
        System.out.println( "Tester: " +
                "name = " + name +
                ", surname = " + surname  +
                ", experienceInYears = " + experienceInYears +
                ", englishLevel = " + englishLevel +
                ", salary = " + salary
        );
    }
}
