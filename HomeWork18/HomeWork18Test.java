package HomeWorks.HomeWork18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork18Test {

    WebDriver driver;
    String bookingUrl = "https://www.booking.com";


    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(bookingUrl);
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }

    void setDate(LocalDate inDate, LocalDate outDate) {
        WebElement calendar = driver.findElement(By.xpath(".//div[@class='xp__dates-inner xp__dates__checkin']"));
        calendar.click();
        driver.findElement(By.xpath("//table//td[@data-date='" + inDate.toString() + "']")).click();
        driver.findElement(By.xpath("//table//td[@data-date='" + outDate.toString() + "']")).click();
    }

    void goToMoscow() {
        driver.get(bookingUrl);
        String city = "Москва";
        WebElement enterCity = driver.findElement(By
                .xpath(".//input[@id='ss']"));
        enterCity.sendKeys(city);
        setDate(LocalDate.now().plusDays(1), LocalDate.now().plusDays(2));
        WebElement checkPriceButton = driver.findElement(By
                .xpath(".//span[text()='Проверить цены']"));
        checkPriceButton.click();
    }

    /* Задание 1:
     * 1. Перейти на сайт booking
     * 2. Ввести в поиск "Москва", выбрать для проживания 2 гостей и 1 номер.
     * 3. Проверить, что в Москве есть отели на введенные даты.
     */
    @Test
    public void findHotelsInMoscowTest() {
        goToMoscow();
        List<WebElement> hotelList = driver.findElements(By
                .xpath(".//span[@class[contains(.,'sr-hotel__name')]]"));
        Assert.assertTrue(hotelList.size() > 0,
                "We are not going to Moscow! =( ");
    }

    /* Задание 2:
     * 1. Перейти на сайт booking
     * 2. Ввести в поиск "Москва", выбрать для проживания 2 гостей и 1 номер.
     * 3. Отфильтровать отели с максимальным рейтингом.
     * 4. Открыть страницу с первым таким отелем и проверить, что его рейтинг >= 9.
     */
    @Test(priority = 1)
    public void findBestHotelInMoscowTest() {
        goToMoscow();
        WebElement sortHotel = driver.findElement(By
                .xpath(".//a[@data-category='review_score_and_price']"));
        sortHotel.click();
        WebElement firstHotel = driver.findElement(By
                .xpath("(.//a[@class='hotel_name_link url'])[1]"));
       /* WebElement firstHotel = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("(.//a[@class='hotel_name_link url'])[1]")));*/
      //  driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        firstHotel.click();
        driver.getWindowHandle();
        driver.switchTo().window(driver.getWindowHandle());
        Double rating = Double.valueOf(driver.findElement(By
                .xpath(".//div[@class='bui-review-score__badge']")).getText());
        System.out.println(rating);
        Assert.assertTrue(rating >=9,
                "It's not cool hotel.");
    }
}
