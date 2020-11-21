package finalProject.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductSelectionPage {

    public void brandSelection() {
        $$(By.xpath("//div[@class='filter-block filter-block-collapse active']")).get(1).scrollTo();
        sleep(1000);
        $$(By.xpath("//span[@class='filter-link__label']")).get(11).click();


    }

    public void mostPopularProduct() {
        $$(By.xpath("//div[@class='filter-block filter-block-collapse active']")).get(0).scrollTo();
        sleep(1000);
        $$(By.xpath("//span[@class='filter-link__label']")).get(4).click();


    }


    public void selectProduct(String productName) {
        $$(By.xpath("//span[@class='item-price']")).get(0).scrollTo();
        sleep(1000);
        $(By.linkText(productName)).hover().click();
        sleep(1000);

    }
}

