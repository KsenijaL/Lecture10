package lecture10;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lecture8.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageSteps {

    HomePage homepage = new HomePage();

    @Given("I open base url")
    public void iOpenBaseUrl() {
        homepage.openBaseUrl();
    }

    @When("^I change category to (dogs|cars)$")
    public void iChangeCategoryToDogs(String category) {
        homepage.chooseCategory(category);
    }

    @Then("I stop driver")
    public void iStopDriver() {
        homepage.stopDriver();
    }
}

