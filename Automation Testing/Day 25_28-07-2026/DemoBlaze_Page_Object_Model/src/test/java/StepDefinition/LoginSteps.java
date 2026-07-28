package StepDefinition;



import com.Framework.Pages.BaseClass;
import com.Framework.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {

    LoginPage login;

    @Given("User launches DemoBlaze application")
    public void user_launches_demo_blaze_application() {

        setup();
        login = new LoginPage(driver);
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {

        String username = excel.getData("Login", 0, 0);
        String password = excel.getData("Login", 0, 1);

        login.login(username, password);
    }

    @When("User clicks Login button")
    public void user_clicks_login_button() {

    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

    }

    @When("User selects Samsung Galaxy S6")
    public void user_selects_samsung_galaxy_s6() {

        login.selectSamsungGalaxy();
    }

    @When("User clicks Add To Cart")
    public void user_clicks_add_to_cart() {

        login.addProductToCart();
    }

    @Then("Product should be added successfully")
    public void product_should_be_added_successfully() {

    }

    @When("User opens Cart")
    public void user_opens_cart() {

        login.openCart();
    }

    @Then("Product should be visible in Cart")
    public void product_should_be_visible_in_cart() {

    }

    @When("User clicks Logout")
    public void user_clicks_logout() {

        login.logout();
    }

    @Then("User should logout successfully")
    public void user_should_logout_successfully() {

        tearDown();
    }
}