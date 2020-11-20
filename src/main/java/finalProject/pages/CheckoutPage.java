package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CheckoutPage {


    public void enterEmail(String email) {
        $$(By.xpath("//input[@class='users-session-form__input users-session-form__input--text ']")).get(1).sendKeys(email);
        $$(By.xpath("//input[@class='users-session-form__submit']")).get(1).scrollTo();
        sleep(1000);
    }

    public void pressGo() {

        $$(By.xpath("//input[@class='users-session-form__submit']")).get(1).doubleClick();

    }
}
