package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.*;

public class searchCar_Step_Defs {

    private Pages pages = new Pages();

    @Given("User is on Cars.com")
    public void user_is_on_cars_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User selects New\\/used dropdown user chooses Used")
    public void user_selects_new_used_dropdown_user_chooses_used() {
        pages.getFindYourMatchPage()
                .selectNewOrUsedDropdown(3);
    }
    @Then("User selects Rolls -Royce from Make Dropdown")
    public void user_selects_rolls_royce_from_make_dropdown() {

        pages.getFindYourMatchPage()
                .selectMakeDropdown(15);
    }
    @Then("Model should be set to All Models")
    public void model_should_be_set_to_all_models() {
        pages.getFindYourMatchPage()
                .selectModelDropdown(5);
    }
    @Then("the price should be set to No Max Price within the Price Dropdown")
    public void the_price_should_be_set_to_no_max_price_within_the_price_dropdown() {
        pages.getFindYourMatchPage()
                .selectPriceDropdown(0);
    }
    @Then("ZIP should be set to {int}")
    public void zip_should_be_set_to(Integer int1) {
        pages.getFindYourMatchPage()
                .sendMakeZip(int1.toString());
        pages.getFindYourMatchPage().clickSearch();
    }
}
