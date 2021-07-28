package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MediaLibraryPage {

    @FindBy(how = How.XPATH , using = "//*[contains(text(),'home assignment')]")
    public WebElement homeAssignment;

    @FindBy(how = How.XPATH , using = "//*[text()='Manage']")
    public WebElement managePopBtn;
}
