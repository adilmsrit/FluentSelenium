package StepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pSight.DriverFactory;
import pageObjects.LoginPage;

public class MyStepdefs {

    public WebDriver driver = DriverFactory.getChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User launches chrome browser")
    public void user_launches_chrome_browser() {

    }

    @When("User opens {string} URL")
    public void user_opens_url(String string) {
    }

    @When("User enters {string} and password as {string}")
    public void user_enters_and_password_as(String string, String string2) {
    }

    @When("Click on Login")
    public void click_on_login() {
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String string) {
    }

    @When("User clicks on logout link")
    public void user_clicks_on_logout_link() {
    }

    @Then("Close Browser")
    public void close_browser() {
    }

}
