package HomeWork15;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@Categories.IncludeCategory(iMassive.class)
@SuiteClasses(value = {MassiveTest.class, MassiveTestParametrized.class})

public class TestRunner {
}


