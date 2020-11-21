package finalProject.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {


    public void addProductToTheCart() {
        $(By.xpath("//div[@class='products-delivery-options-tabs']")).scrollIntoView(atBottom());
        sleep(1000);
        $(By.xpath("//button[@id='add_to_cart_btn']")).shouldBe(Condition.visible).click();


    }

    public void goToCart() {
        $(By.linkText("Pārlūkot pirkumu grozu")).click();


    }
}
