package finalProject.steps;

import cucumber.api.java.en.And;
import finalProject.models.UserModel;
import finalProject.pages.FormPage;


public class FormPageSteps {
    UserModel userModel = new UserModel();
    FormPage formPage = new FormPage();

    @And("^Fill the shipping form$")
    public void fillInData() {
        formPage.fillInFormWithData(userModel.getName(), userModel.getSurname(), userModel.getMobile(), userModel.getAddress(), userModel.getPostalCoda());
        formPage.pressGoButton();

    }

}
