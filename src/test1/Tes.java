package test1;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import java.net.URL;

public class Tes {
    public static void main(String[] args) throws Exception {

        DesiredCapabilities capabillities = DesiredCapabilities.firefox();
        capabillities.setCapability("version", "8");
        capabillities.setCapability("platform", Platform.WINDOWS);

        WebDriver driver = new RemoteWebDriver(
           new URL("http://39c1cf54069a1cb38a5d7f1a863dbc9f:af75c8aeea2703ce636ec4999a440898@hub.testingbot.com:4444/wd/hub"),
           capabillities);

        driver.get("http://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Hello, WebDriver");
        search.submit();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
		