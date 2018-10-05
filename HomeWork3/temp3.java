package HomeWork3;

public class temp3 {

    public static void difference(int a, int b) {
        System.out.println("A-B=" + (a - b));
    }

    public static void sumOf3(int a, int b, int c) {
        System.out.println("A+B+C=" + (a + b + c));
    }

    public static int differenceReturn(int a, int b) {
        return (a - b);
    }

    public static int sumOf3Return(int a, int b, int c) {
        return (a + b + c);
    }

    public static void arrLength(int[] arr) {
        System.out.println("Array length:" + arr.length);
    }

    public static double sumOfDoubleArr(double[] arr) {
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        return sum;
    }
    public static void printFloatArr(float[] arr){
        for (float f:arr){
            System.out.print(f+" ");
        }
        System.out.println();
    }
    public static float[] replaceEach3(float[] arr){
        float[] newArr = new float[arr.length];
        for (int i =0; i<arr.length; i++){
            if(i%3==0){
                newArr[i]=-1f;
            }
            else {newArr[i]=arr[i];}
        }
        return newArr;

    }

    public static void main(String[] args) {
        difference(10, 5);
        sumOf3(1,2,3);
        System.out.println("A-B=" + differenceReturn(10, 5));
        System.out.println("A+B+C="+sumOf3Return(1,2,3));
        //int [] arr = Task2_1.builder();
       // Task2_1.printArray(arr);
      //  arrLength(arr);
        double[] doubleArr = {1.23, 4.56, 7.89};
        System.out.println("Sum of array of doubles: " + sumOfDoubleArr(doubleArr));
        float[] floatArr = {0f, 1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f};
        printFloatArr(floatArr);
        printFloatArr(replaceEach3(floatArr));



    }

}
