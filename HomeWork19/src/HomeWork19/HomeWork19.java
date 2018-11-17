package HomeWorks.HomeWork19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.util.List;

public class HomeWork19 {

    private WebDriver driver;

    @FindBy(xpath = ".//input[@id='ss']")
    private WebElement enterCity;

    @FindBy(xpath = ".//div[@class='xp__dates-inner xp__dates__checkin']")
    private WebElement calendar;

    @FindBy(xpath = ".//span[@class= 'xp__guests__count']")
    private WebElement informationOfGuest;

    @FindBy(xpath = "(.//span[@data-bui-ref= 'input-stepper-value'])[1]")
    private WebElement roomsCount;

    @FindBy(xpath = "(.//*[@data-bui-ref= 'input-stepper-add-button'])[1]")
    private WebElement roomsPlus;

    @FindBy(xpath = "(.//*[@data-bui-ref= 'input-stepper-subtract-button'])[1]")
    private WebElement roomsMinus;

    @FindBy(xpath = ".//select[@id='no_rooms']")
    private List<WebElement> selectForRooms;

    @FindBy(xpath = "(.//span[@data-bui-ref= 'input-stepper-value'])[2]")
    private WebElement adultsCount;

    @FindBy(xpath = "(.//*[@data-bui-ref= 'input-stepper-add-button'])[2]")
    private WebElement adultsPlus;

    @FindBy(xpath = "(.//*[@data-bui-ref= 'input-stepper-subtract-button'])[2]")
    private WebElement adultsMinus;

    @FindBy(xpath = ".//select[@name='group_adults']")
    private List<WebElement> selectForAdults;

    @FindBy(xpath = ".//span[text()='Проверить цены']")
    private WebElement checkPriceButton;

    @FindBy(xpath = ".//a[@data-category='price']")
    private WebElement sortByPrice;

    @FindBy(xpath = ".//a[@data-category='review_score_and_price']")
    private WebElement sortByRating;

    @FindBy(xpath = ".//span[@class[contains(.,'sr-hotel__name')]]")
    private List<WebElement> hotelList;

    @FindBy(xpath = ".//div[@class ='sr--usp-overlay sr--usp-overlay--wide']")
    private List<WebElement> waitMe;

    @FindBy(xpath = ".//*[normalize-space(@class) = 'price availprice no_rack_rate']")
    private List<WebElement> priceList;

    @FindBy(xpath = " (.//div[normalize-space(@class) = 'totalPrice totalPrice_no-rack-rate entire_row_clickable'])[1]")
    private List<WebElement> totalPriceList;

    @FindBy(xpath = "//*[@id='filter_price']//a[@data-name= 'pri']")
    private List<WebElement> selectByPrice;

    @FindBy(xpath = "(.//select[@class='hprt-nos-select'])[1]")
    private List<WebElement> selectByBookRoom;

    @FindBy(xpath = ".//div[@data-component='hotel/new-rooms-table/reservation-cta']")
    private WebElement bookButton;

    @FindBy(xpath = "//*[@id='booker_title']")
    private List<WebElement> bookerTitle;

    @FindBy(xpath = "//*[@id='firstname']")
    private WebElement firstNameBooker;

    @FindBy(xpath = "//*[@id='lastname']")
    private WebElement lastNameBooker;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailBooker;

    @FindBy(xpath = "//*[@id='email_confirm']")
    private WebElement emailConfirmBooker;

    @FindBy(xpath = "//*[@name='book']")
    private WebElement finallyBookButton;

    @FindBy(xpath = "//*[@id='address1']")
    private List<WebElement> addressList;

    @FindBy(xpath = "//*[@id='city']")
    private WebElement cityBooker;

    @FindBy(xpath = "//*[@id='phone']")
    private WebElement phoneBooker;

    @FindBy(xpath = "//*[@id='cc_type']")
    private List<WebElement> cardType;

    @FindBy(xpath = "//*[@id='cc_number']")
    private WebElement cardNumber;

    @FindBy(xpath = "//*[@id='cc_month']")
    private List<WebElement> validCard_month;

    @FindBy(xpath = "//*[@id='ccYear']")
    private List<WebElement> validCard_year;

    @FindBy(xpath = "//*[@id='cc_cvc']")
    private WebElement cvcCode;

    @FindBy(xpath = "(//*[@id='bookwrapper_cell']//button[@type = 'submit'])[2]")
    private WebElement finishBookingButton;

    @FindBy(xpath = "//*[@id='bp_form_cc_number_msg']")
    private WebElement errorCardMessage;

    public HomeWork19(WebDriver webdriver) {
        PageFactory.initElements(webdriver, this);
        driver = webdriver;
    }

