package finalProject.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import finalProject.pages.CommonPage;


import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CommonSteps {
    CommonPage commonPage = new CommonPage();

    @Given("^Open the Chrome browser and load the URL$")
    public void openTheChromeBrowser() {
        open("https://www.1a.lv/");
        getWebDriver().manage().window().maximize();


    }


    @And("Validate that page has been loaded")
    public void validateThatPageHasBeenLoaded() {
        commonPage.validatePage();
    }
}
