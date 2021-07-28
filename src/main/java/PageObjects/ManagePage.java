package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ManagePage {

    @FindBy(how = How.XPATH, using = "//*[@id='new-drill-down']/div[1]/div[1]/div/div[1]/div[2]/div/input")
    public WebElement pageTitle;
}
