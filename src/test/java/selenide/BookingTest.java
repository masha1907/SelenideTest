package selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import selenide.pages.BookingPage;
import static com.codeborne.selenide.Selenide.open;

/**
 * Class BookingTest contains tests to Btn "Send Enquiry" activation
 */
public class BookingTest {

    BookingPage bookingPage;

    @Test
    public void bookingWithoutTermsAndPrivacy() throws InterruptedException {
        // open page
        bookingPage = open("https://www.quandoo.de/en/checkout/enquiry?restaurantUrl=cavallino-rosso-306",BookingPage.class);
        bookingPage.accCookies();
        // insert data to all fields
        bookingPage.fillInBookingFields();
        // time check
        bookingPage.timeCheck();
        // click on checkBox
        bookingPage.clickOnCheckBox();
        // check that Send Enquiry button
        bookingPage.checkSendEnquiryBtnActivated().should(Condition.visible);
    }

}
