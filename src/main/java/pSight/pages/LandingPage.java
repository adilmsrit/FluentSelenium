package pSight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pSight.DriverFactory.getChromeDriver;

public class LandingPage {
    WebDriver driver = getChromeDriver();

    public void goToPracticePage(String value) throws InterruptedException {
        WebElement login = driver.findElement(By.xpath(value));
        login.click();
        Thread.sleep(5000);
    }

}
