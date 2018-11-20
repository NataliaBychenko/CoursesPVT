package HomeWork20;

import HomeWorks.HomeWork20.MailPage;
import HomeWorks.HomeWork20.LoginPage;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MailPageTest {
    private WebDriver driver;
    private MailPage mailPage;
    private LoginPage loginPage;
    private static final String MAILRU_URL = "https://mail.ru/";
    private static final String EMAIL = "my_test_email2018";
    private static final String PASSWORD = "p1a2s3s";
    private static final int TIMEOUT_FOR_IMPLICITLY = 10;
    private static final int TIMEOUT_FOR_LOAD = 60;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT_FOR_IMPLICITLY, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TIMEOUT_FOR_LOAD, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(MAILRU_URL);
        loginPage = new LoginPage(driver);
        mailPage = new MailPage(driver);
        loginPage.enterLoginAndPass(EMAIL, PASSWORD);
        loginPage.clickEnterButton();
    }

    @BeforeMethod
    public void beforeMethod() {
        mailPage.goToIncomingFolder();
    }

    //  перемещение письма в Спам
    @Test(priority = 1)
    public void moveToSpamTest() {
        String titleLetter = mailPage.getLettersList()
                .get(0).getAttribute("data-subject");
        mailPage.moveLetterToSpam(0);
        mailPage.goToSpam();
        String titleLetterSpam = mailPage.getLettersList()
                .get(mailPage.getLettersList().size() - 1)
                .getAttribute("data-subject");
        Assert.assertEquals(titleLetterSpam, titleLetter);
    }

    //  извлечение письма из Спама
    @Test(priority = 2)
    public void extractFromSpamTest() {
        mailPage.goToSpam();
        String titleLetter = mailPage.getLettersList()
                .get(0).getAttribute("data-subject");
        mailPage.extractLetterFromSpam(0);
        mailPage.goToIncomingFolder();
        Assert.assertNotEquals(titleLetter, mailPage.getLettersList()
                .get(0).getAttribute("data-subject"));
    }

    //   отправка сообщения группе пользователей
    @Test(priority = 5)
    public void sendMessToGroupTest() {
        String recipients = "my_test_email2018@mail.ru, TestTest@mail.ru";
        String topic = "TestTopic";
        String text = "Text for text letter.";
        mailPage.sentLetter(recipients, topic, text);
        String expectedMess = "Ваше письмо отправлено. Перейти во Входящие";
        Assert.assertEquals(expectedMess, mailPage.getMessageSentTitle());
    }

    //   пометить 3 письма флажком
    @Test(priority = 3)
    public void mark3LettersFlagTest() {
        int numberMarked = 3;
        mailPage.markFlagOfFirst(numberMarked);
        Assert.assertEquals(mailPage.flagsList.size(), numberMarked);
    }

    //   снять отметку флажка со всех писем
    @Test(priority = 4)
    public void deselectAllFlagsTest() {
        mailPage.removeAllFlag();
        Assert.assertFalse(mailPage.getMarkTheFlag().size() > 0);
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}