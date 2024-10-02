package steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUserSteps {

    WebDriver driver;

    @Given("The user is on the login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/login");
    }

    @When("The user enters valid credentials")
    public void user_enters_valid_credentials() {
        // Code to enter valid login credentials
    }

    @When("The user enters invalid credentials")
    public void user_enters_invalid_credentials() {
        // Code to enter invalid login credentials
    }

    @When("The user enters {string} and {string}")
    public void user_enters_multiple_data(String email, String password) {
        // Code to enter email and password for the scenario outline
    }
    
    @Then("Do some verification")
    public void do_some_verification() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//test")).sendKeys("hello");
    }

    @Then("The user should be successfully logged in")
    public void user_should_be_successfully_logged_in() {
        // Code to verify successful login
        driver.quit();
    }

    @Then("The user should see {string}")
    public void user_should_see_message(String expectedMessage) {
        // Code to verify login message based on scenario outline
        driver.quit();
    }

    @Then("The user should see an error message about invalid login")
    public void user_should_see_invalid_login_error() {
        // Code to verify error message
        driver.quit();
    }
}

