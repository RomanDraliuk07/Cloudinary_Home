package Extensions;

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UiActions extends CommonOps {

    public static void click(WebElement element){
        waiting.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public static void insertText(WebElement element, String value){
        waiting.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(value);
    }

    public static void rightClick(WebElement element){
        action.contextClick(element).perform();
    }

}
