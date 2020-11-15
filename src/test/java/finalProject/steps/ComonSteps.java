package finalProject.steps;


import cucumber.api.java.en.Given;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ComonSteps {


    @Given("^Open the Chrome browser and load the URL$")
    public void openTheChromeBrowser() {
        open("https://www.1a.lv/");
        getWebDriver().manage().window().maximize();


    }


}
