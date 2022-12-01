package lecture10;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lecture8.pages.DogsPage;

public class DogsPageSteps {
    DogsPage dogsPage = new DogsPage();

    @And("^I fill min age (.*) and max age (.*)$")
    public void iFillMinAgeAndMaxAge(String min, String max) {
        dogsPage.fillMinMaxAge(min, max);
    }

    @And("^I fill min price (.*) and max price (.*)$")
    public void iFillMinPriceAndMaxPrice(String arg0, String arg1) {
        dogsPage.fillMinMaxPrice(arg0, arg1);
    }

    @And("I press submit button")
    public void iPressSubmitButton() {
        dogsPage.pressSubmitButton();
    }

    @And("I change deal to sell")
    public void iChangeDealToSell() {
        dogsPage.changeDealTypeTo("sell");
    }


}
