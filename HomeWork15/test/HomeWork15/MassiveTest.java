package HomeWork15;

import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MassiveTest {
    Massive mass;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Run Test for Massive.");
    }

    @Before
    public void before() {
        mass = new Massive();
    }

    @After
    public void after() {
        mass = null;
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("End Test for Massive.");
    }


    @Test(expected = ArithmeticException.class)
    public void exceptionTest() {
        mass.methodWithException();
    }

    @Test
    public void reverseArrayTest() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] revertArray = mass.getReverseMassive(array);
        Assert.assertFalse("Revert array equals array. ", array.equals(revertArray));
        Assert.assertArrayEquals("Revert array equals array. ", array, mass.getReverseMassive(revertArray));
    }

    @Test
    public void sumOfElementsTest() {
        int[] array = new int[]{1, 2, 3, 4, 5};

        int expectedResult = 15;
        int actualResult = mass.getSumOfElements(array);
        assertTrue("Sum isn't correct. ", expectedResult == actualResult);
    }

    @Test(timeout = 6000)
    public void productAllElementsTest() {
        int[] array = new int[]{1, 2, 3};
        int expectedResult = 6;
        int actualResult = mass.productAllElements(array);
        assertEquals("Product isn't correct", expectedResult, actualResult);
    }

    @Test
    @Ignore ("Nobody needs me =( ")
    public void ignoredTest() {
        System.out.println("Smt ignored.");
    }

    @Test
    public void arrayIsAscendingTest() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        Assert.assertTrue(mass.checkAscArray(array));
    }

    @Test
    public void arrayIsNotAscendingTest() {
        int[] array = new int[]{5, 4, 3, 2, 1};
        Assert.assertFalse(mass.checkAscArray(array));
    }

    @Test
    public void multipleBy3Test() {
        int [] array = new int[]{1, 2, 3, 4, 5};
        int [] expectedResult = new int[]{1, 2, 6, 4, 5};
        int [] actualResult = mass.multipleBy3(array);
        assertArrayEquals("multipleBy3 isn't correct. ", expectedResult, actualResult);
    }

    @Test
    @Category(iMassive.class)
    public void CountZeroElementTest() {
        int [] array = new int[]{1, 2, 0, 4,0};
        int  expectedResult = 2;
        int  actualResult = mass.findCountZeroElement(array);
        assertEquals("findCountZeroElement isn't correct. ", expectedResult, actualResult);
    }

    @Test
    public void testNotNull() {
        int [] array = new int[]{1, 2, 3, 4, 5};
        Assert.assertNotNull(array);
    }
}
