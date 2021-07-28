package Utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base{

    public static void init(){
        loginPage = PageFactory.initElements(driver,PageObjects.LoginPage.class);
        homePageHeader = PageFactory.initElements(driver,PageObjects.HomePageHeader.class);
        mediaLibraryPage = PageFactory.initElements(driver,PageObjects.MediaLibraryPage.class);
        managePage = PageFactory.initElements(driver,PageObjects.ManagePage.class);

    }


}
