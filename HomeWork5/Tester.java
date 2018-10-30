package HomeWork5;
/*Создать класс Tester со следующими полями:
 -name
 -surname
 -experienceInYears
 -englishLevel
 -salary
 * 1. Перегрузить в этом классе 3 конструктора, каждый из которых будет
 последовательно вызывать другой используя this(...);
 2. Написать 3 любых перегруженных метода в этом классе
 3. Написать статический метод и показать пример его корректного вызова в другом
 классе
 */

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public static String nameCompany;

    public static String getNameCompany() {
        return nameCompany;
    }

    public Tester() {
    }

    public Tester(String name) {
        this.name = name;
    }

    public Tester(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname);
        this.experienceInYears = experienceInYears;
    }


    public double getClearSalary() {
        double percent = 0.8;
        return (salary * percent);
    }

    public  double getClearSalary(String surname) {
        double percentForIvanov = 0.9;
        double percent = 0.8;
        String bigDaddy = "Ivanov";
        return surname.equals(bigDaddy)
                ? this.salary - ((this.salary * percentForIvanov) / 100)
                : this.salary - ((this.salary * percent) / 100);
    }

    public double getClearSalary(int percent) {
        return this.salary - ((this.salary * percent) / 100);
    }

    public void print() {
        System.out.println(this.name + " " + this.surname + " " +
                this.experienceInYears + " " + this.englishLevel + " " + this.salary);
    }

    public void print(String separator) {
        System.out.println(this.name + separator + this.surname + separator +
                this.experienceInYears + separator + this.englishLevel + separator + this.salary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public double getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String name) {
        this.englishLevel = englishLevel;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