    public void setInitialData(String city, LocalDate inDate, LocalDate outDate, int countRooms, int countAdults) {
        enterCity.sendKeys(city);
        setDate(inDate, outDate);
        informationOfGuest.click();
        setCountRooms(countRooms);
        setCountAdults(countAdults);
        checkPriceButton.click();
    }

    public void setInitialData(String city, LocalDate inDate, LocalDate outDate) {
        enterCity.sendKeys(city);
        setDate(inDate, outDate);
        checkPriceButton.click();
    }

    private void setCountRooms(int countRooms) {
        if (selectForRooms.size() > 0) {
            new Select(selectForRooms.get(0))
                    .selectByIndex(countRooms - 1);
        } else {
            if (countRooms > Integer.parseInt(roomsCount.getText())) {
                while (countRooms != Integer.parseInt(roomsCount.getText()))
                    roomsPlus.click();
            }
            if (countRooms < Integer.parseInt(roomsCount.getText())) {
                while (countRooms != Integer.parseInt(roomsCount.getText()))
                    roomsMinus.click();
            }
        }
    }

    private void setCountAdults(int countAdults) {
        if (selectForAdults.size() > 0) {
            new Select(selectForAdults.get(0))
                    .selectByIndex(countAdults - 1);
        } else {
            if (countAdults > Integer.parseInt(adultsCount.getText())) {
                while (countAdults != Integer.parseInt(adultsCount.getText()))
                    adultsPlus.click();
            }
            if (countAdults < Integer.parseInt(adultsCount.getText())) {
                while (countAdults != Integer.parseInt(adultsCount.getText()))
                    adultsMinus.click();
            }
        }
    }

    private void setDate(LocalDate inDate, LocalDate outDate) {
        calendar.click();
        driver.findElement(By.xpath("//table//td[@data-date='" + inDate.toString() + "']")).click();
        driver.findElement(By.xpath("//table//td[@data-date='" + outDate.toString() + "']")).click();
    }

    public void sortByPrice() {
        sortByPrice.click();
        waitingDownload(waitMe);
    }

    public void sortByRating() {
        sortByRating.click();
        waitingDownload(waitMe);
    }

    public List<WebElement> getHotelList() {
        return hotelList;
    }

    private void waitingDownload(List<WebElement> waitSmth) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions
                .invisibilityOfAllElements(waitSmth));
    }

    private void waitingForClick(WebElement waitSmth) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions
                .elementToBeClickable(waitSmth));
    }

    public int getPriceFirst() {
        return Integer.parseInt(priceList.get(0)
                .getText()
                .substring(4)
                .replace(" ", ""));
    }

    public int getTotalPriceFirst() {
        String totalPrice = totalPriceList.get(0).getText();
        return Integer.parseInt(
                totalPrice.substring(totalPrice.indexOf("BYN") + 3, totalPrice.indexOf("+") - 1)
                        .replace(" ", ""));
    }

    public void selectWithMorePrice() {
        selectByPrice.get(selectByPrice.size() - 1)
                .click();
        waitingDownload(waitMe);
    }

    public void bookRoom(int countRooms) {
        new Select(selectByBookRoom.get(0)).selectByIndex((countRooms));
        waitingForClick(bookButton);
        clickBookButton();
    }

    public void clickBookButton() {
        bookButton.click();
    }

    public void setDataBooker(String firstName, String lastName, String email) {
        new Select(bookerTitle.get(0)).selectByIndex(2);
        firstNameBooker.sendKeys(firstName);
        lastNameBooker.sendKeys(lastName);
        emailBooker.sendKeys(email);
        emailConfirmBooker.sendKeys(email);
    }

    public void clickFinallyBookButton() {
        finallyBookButton.click();
    }

    public void setAddress(String address, String city, String phone) {
        if (addressList.size() > 0) {
            addressList.get(0).sendKeys(address);
            cityBooker.sendKeys(city);
        }

        phoneBooker.sendKeys(phone);
    }

    public void setCardData(String typeCard, String numberCard, String validMonthNumber, String validYearNumber, String cvcCodeCard) {
        new Select(cardType.get(0)).selectByValue(typeCard);
        cardNumber.sendKeys(numberCard);
        new Select(validCard_month.get(0)).selectByValue(validMonthNumber);
        new Select(validCard_year.get(0)).selectByValue(validYearNumber);
        cvcCode.sendKeys(cvcCodeCard);
    }

    public String finishBookingButtonClick() {
        return finishBookingButton.getText();
    }

    public String getErrorCardMessage() {
        return errorCardMessage.getText().trim();
    }
}
