package finalProject.pages;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class ProductSelectionPage {

    public void brandSelection() {
        $$(By.xpath("//div[@class='filter-block filter-block-collapse active']")).get(0).scrollTo();
        sleep(1000);
        $$(By.xpath("//span[@class='filter-link__label']")).get(6).click();
        sleep(1000);

    }

    public void mostPopularProduct() {
        $$(By.xpath("//div[@class='filter-block filter-block-collapse active']")).get(0).scrollTo();
        sleep(1000);
        $$(By.xpath("//span[@class='filter-link__label']")).get(4).click();
        sleep(1000);

    }


    public void selectProduct() {
        $$(By.xpath("//div[@class='gtm-categories new-product-hover']")).get(5).scrollTo();
        sleep(4000);
        $(By.linkText("Apple Watch SE GPS 44mm Gold Aluminum Pink Sand Sport Band")).hover().click();
    }


}

