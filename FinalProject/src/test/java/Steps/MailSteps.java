package Steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mailRu.Config;
import mailRu.helpers.driver.DriverFactory;
import mailRu.helpers.model.Parameters;
import mailRu.helpers.parseDOM.DomParserParameters;
import mailRu.page.LoginPage;
import mailRu.page.MailPage;
import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.xml.sax.SAXException;
import ru.yandex.qatools.allure.annotations.Attachment;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class MailSteps extends Config {
    private static final Logger logger = Logger.getLogger(MailSteps.class);
    private static final DomParserParameters parser = new DomParserParameters();

    private MailPage mailPage;
    private LoginPage loginPage;
    private Parameters parameters;
    private String actualText;

    public MailSteps() throws IOException, SAXException, ParserConfigurationException {
        initDriver();
        driver.get(url);
        loginPage = new LoginPage(driver);
        loginPage.enterLoginAndPass(login, password);
        loginPage.clickEnterButton();
        Assert.assertTrue(loginPage.logoutLinkPresents());
        mailPage = new MailPage(driver);
        parameters = parser.parse();
        logger.info("open page " + url + " and correct login.");
    }


    @Given("^I am on mail page$")
    public void loadMainPage() {
        mailPage.checkPage();
        logger.info("I am on mail page");
    }

    @When("^I move the first letter in spam$")
    public void moveLetterToSpam() {
        mailPage.moveLetterToSpam(0);
        actualText = mailPage.getNotifyMessage();
        logger.info("move the first letter in spam");
    }

    @When("^I go to the spam folder$")
    public void goToSpamFolder() {
        mailPage.goToSpam();
        logger.info("I go to the spam folder");
    }

    @Then("^I see valid message about moving to spam$")
    public void seeSelectedLetterInSpam() {
        String expectedTest = parameters.getMoveToSpamValidText();
        Assert.assertEquals(actualText, expectedTest);
        logger.info("I see valid message about moving to spam");
    }


    @When("^I extract the first letter in spam$")
    public void extractFirstLetterInSpam() {
        mailPage.extractLetterFromSpam(0);
    }


    @Then("^I see valid message about extract to spam$")
    public void SeeValidMessageAboutExtractToSpam() {
        String expectedTest = parameters.getExtractFromSpamValidText();
        actualText = mailPage.getNotifyMessage();
        Assert.assertEquals(actualText, expectedTest);
    }


    @Given("^I send letter$")
    public void sendLetter() {
        String recipients = parameters.getRecipients();
        String topic = parameters.getTopicLetter();
        String text = parameters.getTextLetter();
        mailPage.sendLetter(recipients, topic, text);
    }

    @Then("^I see valid message about send message$")
    public void seeValidMessageAboutSendMessage() {
        String expectedMess = parameters.getSendLetterValidText();
        Assert.assertEquals(mailPage.getMessageSentTitle(), expectedMess);
    }

    @Given("^I go to the incoming folder$")
    public void goToTheIncomingFolder() {
        mailPage.goToIncomingFolder();
    }

    @When("^I mark flag of first three letters$")
    public void markFlagOfFirstThreeLetters() {
        int numberMarked = 3;
        mailPage.markFlagOfFirst(numberMarked);
    }

    @Then("^I see mark flag on letters$")
    public void seeMarkFlagOnLetters() {
        int numberMarked = 3;
        Assert.assertEquals(mailPage.flagsList.size(), numberMarked);
    }

    @When("^I remove all flag on letters$")
    public void iRemoveAllFlagOnLetters() {
        mailPage.removeAllFlag();
    }

    @Then("^I not see mark flag on letters$")
    public void iNotSeeMarkFlagOnLetters() {
        Assert.assertFalse(mailPage.getMarkTheFlag().size() > 0);
    }

    @Attachment(value = "Attachment Screenshot", type = "image/png")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @After
    public void afterClass() {
        makeScreenshot();
        closeDriver();
        logger.info("test  on mail page are finish.");
    }


}
