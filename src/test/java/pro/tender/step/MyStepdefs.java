package pro.tender.step;

import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @Given("I am on login page")
    public void iAmOnLoginPage() {
        open("https://new.tender.pro/account/signin");
    }
}
