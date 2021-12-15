package com.GL.pages;

import com.GL.utilities.ConfigurationReader;
import com.GL.utilities.Driver;
import com.GL.utilities.UsefulMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EnglishTestPage {

    public EnglishTestPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath="//a[contains(text(),'English')]")
    public WebElement englishTest;
    @FindBy(xpath="//button[contains(text(),'Start test')]")
    public WebElement startTest;
    @FindBy(id="next-button")
    public WebElement nextButton;
    @FindBy(xpath="//button[contains(text(),'2')]")
    public WebElement text2;
    @FindBy(xpath="//label[contains(text(),'one third')]")
    public WebElement anyOptionQ1;
    @FindBy(xpath="//label[contains(text(),'They are about triplets')]")
    public WebElement anyOptionQ2;
    @FindBy(xpath="//p[contains(text(),'Answered 3 question(s) out of 7')]")
    public WebElement verifyThatThreeQanswered;
    @FindBy(xpath="//span[@class=\"progress-item passed\"]")
    public List<WebElement> answeredItems;
    @FindBy(xpath="//label[contains(text(),'her')]")
    public WebElement anyOptionQ3;
    @FindBy(xpath="//label[contains(text(),'are')]")
    public WebElement anyOptionQ4;
    @FindBy(xpath="//label[contains(text(),'Sam enjoyed')]")
    public WebElement anyOptionQ5;
    @FindBy(xpath="//label[contains(text(),'No Mistake')]")
    public WebElement anyOptionQ6;
    @FindBy(xpath="//label[contains(text(),'charity concert')]")
    public WebElement anyOptionQ7;
    @FindBy(xpath="//button[contains(text(),'End test')]")
    public WebElement endTest;
   // Loads homePage
    public void userOntheHomePage()  {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
  //Takes the User to the question 3
    public void goToThirdQuestion(){
        UsefulMethods.waitForClickablility(englishTest,5);
        englishTest.click();
        UsefulMethods.waitForClickablility(startTest,5);
        startTest.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
        UsefulMethods.waitForClickablility(text2,5);
        text2.click();
        UsefulMethods.waitForClickablility(anyOptionQ1,5);
        anyOptionQ1.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
        UsefulMethods.waitForClickablility(anyOptionQ2,5);
        anyOptionQ2.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
    }
    /*
    @param list
    clicks all the options of a question one by one
    and Verifies that Next button is available or not
     */
    public void choosingOptionsfromAnyQuestion( List<String> opt) {
        for (int i = 0; i < 5; i++) {
            Driver.get().findElement(By.xpath("//label[contains(text(),'" + opt.get(i) + "')]")).click();

                UsefulMethods.verifyElementEnabled(nextButton);


        }
    }
    // Gives number of answered questions after any question
    public int numberOfAnsweredQuestions(){

        return answeredItems.size();
    }
    public void goToEndofTest(){
         goToThirdQuestion();
        UsefulMethods.waitForClickablility(anyOptionQ3,5);
        anyOptionQ3.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
        UsefulMethods.waitForClickablility(anyOptionQ4,5);
        anyOptionQ4.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
        UsefulMethods.waitForClickablility(anyOptionQ5,5);
        anyOptionQ5.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
        UsefulMethods.waitForClickablility(anyOptionQ6,5);
        anyOptionQ6.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
        UsefulMethods.waitForClickablility(anyOptionQ7,5);
        anyOptionQ7.click();
        UsefulMethods.waitForClickablility(nextButton,5);
        nextButton.click();
    }

    }



