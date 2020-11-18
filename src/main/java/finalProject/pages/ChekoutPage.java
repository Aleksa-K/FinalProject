package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ChekoutPage {


    public void enterEmail(String email){
        $$(By.id("user_email")).get(3).sendKeys(email);
        //sleep(2000);
    }
   public void pressGo(){
        $$(By.xpath("//input[@class='users-session-form__submit']")).get(1).scrollTo().click();
   }
}
