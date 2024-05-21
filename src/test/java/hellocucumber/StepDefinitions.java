package hellocucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

class DayChecker {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

    static String isItSaturday(String today) {
        return "Saturday".equals(today) ? "Nice!" : "Nope";
    }
}

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void todayIs(String today) {
        this.today = today;
    }

    @When("I ask whether its Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = DayChecker.isItFriday(today);
    }

    @When("I ask whether its Saturday yet")
    public void i_ask_whether_it_s_saturday_yet() {
        actualAnswer = DayChecker.isItSaturday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectAnswer) {
        assertEquals(expectAnswer, actualAnswer);
    }
}

