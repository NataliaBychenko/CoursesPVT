package HomeWork14;

public class HomeWork14 {
    public static void main(String[] args) {
        int magicNumberOutsideArray = 10;
        Massive massive = new Massive();
        massive.enterSize();
        massive.initializeMassive();
        massive.initDescription();
        massive.findElementByIndex(magicNumberOutsideArray);
        massive.exchangeNeighboringElements(magicNumberOutsideArray);
    }

}
