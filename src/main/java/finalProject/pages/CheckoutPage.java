package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CheckoutPage {


    public void enterEmail(String email) {
        $$(By.xpath("//input[@class='users-session-form__input users-session-form__input--text ']")).get(1).sendKeys(email);
        sleep(1000);
    }

    public void pressGo() {
        $(By.xpath("//div[@class='users-session__content-panel users-session-form']")).scrollIntoView(atBottom());
        $$(By.xpath("//input[@class='users-session-form__submit']")).get(1).click();

    }
}
