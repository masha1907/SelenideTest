package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class Homepage  extends  Page{

    // locators
    private static final By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    private static final By logInBtn  = By.xpath("//*[@data-qa='header-login-btn']");
    private static By  userIcon= By.xpath("//*[@data-qa='header-user-icon']");
    // methods
    public SignUpPage clickOnSignUpBtn() {
        $(signUpBtn).click();
        return page(SignUpPage.class);
    }
    public LogInPage clickOnLogInBtn() {
        $(logInBtn).click();
        return page(LogInPage.class);
    }
    public void checkUserIcon() {
        $(userIcon).shouldBe(Condition.visible);
    }
}
