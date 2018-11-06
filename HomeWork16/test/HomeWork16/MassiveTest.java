import HomeWork16.Massive;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.fail;

public class MassiveTest {
    Massive massive;

    @DataProvider
    public Object[][] DataForMultiplications() {
        return new Object[][]
                {
                        {2, 4},
                        {5, 25},
                        {3, 9},
                };
    }

    @BeforeSuite
    public void beforeSuite() {
        massive = new Massive();
        System.out.println("The game's starting.");
    }

    @AfterSuite
    public void afterSuite() {
        massive = null;
        System.out.println("it`s all.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("@BeforeGroups");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("@AfterGroups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod");
    }

    @Test(timeOut = 6000)
    public void initMassiveTest() {
        int size = 3;
        Assert.assertNotNull(massive.createRandomMassive(size), "Massive is not initialised.");
    }

    @Test(expectedExceptions = NegativeArraySizeException.class)
    public void initMassiveSizeNullTest() {
        int size = -1;
        massive.createRandomMassive(size);
    }

    @Test(groups = "FirstGroup")
    public void initMassiveSizeTest() {
        int size = 3;
        Assert.assertEquals(massive.createRandomMassive(size).length, size,
                "Array size is not equal to the specified.");
    }

    @Test(enabled = false)
    public void ignoredTest() {
        System.out.println("Smt ignored.");
    }

    @Test
    public void arrayIsAscendingTest() {
        int[] array = {1, 2, 3, 4, 5};
        Assert.assertTrue(massive.checkAscArray(array),
                "The array must be increasing.");
    }

    @Test
    public void arrayIsNotAscendingTest() {
        int[] array = {2, 1, 3, 5, 4};
        Assert.assertFalse(massive.checkAscArray(array),
                "The array must be non-incremental.");
    }

    @Test
    public void arrayIsDecreasingTest() {
        int[] array = {5, 4, 3, 2, 1};
        Assert.assertTrue(massive.checkDecrArray(array),
                "The array must be decreasing.");
    }

    @Test
    public void arrayIsNotDecreasingTest() {
        int[] array = {5, 4, 2, 1, 3};
        Assert.assertFalse(massive.checkDecrArray(array),
                "The array must be non-decreasing..");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void exceptionTest() {
        massive.methodWithException();
    }

    @Test
    public void findCountZeroElementsTest() {
        int expectedResult = 1;
        int[] array = {1, 2, 0, 4, 5};
        Assert.assertEquals(massive.findCountZeroElement(array), expectedResult,
                "Count zero elements is not equals expected result.");
    }

    @Test
    public void exchangeNeighboringElementsTest() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        Integer[] expectedResult = {2, 1, 4, 3, 6, 5, 7};
        Integer[] actualResult = massive.exchangeNeighboringElements(array);
        Assert.assertEqualsNoOrder(actualResult, expectedResult,
                "Elements of the array have not changed.");
    }

    @Test
    public void reverseArrayTest() {
        int[] array = {1, 2, 3, 4, 5};
        int[] revertArray = massive.getReverseMassive(array);
        Assert.assertNotEquals(revertArray, array,
                "Revert array equals array. ");
        Assert.assertEquals(massive.getReverseMassive(revertArray), array,
                "Revert array equals array.");
    }

    @Test
    public void moveElementsRightTest() {
        int step = 2;
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedResult = {4, 5, 1, 2, 3};
        int[] actualResult = massive.moveElementsRight(array, step);
        Assert.assertEquals(actualResult, expectedResult,
                "Revert array equals array.");
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void moveElementsRightExceptionTest() {
        int step = -2;
        int[] array = {1, 2, 3, 4, 5};
        massive.moveElementsRight(array, step);
    }

    @Test
    public void onlyEvenNumbersTest() {
        int[] array = {2, 4, 6, 8, 10};
        Assert.assertTrue(massive.checkOnlyEvenNumbers(array),
                "Array contains not only even numbers.");
    }

    @Test
    public void NotOnlyEvenNumbersTest() {
        int[] array = {2, 4, 6, 8, 9};
        Assert.assertFalse(massive.checkOnlyEvenNumbers(array),
                "Array contains only even numbers.");
    }

    @Test
    public void onlyOddNumbersTest() {
        int[] array = {1, 3, 5, 7, 9};
        Assert.assertTrue(massive.checkOnlyOddNumbers(array),
                "Array contains not odd even numbers.");
    }

    @Test
    public void NotOnlyOddNumbersTest() {
        int[] array = {1, 3, 5, 7, 10};
        Assert.assertFalse(massive.checkOnlyOddNumbers(array),
                "Array contains only odd numbers.");
    }

    @Test(dataProvider = "DataForMultiplications")
    public void numberInSquareTest(int number, int multi) {
        Assert.assertEquals(massive.numberInSquare(number), multi);
    }

    @Test
    public void allElementsInSquareTest() {
        int[] array = {1, 3, 5, 7, 10};
        int [] expectedResult = {1, 9, 25, 49, 100};
        int [] actualResult = massive.allElementsInSquare(array);
        Assert.assertEquals(actualResult, expectedResult,
                "Element not in square.");
    }

    @Test
    public void sumOfElementsTest() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int expectedResult = 15;
        int actualResult = massive.getSumOfElements(array);
        Assert.assertTrue(actualResult == expectedResult,
                "Sum isn't correct. " );
    }

    @Test
    public void productAllElementsTest() {
        int[] array = new int[]{1, 2, 3};
        int expectedResult = 6;
        int actualResult = massive.productAllElements(array);
        Assert.assertEquals( actualResult, expectedResult,
                "Product isn't correct");
    }

    @Test
    public void sumOfElementsFalseTest() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int expectedResult = 20;
        int actualResult = massive.getSumOfElements(array);
        Assert.assertFalse(actualResult == expectedResult,
                "Sum isn't correct. " );
    }

    @Test
    public void productAllElementsFalseTest() {
        int[] array = new int[]{1, 2, 3};
        int expectedResult = 10;
        int actualResult = massive.productAllElements(array);
        Assert.assertNotEquals( actualResult, expectedResult,
                "Product isn't correct");
    }

    @Test (priority = 1)
    public void lastTest() {
        fail();
        System.out.println("My fantasy is over. Sorry =(");
    }

}
