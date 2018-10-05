package HomeWork5;

public class MainTester {
    public static void main(String[] args) {

        Tester tester = new Tester("Ivan", "Ivanov", 25);
        tester.setEnglishLevel("Elementary");
        tester.setSalary(2000);

        tester.print();
        tester.print(" / ");

        System.out.println("Salary = " + tester.getSalary());
        showClearSalary(tester.getClearSalary());
        showClearSalary(tester.getClearSalary("Ivanov"));
        showClearSalary(tester.getClearSalary(10));

        Tester.nameCompany = "EPAM";
        System.out.println(Tester.getNameCompany());
    }

    private static void showClearSalary(double clearSalary) {
        String salaryText = "Clear salary = ";
        System.out.println(salaryText + clearSalary);
    }
}