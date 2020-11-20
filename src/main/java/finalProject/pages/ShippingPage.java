package finalProject.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ShippingPage {

    public void selectShippingMethod() {

        $(By.xpath("//label[@class='for-radio click-toggle']")).doubleClick();
        $$(By.xpath("//div[@class='pickup-point-name']")).get(2).doubleClick();


    }

    public void pressGoButton() {
        $(By.xpath("//button[@class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']")).scrollTo().click();
    }
}
