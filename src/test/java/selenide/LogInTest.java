package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.Homepage;
import selenide.pages.LogInPage;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.HOMEPAGE_URL;

public class LogInTest {

    Homepage homepage;
    LogInPage logInPage;

    @Test
    public void successfulLoginIn()  {
        // open Homepage
        // click on log in btn
        // insert credentials
        // click on log in btn
        // check that user is Logged in

        homepage = open(HOMEPAGE_URL, Homepage.class);
        homepage.accCookies();
        logInPage = homepage.clickOnLogInBtn();
        logInPage.fillInValidCreds();
        logInPage.clickOnLogInBtn();
        homepage.checkUserIcon();


    }
}
