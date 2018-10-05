package HomeWork4.Task4_1;

import HomeWork4.Task4_1.Person;

public class Main {
    public static void main(String args[]){
        Person person1 = new Person();
        person1.setName("Ivan");
        person1.setSurname("Ivanov");
        person1.setAge(15);
        person1.setPhone("+37533123-45-67");

        person1.printAllInformation();
        person1.printName();
        person1.isAdult();
        System.out.println("Name: "+person1.getName() + ".");
        System.out.println("Surname: "+person1.getSurname() + ".");
        System.out.println("Age: "+person1.getAge() + ".");
        System.out.println("Phone: "+person1.getPhone() + ".");
    }
}
