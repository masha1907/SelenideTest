package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.BookingPage;
import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.BookingPage.ENQUIRY_URL;

/**
 * Class BookingTest contains tests to Btn "Send Enquiry" activation
 */
public class BookingTest {

    BookingPage bookingPage;


    @Test
    public void bookingWithoutTermsAndPrivacy() {
        //open  page
        bookingPage = open (ENQUIRY_URL, BookingPage.class);
        // accept cookies
        bookingPage.accCookies();
        // метод проверяет что кнопка не активная
        bookingPage.checkSendEnquiryBtnActivated();
        // insert data to all fields
        bookingPage.fillInBookingFields();
        // date check
        bookingPage.dateCheck();
        // time check
        bookingPage.timeCheck();
        // click on checkBox
        bookingPage.clickOnCheckBox();
        // check that Send Enquiry button
 //bookingPage.checkSendEnquiryBtnActivated(); // если я его разкоментирую у меня все равно тест проходит. Подскажи пожайлуста что я не так сделала?


    }

}
