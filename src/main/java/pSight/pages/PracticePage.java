package pSight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static pSight.DriverFactory.getChromeDriver;
import static pSight.DriverFactory.getWebDriverWait;

public class PracticePage {

    WebDriver driver = getChromeDriver();
    WebDriverWait wait = getWebDriverWait();

    public void enterName(String value) throws InterruptedException {
        WebElement enterName = driver.findElement(By.id("name"));
        enterName.sendKeys(value);
        Thread.sleep(3000);
    }

    public void verifyPageNavigated() {
        WebElement pageText = driver.findElement(By.xpath("//h1[contains(text(),'Practice Page')]"));
        Assert.assertEquals(pageText.getText(), "Practice Page");
    }

}
