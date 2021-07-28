package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {

    public static WebDriver driver;
    public static WebDriverWait waiting;
    public static Actions action;

    public static PageObjects.LoginPage loginPage;
    public static PageObjects.HomePageHeader homePageHeader;
    public static PageObjects.MediaLibraryPage mediaLibraryPage;
    public static PageObjects.ManagePage managePage;
}