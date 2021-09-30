package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsParameter {
    @Given("User should be logged in and should be present at its own wall.")
    public void userShouldBeLoggedInAndShouldBePresentAtItsOwnWall() {
    }

    @When("I type the message as {string} in the text box.")
    public void iTypeTheMessageAsInTheTextBox(String arg0) {
    }

    @And("Click on Post button.")
    public void clickOnPostButton() {
    }

    @Then("the message should get posted.")
    public void theMessageShouldGetPosted() {
    }

    @When("User supply the youtube link as {string} in the text box.")
    public void userSupplyTheYoutubeLinkAsInTheTextBox(String url) {
        System.out.println(url);
    }

    @Then("Then video should get posted on the user wall.")
    public void thenVideoShouldGetPostedOnTheUserWall() {
    }

    @And("the video should have proper thumbnail.")
    public void theVideoShouldHaveProperThumbnail() {
    }
}
