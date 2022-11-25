package com.example.steps;

import com.example.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.temporal.ChronoUnit;

public class ListPageSteps extends BaseTest {

    @And("user do scroll")
    public void userDoScroll() {
      listPage.swipeList();
    }

    @When("User on list page")
    public void userOnListPage() {

    }

    @Then("User do long press")
    public void userDoLongPress() {
        listPage.longPressInTheSecondMenu();
    }

    @Then("User do multiple taps on the list")
    public void userDoMultipleTapsOnTheList() {
        listPage.tapMultipleTimesInTheSecondMenu();
    }
}
