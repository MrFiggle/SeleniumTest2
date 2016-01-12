/**
 * Created by ppor143 on 1/11/16.
 */

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver() {

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start with Selenium Simplified",
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();

        /*
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "Macintosh HD/Users/ppor143/Downloads/chromedriver");

        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start with Selenium Simplified",
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();
        */


    }



    @Test
    public void startWebDriver2() {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://qaclickacademy.com");
        driver.close();
        driver.quit();

    }

}
