package stepsdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import tasks.FillFields;

import userinterface.HomePage;

import java.util.Date;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterface.HomePage.BUTTON_TYPE_SUBMIT;
import static userinterface.LocationPage.INPUT_TYPE_ZIP;


public class GlobalStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver explorer;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();

    /*
              theActorCalled(nombreActor).wasAbleTo(Open.browserOn(homePage));
          getDriver().manage().window().maximize();

     */
    @Given("^The person access to the form to create the user and inputs (.*) (.*) (.*) (.*) (.*) (.*) (.*).$")
    public void ThePersonAccessToTheFormToCreateTheUserAndInputs(
            String Name,
            String Lastname,
            String Email,
            String Month,
            String Day,
            String Year,
            String Language) {
    actor.can(BrowseTheWeb.with(explorer));
    actor.wasAbleTo(Open.browserOn(homePage));


        actor.wasAbleTo(
                FillFields.InputsStrings(Name, Lastname, Email, Month, Day, Year, Language)


        );



    }

    @When("^User clicks the button on the main page with the label Join now and fill the fields$")
    public void UserclicksTheButtonOnTheMainPageWithTheLabelJoinNowAndFillTheFields() {
    actor.attemptsTo(Click.on(BUTTON_TYPE_SUBMIT));

    }

    @Then("^Submits the first step and continues$")
    public void submitsTheFirstStepAndContinues() {
    actor.should(seeThat(the(INPUT_TYPE_ZIP), isPresent()));
    }


    @When("^clicks the button on the main page with the label Join now and fill the fields$")
    public void clicksTheButtonOnTheMainPageWithTheLabelJoinNowAndFillTheFields(List<String> Data) {

    }






}
