package com.northrow.steps;


import com.northrow.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;



public class MyStepdefs {
    HomePage homePage = new HomePage();
    @Given("^I am on home page\\.$")
    public void iAmOnHomePage() {
    }

    @When("^I click on watch video button\\.$")
    public void iClickOnWatchVideoButton() {
        new HomePage().clickOnwatchvideobutton();
    }

    @Then("^I am navigated on video diplay\\.$")
    public void iAmNavigatedOnVideoDiplay() {
    }

    @When("^I click on top menu \"([^\"]*)\"$")
    public void iClickOnTopMenu(String mnu) throws Throwable {
        new HomePage().clickOnTopmenu(mnu);
    }

    @Then("^I am navigated on menu page\\.$")
    public void iAmNavigatedOnMenuPage() {
    }
    @When("^I will be able to see the Message \"([^\"]*)\" on the page$")
    public void iWillBeAbleToSeeTheMessageOnThePage(String msg) {
      Assert.assertEquals(msg,homePage.setVerifyText());
    }

    @When("^I click on Get Started$")
    public void iClickOnGetStarted() {
        homePage.setClickGetStarted();
    }
}
