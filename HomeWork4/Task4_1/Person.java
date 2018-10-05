package HomeWork4.Task4_1;

/**
 * 1. Создать класс Person со следующими полями:
 * name
 * surname
 * age
 * phone
 * <p>
 * Создать объект этого класса Person person и инициализировать его при помощи методов get- и set-.
 * Добавить в класс следующие методы:
 * метод printAllInformation(), который выводит на экран всю информацию о пользователе (name + surname + age +  phone) в одну строку;
 * метод printName(), который выводит только имя и фамилию (name + surname) пользователя;
 * метод isAdult(), который возвращает значения true/false в зависимости от age объекта (> 18);
 * Пример вызова каждого из методов показать в методе main в другом классе.
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    public void printAllInformation() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Phone: " + phone + ".");
    }

    public void printName() {
        System.out.println("Name and Surname: " + name + " " + surname + ".");
    }

    public boolean isAdult() {
        if (age >= 18) {
            System.out.println(name + " isAdult  = true.");
            return true;
        } else
            System.out.println(name + " isAdult  = false.");
        return false;

    }


}
