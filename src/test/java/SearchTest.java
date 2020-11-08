import org.testng.annotations.Test;
import pSight.pages.CoursePage;
import pSight.pages.HomePage;
import pSight.pages.SearchPage;

public class SearchTest extends BaseTestClass {


    SearchPage search = new SearchPage();
    HomePage home = new HomePage();
    CoursePage course = new CoursePage();

    @Test
    public void basicFilterByTest() {
        home.search("Java");
        search.filterBySkillLevel("Beginner")
                .filterByRole("Software Development")
                .selectTabCourse()
                .selectCourse("Java Fundamentals: The Java");

        course.verifyCoursePreviewIsDisplayed()
                .verifyFreeTrialIsDisplayed();

    }
}
