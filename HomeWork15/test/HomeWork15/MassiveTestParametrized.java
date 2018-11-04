package HomeWork15;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class MassiveTestParametrized
{
    private ArrayList<Integer> values;
    @Parameterized.Parameters
    public static Collection<Object[]> set_of_parameters()
    {
        return Arrays.asList( new Object[][] {
                { new ArrayList<>(Arrays.asList(1, 2, 3, 6 ))} ,
                { new ArrayList<>(Arrays.asList(1, 0, 0, 1 ))} ,
                { new ArrayList<>(Arrays.asList(5, 5, 5, 15 ))} ,
        } );
    }
    public MassiveTestParametrized(ArrayList<Integer> values)
    {
        this.values = values;
    }

    @Test
    public void sumOfElementsTest() {
        Massive mass = new Massive();
        int[] array = new int[values.size()-1];
        for (int i = 0; i < values.size()-1; i++) {
            array[i] = values.get(i);
        }
        int expectedResult = values.get(values.size()-1);
        int actualResult = mass.getSumOfElements(array);
        assertEquals("Sum isn't correct. ", expectedResult , actualResult, 0.0);
    }
}