package HomeWork13;

public class HomeWork13_Main {

    public static void main(String[] args) {
        String separatorLine = "~~~~~~~~~~~~~~~~~~~";

        Page page = new Page();
        invokeAllMethodsForButton(page);
        System.out.println(separatorLine);
        invokeAllMethodsForField(page);
        System.out.println(separatorLine);
        invokeAllMethodsForLabel(page);
        System.out.println(separatorLine);
        invokeAllMethodsForDropdown(page);
    }

    private static void invokeAllMethodsForButton(Page page) {
        Button button1 = new Button("button_1", "Smt action_1");
        Button button2 = new Button("button_2","Smt action_2");
        Button button3 = new Button("button_3", "Smt action_3");
        Button button4 = new Button("button_4", "Smt action_4");

        page.add(button1);
        page.add(button2);
        page.add(button3);
        page.printAllButtons();
        System.out.println();
        page.remove(button1);
        page.printAllButtons();
        System.out.println();
        page.replace(button2,button4);
        page.printAllButtons();
    }

    private static void invokeAllMethodsForField(Page page) {
        Field field1 = new Field(1,"field_1");
        Field field2 = new Field(2,"field_2");
        Field field3 = new Field(3,"field_3");
        Field field4 = new Field(4,"field_4");

        page.add(field1);
        page.add(field2);
        page.add(field3);
        page.printAllFields();
        System.out.println();
        page.remove(field1);
        page.printAllFields();
        System.out.println();
        page.replace(field2,field4);
        page.printAllFields();
    }

    private static void invokeAllMethodsForLabel(Page page) {
        Label label1 = new Label("label_1");
        Label label2 = new Label("label_2");
        Label label3 = new Label("label_3");
        Label label4 = new Label("label_4");

        page.add(label1);
        page.add(label2);
        page.add(label3);
        page.printAllLabels();
        System.out.println();
        page.remove(label1);
        page.printAllLabels();
        System.out.println();
        page.replace(label2,label4);
        page.printAllLabels();
    }

    private static void invokeAllMethodsForDropdown(Page page) {
        Dropdown dropdown1 = new Dropdown("dropdown_1");
        Dropdown dropdown2 = new Dropdown("dropdown_2");
        Dropdown dropdown3 = new Dropdown("dropdown_3");
        Dropdown dropdown4 = new Dropdown("dropdown_4");

        page.add(1,dropdown1);
        page.add(2,dropdown2);
        page.add(3,dropdown3);
        page.printAllDropdowns();
        System.out.println();
        page.remove(dropdown1);
        page.printAllDropdowns();
        System.out.println();
        page.replace(dropdown2,dropdown4);
        page.printAllDropdowns();
    }
}
