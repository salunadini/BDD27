package api.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {
    @Given("User is at the login page of the application")
    public void userIsAtTheLoginPageOfTheApplication() {
        System.out.println("userIsAtTheLoginPageOfTheApplication");
    }

    @When("User logs in with following username and password")
    public void userLogsInWithFollowingUsernameAndPassword(DataTable dataTable) {
        List<List<String>>list_of_rows=dataTable.asLists(String.class);//dataTable.raw();
        for(List<String> row:list_of_rows){
            for(String str:row){
                System.out.println("Data : "+str);
            }
        }
    }

    @Then("user should be able to login with correct username and password")
    public void userShouldBeAbleToLoginWithCorrectUsernameAndPassword() {
        System.out.println("userShouldBeAbleToLoginWithCorrectUsernameAndPassword");
    }
}
