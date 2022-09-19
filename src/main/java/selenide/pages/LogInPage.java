package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LogInPage extends Page{

    // locators
    private static final By emailField = By.xpath("//*[@data-qa='email-input']");
    private static final By passwordField = By.xpath("//*[@data-qa='password-input']");
    private static final By logInBtn = By.xpath("//*[@data-qa='login-btn']");

    public void fillInValidCreds(){
        $(emailField).setValue(EMAIL);
        $(passwordField).setValue(PASS);
    }
    public Homepage clickOnLogInBtn(){
        $(logInBtn).click();
        return page(Homepage.class);
    }
}
