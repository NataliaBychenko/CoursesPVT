package HomeWork21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class BookingPageTest {
    private WebDriver driver;
    private BookingPage bookingPage;
    private static final String CITY = "Москва";

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        bookingPage = new BookingPage(driver);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(bookingPage.getBookingUrl());
    }

    /* Задание 1:
     * 1. Перейти на сайт booking
     * 2. Ввести в поиск "Москва", выбрать для проживания 2 гостей и 1 номер.
     * 3. Проверить, что в Москве есть отели на введенные даты.
     */
    @Test
    public void findHotelsInCityTest() {
        LocalDate inDate = LocalDate.now().plusDays(3);
        LocalDate outDate = LocalDate.now().plusDays(4);
        int countRooms = 1;
        int countAdults = 2;
        bookingPage.setInitialData(CITY, inDate, outDate, countRooms, countAdults);
        Assert.assertTrue(bookingPage.getHotelList().size() > 0,
                "We are not going to " + CITY + "! =( ");
    }

    /* Задание 2:
     * 1. Перейти на сайт booking
     * 2. Ввести в поиск "Москва", выбрать для проживания 2 гостей и 1 номер.
     * 3. Отфильтровать отели с максимальным рейтингом.
     * 4. Открыть страницу с первым таким отелем и проверить, что его рейтинг >= 9.
     */
    @Test(priority = 1)
    public void findBestHotelInMoscowTest() {
        LocalDate inDate = LocalDate.now().plusDays(3);
        LocalDate outDate = LocalDate.now().plusDays(4);
        int countRooms = 1;
        int countAdults = 2;
        int expectedRating = 9;
        bookingPage.setInitialData(CITY, inDate, outDate, countRooms, countAdults);
        bookingPage.sortByRating();
        bookingPage.getHotelList().get(0).click();
        driver.switchTo().activeElement();
        Assert.assertTrue(bookingPage.getHotelRating() >= expectedRating,
                "It's not cool hotel.");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
