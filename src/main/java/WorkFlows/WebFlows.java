package WorkFlows;

import Extensions.UiActions;
import Utilities.CommonOps;

public class WebFlows extends CommonOps {

    public static void login(String user,String password){
        UiActions.insertText(loginPage.emailInput,user);
        UiActions.insertText(loginPage.passwordInput,password);
        UiActions.click(loginPage.signInBtn);
    }
    public static void clickOnMedia(){
        UiActions.click(homePageHeader.mediaLibraryBtn);
    }

    public static void rightClickOnHomeAssignment(){
        UiActions.rightClick(mediaLibraryPage.homeAssignment);
        UiActions.click(mediaLibraryPage.managePopBtn);
    }




}
