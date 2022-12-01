package lecture10;

import io.cucumber.java.en.And;
import lecture8.pages.CarPage;

public class CarsPageSteps {

    CarPage carPage = new CarPage();

    @And("^I fill in (.*) Year$")
    public void iFillInMinYear(String min) {
        carPage.fillMinYear(min);
    }

    @And("^I fill in (.*) engine$")
    public void iFillInMaxEngine(String max) {
        carPage.fillMaxEngine(max);
    }

    @And("^I select color code (.*)$")
    public void iSelectColorCodeX(String colorCode) {
        carPage.selectColor(colorCode);
    }

}
