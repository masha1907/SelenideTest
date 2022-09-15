package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BookingPage extends Page {

    /* ELEMENTS */
    private static final By dataField = By.xpath("//*[@data-qa='widget-date-picker-selection']");
    private static final By timeFieldStart = By.xpath("//*[@data-qa='widget-time-picker-start']//option[contains( text(),'8:00 pm')]");
    private static final By timeFieldEnd = By.xpath("//*[@data-qa='widget-time-picker-end']//option[contains( text(),'9:00 pm')]");
    private static final By emailField = By.xpath("//*[@data-qa='input-email']");
    private static final By firstNameField = By.xpath("//*[@data-qa='input-first-name']");
    private static final By lastNameField = By.xpath("//*[@data-qa='input-last-name']");
    private static final By phoneField = By.xpath("//*[@data-qa='input-phone']");
    private static final By messageField = By.xpath("//*[@data-qa='message']");
    private static final By checkBox = By.xpath("//div[2]/div/div/div/label/i");
    private static final By sendEnquiryBtn = By.xpath("//*[@data-qa='enquiry-submit']");

    /* METHODS */
    public void fillInBookingFields(){
        faker = new Faker();
        $(dataField).setValue(faker.date().toString());
        $(timeFieldStart).setValue(faker.date().toString());
        $(timeFieldEnd).setValue(faker.date().toString());
        $(emailField).setValue(faker.internet().emailAddress());
        $(firstNameField).setValue(faker.name().firstName());
        $(lastNameField).setValue(faker.name().lastName());
        $(phoneField).setValue(faker.phoneNumber().cellPhone());
        $(messageField).setValue(faker.name().nameWithMiddle());
    }

    public void timeCheck() {
        $(timeFieldStart).click();
        $(timeFieldEnd).click();
    }
    public void clickOnCheckBox() throws InterruptedException {
        Thread.sleep(5000);
        $(checkBox).click();

    }
    public SelenideElement checkSendEnquiryBtnActivated() throws InterruptedException {
        Thread.sleep(8000);
        return $(sendEnquiryBtn);
    }

}
