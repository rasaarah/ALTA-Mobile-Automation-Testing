package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;
import com.example.app.Calculator;
import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class MathsStepDefinitions extends BaseTest{

    @Given("User is on calculator page")
    public void userIsOnCalculatorPage() {
    }

    @When("User input first number {int}")
    public void userInputFirstNumberNumber(int number1) {
        calculatorPage.inputTextArea1(String.valueOf(number1));
    }

    @When("User input second number {int}")
    public void userInputSecondNumberNumber(int number2) {
        calculatorPage.inputTextArea2(String.valueOf(number2));
    }

    @Then("User click button result")
    public void userClickButtonResult() {
        calculatorPage.clickResultBtn();
    }

    @And("User click dropdown")
    public void userClickDropdown() {
        calculatorPage.clickDropDownBtn();
    }

    @And("User click icon '-'")
    public void userClickIcon() {
        calculatorPage.minusBtn();
    }

    @And("User click icon divide")
    public void userClickIconDivide() {
        calculatorPage.divideBtn();
    }

    @And("User click icon multiple")
    public void userClickIconMultiple() {
        calculatorPage.multipleBtn();
    }

    @And("Result should be {string}")
    public void resultShouldBeResult(String Result) {
        String result = calculatorPage.ResultString();
        Assertions.assertEquals(Result, result);
    }
}
