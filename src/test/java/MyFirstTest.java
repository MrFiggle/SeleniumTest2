/**
 * Created by ppor143 on 1/11/16.
 */

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver();

        // ~~~~~~~~~ Verify user can log into the download page ~~~~~~~~~~~~
        //login to cart test with correct credentials
        driver.navigate().to("https://carttest.fundycentral.com/login?path=download");
        //Using custom xpath to navigate tag names to get to email address field
        driver.findElement(By.xpath("//div[@id='ember357']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input")).sendKeys("peter@fundysoftware.com");
        driver.findElement(By.id("password")).sendKeys("qasoftware");
        driver.findElement(By.xpath(".//*[@id='form_login']/div[3]/button[2]")).click();


        /*
        driver.navigate().to("http://fundydesigner.com/");
        driver.findElement(By.xpath(".//*[@id='page-home']/div/div[1]/div/div/div[1]/div/div/p[4]/a[2]")).click();
        */

        /*
        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start with Selenium Simplified",
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();
        */

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
