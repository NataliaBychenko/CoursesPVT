package HomeWork19;

import HomeWorks.HomeWork19.HomeWork19;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class HomeWork19Test {
    private WebDriver driver;
    private HomeWork19 homeWork19;
    private static final String BOOKING_URL = "https://www.booking.com";

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homeWork19 = new HomeWork19(driver);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(BOOKING_URL);
    }

    /* 1. Париж,
    2. текущая дата + 3 дня,
    3. на 7 дней.
    4. 2 взрослых.
    5. Отфильтровать самые дешевые,
    6. проверить, что такие отели есть.
    7. Выбрать с самым высоким рейтингом и проверить, что
    8. цена не превышает заданный диапазон.
     */
    @Test
    public void task1Test() {
        String city = "Париж";
        LocalDate inDate = LocalDate.now().plusDays(3);
        LocalDate outDate = LocalDate.now().plusDays(10);
        int expectedPrice = 10000;
        homeWork19.setInitialData(city, inDate, outDate);
        homeWork19.sortByPrice();
        Assert.assertTrue(homeWork19.getHotelList().size() > 0,
                "We are not going to Paris! =( ");
        homeWork19.sortByRating();
        Assert.assertTrue(homeWork19.getPriceFirst() <= expectedPrice,
                "\nActual price = " + homeWork19.getPriceFirst() + "\nExpected price = " + expectedPrice);
    }

    /*1. Париж,
     2. текущая дата + 3 дня,
     3. на 7 дней.
     4. 4 взрослых, 2 номера.
     5. Выбрать самый дешевый из самых дорогих,
     6. и проверить, что цена не ниже заданного диапазона.
    */
    @Test
    public void task2Test() {
        String city = "Париж";
        LocalDate inDate = LocalDate.now().plusDays(3);
        LocalDate outDate = LocalDate.now().plusDays(10);
        int countRooms = 2;
        int countAdults = 4;
        int expectedPrice = 1000;
        homeWork19.setInitialData(city, inDate, outDate, countRooms, countAdults);
        homeWork19.selectWithMorePrice();
        homeWork19.sortByPrice();
        Assert.assertTrue(homeWork19.getTotalPriceFirst() > expectedPrice,
                "Expected price = " + expectedPrice + "\nActual price = " + homeWork19.getTotalPriceFirst());
    }

    /*1. На отеле из предыдущего кейса забронировать номер,
    2. ввести все поля,
    3. ввести неверный номер карты и
    4. проверить, что появилось сообщение об ошибке.
    Номер карты – 4242 4242 4242 4242, остальные данные любые.
    * */
    @Test
    public void task3Test() {
        task2Test();
        homeWork19.getHotelList().get(0).click();
        ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(handles.size() - 1));
        homeWork19.clickBookButton();
        homeWork19.bookRoom(1);
        String firstName = "TestFirstName";
        String lastName = "TestLastName";
        String email = "TestEmail@gmail.com";
        homeWork19.setDataBooker(firstName, lastName, email);
        homeWork19.clickFinallyBookButton();
        String address = "TestAddress";
        String city = "TestCity";
        String phone = "291234567";
        homeWork19.setAddress(address, city, phone);
        String typeCard = "Visa";
        String numberCard = "4242424242424241";
        String validMonthNumber = "02";
        String validYearNumber = "2020";
        String cvcCodeCard = "424";
        homeWork19.setCardData(typeCard, numberCard, validMonthNumber, validYearNumber, cvcCodeCard);
        homeWork19.finishBookingButtonClick();
        String expectedErrorMessage = "Введите номер действительной кредитной карты";
        Assert.assertEquals(homeWork19.getErrorCardMessage(), expectedErrorMessage);
    }
    
    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
