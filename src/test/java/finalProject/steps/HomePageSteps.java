package finalProject.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import finalProject.pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @When("^Enter data to the search field$")
    public void enterDataToTheSearchField() {
        homePage.searchField("watch");
    }

    @And("^Press search button$")
    public void pressSearchButton() {
        homePage.pressSearchButton();
    }
}