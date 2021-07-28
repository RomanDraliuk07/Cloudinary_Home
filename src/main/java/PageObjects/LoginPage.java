package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.CSS, using ="input[id='user_session_email']")
    public WebElement emailInput;

    @FindBy(how = How.CSS, using ="input[id='user_session_password']")
    public WebElement passwordInput;

    @FindBy(how = How.CSS, using ="button[id='sign-in']")
    public WebElement signInBtn;


}
