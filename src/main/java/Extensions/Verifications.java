package Extensions;

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class Verifications extends CommonOps {

    public static void textInElement(WebElement element, String expectedValue){
        waiting.until(ExpectedConditions.visibilityOf(element));
        assertEquals(element.getAttribute("value"),expectedValue);
    }
}
