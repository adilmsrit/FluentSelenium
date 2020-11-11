import org.testng.annotations.Test;
import pSight.pages.*;

import static pSight.pages.CoursePage.getCoursePage;
import static pSight.pages.CommonVerification.getCommonVerification;
import static pSight.pages.CoursePage.*;
import static pSight.pages.HomePage.getHomePage;
import static pSight.pages.SearchPage.getSearchPage;

public class SearchTest extends BaseTestClass {

    SearchPage search = getSearchPage();
    HomePage home = getHomePage();
    CoursePage course = getCoursePage();
    CommonVerification common = getCommonVerification();

    @Test
    public void basicFilterByTest() {
        home.search("Java");
        search.filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTab(Tab.COURSES)
                .selectCourse("Java Fundamentals: The Java");

        course.verifyCoursePreviewIsDisplayed()
                .verifyFreeTrialIsDisplayed();
        common.verifyIsDisplayed(coursePreviewButton())
                .verifyIsNotDisplayed(freeTrialButton());

    }
}
