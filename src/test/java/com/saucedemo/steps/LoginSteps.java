package com.saucedemo.steps;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I Click On Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @And("^I should Login successfully$")
    public void iShouldLoginSuccessfully() {
    }


    @Then("^I should see six products on message$")
    public void iShouldSeeSixProductsOnMessage() {
        int expectedText = 6;
        int actualText = new HomePage().productlist();
        Assert.assertEquals(expectedText, actualText);

    }

    @Then("^Verify The text \"([^\"]*)\"$")
    public void verifyTheText(String expMessage) {
        String actualMessage = new HomePage().successfulLoginMessage();
        Assert.assertEquals(expMessage, actualMessage);
    }
}
