package HomeWork8;

/**
 Дополнительное домашнее задание:
 Написать такой конструктор, который запретит создание объекта класса Tester в других классах;
 Найти способ вызывать методы класса Tester, который позволит обойти ограничение, наложенное конструктором выше.
 Объяснить, как работают оба способа.

 */
//спрятать в приватность дефолтный конструктор, тогда нельзя будет вызвать его извне
class PrivateTester {

    private PrivateTester() {
    }

//внутри класса вызвать создание и вернуть готовый объект.
     public static PrivateTester createPrivateTester() {
        return new PrivateTester();
    }

     void printMess (){
        System.out.println("I have access to class methods.");
    }

}

