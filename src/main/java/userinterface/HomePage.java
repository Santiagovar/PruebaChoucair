package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://www.utest.com/signup/personal")
public class HomePage extends PageObject {
    private WebDriver driver;

    /* Text fields */
    public static final Target INPUT_TYPE_NAME = Target.the("Field for the name information").located(By.id("firstName"));
    public static final Target INPUT_TYPE_LASTNAME = Target.the("Field for the lastname information").located(By.id("lastName"));
    public static final Target INPUT_TYPE_EMAIL = Target.the("Field for the email information").located(By.id("email"));

    /* Select fields */

    public static final Target SELECT_SELECT_MONTH = Target.the("List of months for birthday").located(By.name("birthMonth"));
    public static final Target SELECT_SELECT_DAY = Target.the("List of days for birthday").located(By.name("birthDay"));
    public static final Target SELECT_SELECT_YEAR = Target.the("List of years for birthday").located(By.name("birthYear"));

    /* language field */
    public static final Target INPUT_TYPE_LANGUAGE = Target.the("Input Language").located(By.className("input-xs"));

    /* Button Submit */
    public static final Target BUTTON_TYPE_SUBMIT = Target.the("Button for submit").located(By.className("btn-blue"));

}
