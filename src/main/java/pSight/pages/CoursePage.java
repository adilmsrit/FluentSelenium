package pSight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pSight.DriverFactory.getChromeDriver;


public class CoursePage {

    private WebDriver driver = getChromeDriver();

    private CoursePage() {

    }

    public static CoursePage getCoursePage() {
        return new CoursePage();
    }

    // Get the elements which are declared using methods as shown below.
    public CoursePage verifyIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }

    // Get the elements which are declared using methods as shown below.
    public CoursePage verifyIsNotDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }

    //We introduce the below to be substituted in the Assert methods where we verify the presence of certain elements.
    public static By freeTrialButton() {
        return By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]");
    }

    //We introduce the below to be substituted in the Assert methods where we verify the presence of certain elements.
    public static By coursePreviewButton() {
        return By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]");
    }


    public CoursePage verifyFreeTrialIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]"))
                .isDisplayed());
        return this;
    }

    public CoursePage verifyCoursePreviewIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]"))
                .isDisplayed());
        return this;
    }
}
