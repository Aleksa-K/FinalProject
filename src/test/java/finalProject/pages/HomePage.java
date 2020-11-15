package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public void searchField(String productName) {
        $(By.xpath("//input[@class='sn-suggest-input autocomplete main-search-input']")).sendKeys(productName);
    }

    public void pressSearchButton() {
        $(By.xpath("//div[@class='main-search__submit']")).submit();
        sleep(3000);


    }
}
