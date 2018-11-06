package HomeWork16;

public class Massive {


    public int[] createRandomMassive(int size) {
        int[] array = new int[size];
        int startLimit = 0;
        int endLimit = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = startLimit + (int) (Math.random() * (endLimit - startLimit));
        }
        return array;
    }

    public boolean checkAscArray(int[] array) {
        boolean temp = true;
        int i = 0;
        while (temp && i < array.length - 1) {
            if (array[i] - array[i + 1] > 0) {
                temp = false;
            }
            i++;
        }
        return temp;
    }

    public boolean checkDecrArray(int[] array) {
        boolean temp = true;
        int i = 0;
        while (temp && i < array.length - 1) {
            if (array[i] - array[i + 1] < 0) {
                temp = false;
            }
            i++;
        }
        return temp;
    }

    public int methodWithException() {
        return 10 / 0;
    }

    public int findCountZeroElement(int[] array) {
        int count = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == 0) {
                count++;
            }
            i++;
        }

        return count;
    }

    public Integer[] exchangeNeighboringElements(Integer[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i += 2) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        return array;
    }

    public int[] getReverseMassive(int[] array) {
        int reverseArray[] = array.clone();
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }

    public int[] moveElementsRight(int[] array, int step) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++) {
            int newIndex = i + step;
            if (newIndex < newArray.length) {
                newArray[newIndex] = array[i];
            } else {
                newArray[newIndex - newArray.length] = array[i];
            }
        }
        return newArray;
    }

    public boolean checkOnlyEvenNumbers(int[] array) {
        for (int i : array) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkOnlyOddNumbers(int[] array) {
        for (int i : array) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public int numberInSquare(int number) {
        return number * number;
    }

    public int[] allElementsInSquare(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = (int) Math.pow(array[i], 2);
        }
        return newArray;
    }

    public int getSumOfElements(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ;
    }

    public int productAllElements(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }


}
