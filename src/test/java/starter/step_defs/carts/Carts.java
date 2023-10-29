package starter.step_defs.carts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import starter.cookit.carts.CartsAPI;
import starter.utils.Constant;

import java.io.File;

public class Carts {

//    Create
    @Given("create new user cart with valid {string}")
    public void createNewUserCartWithValid(String jsonFile) {
        File json = new File(Constant.REQ_BODY + jsonFile);
        CartsAPI.createPostCarts(json);
    }

    @When("Send create new user cart")
    public void sendCreateNewUserCart() {
        SerenityRest.when().post(CartsAPI.CREATE_NEW_CARTS);
    }

    @Given("create new user cart with invalid reBody {string}")
    public void createNewUserCartWithInvalidReBody(String jsonFile) {
        File json = new File(Constant.REQ_BODY + jsonFile);
        CartsAPI.createPostCarts(json);
    }

    @Given("create new user cart with empty key {string}")
    public void createNewUserCartWithEmptyKey(String jsonFile) {
        File json = new File(Constant.REQ_BODY + jsonFile);
        CartsAPI.createPostCarts(json);
    }

    @Given("create new user cart with invalid {string}")
    public void createNewUserCartWithInvalid(String jsonFile) {
        File json = new File(Constant.REQ_BODY + jsonFile);
        CartsAPI.createPostCarts(json);
    }
}
