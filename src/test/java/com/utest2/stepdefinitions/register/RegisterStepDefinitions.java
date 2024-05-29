package com.utest2.stepdefinitions.register;


import com.utest2.tasks.GoTo;
import com.utest2.tasks.register.EnterInfo;
import com.utest2.tasks.register.JoinToday;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;


public class RegisterStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the {} has opened URL")
    public void givenThatUserHasOpenedWebsite(String actorName) {
        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }
    @When("the user click on join today button")
    public void whenTheUserClickOnJoinTodayButton() {
        theActorInTheSpotlight().attemptsTo(JoinToday.Click());
    }

    @And("the user fills out the registration 1 and 2 steps")
    public void andTheUserFillsOutTheRegistration1And2Steps(DataTable data) {
       theActorInTheSpotlight().attemptsTo(EnterInfo.Form(data));
    }
    @And("the  user continue 3 and 4 steps registration")
    public void andTheUserContinue3And4StepsRegistration(DataTable data) {
        //  theActorInTheSpotlight().attemptsTo(CartProductsSelect.Items(data));
    }



    @Then("the user should welcome message")
    public void thenTheUserShouldWelcomeMessage() {
      //  theActorInTheSpotlight().should(seeThat(CartQuestions.numberItems(), is(2)));
    }

}