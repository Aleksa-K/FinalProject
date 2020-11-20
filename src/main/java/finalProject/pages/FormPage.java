package finalProject.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FormPage {

    public void fillInFormWithData(String name, String surname, String mobile, String address, String postalCode) {
        $(By.id("address_first_name")).sendKeys(name);
        $(By.id("address_last_name")).sendKeys(surname);
        $(By.id("address_phone_number")).sendKeys(mobile);
        $(By.name("address[city_id]")).selectOption("Rīga");
        $(By.id("address_street")).sendKeys(address);
        $(By.id("address_postal_code")).sendKeys(postalCode);
        $(By.xpath("//div[@class='form-column']")).scrollIntoView(atBottom());

    }

    public void pressGoButton() {
        $(By.xpath("//button[@class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']")).scrollTo().submit();
        sleep(1000);
    }


}
