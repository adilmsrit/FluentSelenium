import org.testng.annotations.Test;
import pSight.pages.LandingPage;
import pSight.pages.PracticePage;

public class SearchTest extends BaseTestClass {
    //code from another person

    LandingPage landingPage = new LandingPage();
    PracticePage practicePage = new PracticePage();

    @Test
    public void enterNameTest() throws InterruptedException {
        landingPage.goToPracticePage("//a[@href='/pages/practice']");
        practicePage.enterName("Hero");
        practicePage.verifyPageNavigated();
    }
}
