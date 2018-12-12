package mailRu.helpers.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver getDriver(String driverType) {
        if ("chrome".equals( driverType)) {
            return new ChromeDriver();
        }
        return new FirefoxDriver();
    }
}
