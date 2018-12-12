package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;

import mailRu.Config;
import mailRu.helpers.driver.DriverFactory;
import mailRu.page.LoginPage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Attachment;

public class LoginSteps extends Config {
    private static final Logger logger = Logger.getLogger(LoginSteps.class);
    private LoginPage loginPage;

    public LoginSteps() {
        logger.info("Tests are starting.");
        initDriver();
        loginPage = new LoginPage(driver);
        logger.info("page initialization finished.");
    }

    @Given("^I am on main application page$")
    public void loadMainPage(){
        driver.get(url);
        logger.info("loading page with the url " + url);
    }

    @When("^I login as correct user$")
    public void loginAsCorrectUser() {
        loginPage.enterLoginAndPass(login, password);
        loginPage.clickEnterButton();
        logger.info("I login as correct user: login =  " + login + ", pass = " + password);
    }

    @When("^I login as user with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void loginAsUserWithCredentials(String testLogin, String testPassword) {
        loginPage.enterLoginAndPass(testLogin, testPassword);
        loginPage.clickEnterButton();
        logger.info("I login as user with login =  " + testLogin + ", pass = " + testPassword);
    }

    @Then("I see logout link")
    public void seeLogoutLink() {
        Assert.assertTrue(loginPage.logoutLinkPresents());
        logger.info("I see logout link");
    }

    @Then("I see error message")
    public void seeErrorMessage() {
        Assert.assertTrue(loginPage.logoutLinkErrorPresents());
        logger.info("I see error message");
    }

    @When("^I click logout button$")
    public void clickLogoutButton() {
        loginPage.clickLogoutButton();
        logger.info("I click logout button");
    }

    @Then("I see main application page")
    public void seeMainPage() {
        loginPage.checkPage();
        logger.info("I see main application page");
    }

    @When("^I click image link$")
    public void clickImageLink() {
        loginPage.clickImageLink();
    }

    @Then("^I see a block of images$")
    public void seeImagesBlock() {
        Assert.assertTrue(loginPage.getImageList().size() > 0);
    }

    @Attachment(value = "Attachment Screenshot", type = "image/png")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @After
    public void afterClass() {
        makeScreenshot();
        closeDriver();
        logger.info("test are finish.");
    }


}

