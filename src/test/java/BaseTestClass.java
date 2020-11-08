import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static pSight.DriverFactory.getChromeDriver;
import static pSight.DriverFactory.getWebDriverWait;

public class BaseTestClass {
    WebDriver driver;
    WebDriverWait wait;


    @BeforeSuite
    public void startBrowser() {
        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = getWebDriverWait();
    }

    @BeforeMethod
    public void goToHome() {
        // driver.get("https://letskodeit.teachable.com/");
        driver.get("file:///C:/website/HomePage.html");
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser() {
        driver.close();
    }

}
