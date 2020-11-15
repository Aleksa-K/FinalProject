package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {

    public void addProductToTheCart() {
        $(By.name("product[quantity]")).scrollTo();
        $(By.id("add_to_cart_btn")).click();

    }

    public void goToCart() {
        $(By.linkText("Pārlūkot pirkumu grozu")).click();
        sleep(3000);

    }
}
