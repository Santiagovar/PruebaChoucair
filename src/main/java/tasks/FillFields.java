package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.Date;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterface.HomePage.*;
import static userinterface.LocationPage.INPUT_TYPE_ZIP;

public class FillFields implements Task{

    private String name;
    private String lastname;
    private String email;
    private String month;
    private String day;
    private String year;
    private String languages;



    public FillFields(String name, String lastname, String email, String month, String day, String year, String languages){
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.languages = languages;

    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(name).into(INPUT_TYPE_NAME), //Enters Name
                Enter.theValue(lastname).into(INPUT_TYPE_LASTNAME), //Enters Lastname
                Enter.theValue(email).into(INPUT_TYPE_EMAIL), //Enters Email
                SelectFromOptions.byVisibleText(month).from(SELECT_SELECT_MONTH),
                SelectFromOptions.byVisibleText(day).from(SELECT_SELECT_DAY),
                SelectFromOptions.byVisibleText(year).from(SELECT_SELECT_YEAR),
                Enter.theValue(languages).into(INPUT_TYPE_LANGUAGE),
                Hit.the(Keys.ENTER).into(INPUT_TYPE_LANGUAGE)


        );


    }
    public static FillFields InputsStrings(String name, String lastname, String email, String month, String day, String year, String languages) {
        return instrumented(FillFields.class, name, lastname, email, month, day, year, languages);
    }
 }
