package pSight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pSight.DriverFactory.getChromeDriver;

public class HomePage {

    private WebDriver driver = getChromeDriver();

    private HomePage() {
        //This is to make sure that
    }

    public static HomePage getHomePage() {
        return new HomePage();
    }

    public void search(String value) {

        WebElement search = driver.findElement(By.className("header_search--input"));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);

    }
}
