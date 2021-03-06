package StepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import static junit.framework.TestCase.assertEquals;


public class AOPSteps {

    private World world;

    public AOPSteps(World world)
    {
        this.world = world;
    }

    @When("xyz")
    public void xyz() {
    }

    @When("we select a issuer")
    public void weSelectAIssuer() {

    }

    @Then("verify status code is {string}")
    public void verifyStatusCodeIs(String status) {
      assertEquals (world.response.getStatusCode().toString(),status);
    }


    @Then("status code is OK")
    public void statusCodeIsOK() {
        System.out.println(world.response.getStatusCode().toString());
        assertEquals (world.response.getStatusCode(), HttpStatus.OK);
    }

    @Then("status code is {string}")
    public void statusCodeIs(String status) {
        System.out.println(world.response.getStatusCode().toString());
        assertEquals (world.response.getStatusCode().toString(), status);
    }

    @BeforeStep
    public void doSomethingBeforeStep()
    {
    // put logging and transaction steps here
    }

    @AfterStep
    public void doSomethingAfterStep()
    {
        // put logging and transaction steps here
    }

    @Before() //@Before('@Single")
    public void doSomethingBeforeScenario()
    {
        world.header1.add("x-auth-token", world.apiKeyVal);
        // put logging and transaction steps here
    }

    @After
    public void doSomethingAfterScenario()
    {
        // put logging and transaction steps here
    }

}
