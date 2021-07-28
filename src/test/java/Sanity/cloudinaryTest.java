package Sanity;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;

public class cloudinaryTest extends CommonOps {
    @Test(description = "Test01: Login to Cloudinary")
    public void test01_login(){
        WebFlows.login(getData("userName"),getData("password"));
    }
    @Test(description = "Test02: Go to media page")
    public void test02_GoToMediaPage(){
       WebFlows.clickOnMedia();
    }
    @Test(description = "Test03: Right click on the image and manage select")
    public void test03_RighClick(){
       WebFlows.rightClickOnHomeAssignment();

    }
    @Test(description = "Test04: Validate that the title")
    public void test04_CheckTileOfThePage(){
        Verifications.textInElement(managePage.pageTitle,getData("testTitle"));

    }


}
