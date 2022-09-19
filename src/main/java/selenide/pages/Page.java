package selenide.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Abstract class Page contains common locators, data and methods shared within the Quandoo pages.
 */
public abstract class Page {

    // Constant url
    public static String BASE_URL = "https://www.quandoo.de";
    public static String ENQUIRY_URL = BASE_URL + "/en/checkout/enquiry?restaurantUrl=cavallino-rosso-306";
    // Classes
    protected Faker faker;
    // Locators
    private static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    // Methods
    public void accCookies() {
        $(accCookiesBtn).click();
    }
}
