package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleDataSteps {
    private WebDriver driver;
    @Given("User is on Home Page")
    public void userIsOnHomePage() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("User Navigate to Login Page")
    public void userNavigateToLoginPage() throws Throwable{
        System.out.println("userNavigateToLoginPage");
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) throws Throwable {
        System.out.println("User name is : "+username+" Password is : "+password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("Message displayed Login Successfuly")
    public void messageDisplayedLoginSuccessfuly() throws Throwable {
        System.out.println("Successfully logged in");
        Thread.sleep(2000);
        driver.close();
    }
}
