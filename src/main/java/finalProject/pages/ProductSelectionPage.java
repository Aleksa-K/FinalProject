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


    public void selectProduct() {
        $$(By.xpath("//div[@class='gtm-categories new-product-hover']")).get(5).scrollTo();
        sleep(1000);
        $(By.linkText("Apple Watch SE GPS 40mm Silver Aluminum White Sport Band")).hover().click();

    }
}

