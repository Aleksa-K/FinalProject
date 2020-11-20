package finalProject.steps;


import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.assertj.core.api.Assert;


import javax.swing.text.Highlighter;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.addListener;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ComonSteps {


    @Given("^Open the Chrome browser and load the URL$")
    public void openTheChromeBrowser() {
        open("https://www.1a.lv/");
        getWebDriver().manage().window().maximize();
        System.out.println("Hello world!");


    }


    @And("Validate that page has been loaded")
    public void validateThatPageHasBeenLoaded() {
        $(byText("Loading")).waitUntil(disappears, 20000);
    }
}
