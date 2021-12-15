package com.GL.step_definitions;

import com.GL.pages.EnglishTestPage;
import com.GL.utilities.UsefulMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class EnglishTestStepDefns {
    EnglishTestPage englishTestPage = new EnglishTestPage();

    @Given("User on the third question")
    public void user_on_the_third_question() throws InterruptedException {
        englishTestPage.userOntheHomePage();
        englishTestPage.goToThirdQuestion();
    }

    @When("User navigates all options of question three")
    public void user_navigates_all_options_of_question_three(List<String> list) throws InterruptedException  {
        englishTestPage.choosingOptionsfromAnyQuestion(list);
    }
    @Then("User should be able to click next button")
    public void user_should_be_able_to_click_next_button() throws InterruptedException  {
        UsefulMethods.waitForClickablility(englishTestPage.nextButton,5);
        englishTestPage.nextButton.click();

    }

    @Then("Number of answered questions should be three")
    public void number_of_answered_questions_should_be_three() {
        Assert.assertEquals(3,englishTestPage.numberOfAnsweredQuestions());

    }
    @Given("User on the homepage")
    public void user_on_the_homepage() throws InterruptedException {
        englishTestPage.userOntheHomePage();

    }

    @When("User navigates till end of exam")
    public void user_navigates_till_end_of_exam() throws InterruptedException {
        englishTestPage.goToEndofTest();
       UsefulMethods.waitFor(5);
    }

    @And("User finishes the exam")
    public void user_finishes_the_exam() {
        UsefulMethods.waitForClickablility(englishTestPage.endTest,5);
        englishTestPage.endTest.click();
    }
    }
