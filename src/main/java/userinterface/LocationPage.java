package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {

public static final Target INPUT_TYPE_ZIP = Target.the("Zip input that tell that we move on to a new page").located(By.id("city"));
}
