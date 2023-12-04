package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

import java.net.MalformedURLException;

public class LoginSteps extends CommonMethods {
    @Given("user opens appium driver")
    public void user_opens_appium_driver() throws MalformedURLException {
        launchTheApplication();
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.enterUsername(ConfigReader.getPropertyValue("username"));
        loginPage.enterPassword(ConfigReader.getPropertyValue("password"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLoginBtn();
    }
    @Then("user is able to navigate to product page")
    public void user_is_able_to_navigate_to_product_page() {
        System.out.println("Test Passed");
    }
}
