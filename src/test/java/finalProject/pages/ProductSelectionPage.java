package finalProject.pages;


import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class ProductSelectionPage {

    public void scrollToProduct() {
        $(By.xpath("//div[@class='row sn-filter-toolbox-row']")).scrollTo();
        sleep(3000);

    }

    public void selectProduct() {
        $$(By.xpath("//div[@class='new-product-item catalog-taxons-product']")).get(1).hover();
        sleep(1000);
        $(By.linkText("4M Thinking Kits Tell Time Learning Clock 4689")).click();
        sleep(3000);

    }
}
