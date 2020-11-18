package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {

    public void addProductToTheCart() {
        $(By.xpath("//div[@class='rules']")).scrollTo();
        $(By.xpath("//button[@class='button icon-cart wider']")).click();


    }

    public void goToCart() {
        $(By.linkText("Pārlūkot pirkumu grozu")).click();
        sleep(1000);

    }
}
