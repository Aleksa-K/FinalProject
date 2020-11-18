package finalProject.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import finalProject.pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("^Enter (.*) to the search field$")
    public void enterDataToTheSearchField(String data) {
        homePage.searchField(data);
    }

    @And("^Press search button$")
    public void pressSearchButton() {
        homePage.pressSearchButton();
    }
}