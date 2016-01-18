import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ppor143 on 1/17/16.
 */
public class CSSSelector {

    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://carttest.fundycentral.com/login?path=download");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Ray@fundysoftware.com");

    }
}