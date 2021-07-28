package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageHeader {
    @FindBy(how = How.CSS, using = "a[class='ModuleNavigationLinkstyled__StyledNavLink-sc-1cquk99-1 gjvMnh module-link module-link media']")
    public WebElement mediaLibraryBtn;
}
