package finalProject.pages;

import org.openqa.selenium.By;

import java.lang.module.Configuration;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {

    public void addProductToTheCart() {
        $(By.xpath("//button[@class='button icon-cart wider']")).scrollTo().click();
        sleep(2000);


    }

    public void goToCart() {
        $(By.linkText("Pārlūkot pirkumu grozu")).click();
        sleep(1000);

    }
}
