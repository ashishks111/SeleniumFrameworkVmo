package com.vmo.Base;

import com.vmo.Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {
    public static PropertyReader propertyReader = new PropertyReader();
    public String applicationURL = propertyReader.getapplicationURL();
    public String username = propertyReader.getUsername();
    public String password = propertyReader.getPassword();
    public String expectedUsername = propertyReader.getExpectedUsername();

    public static WebDriver driver;

    public static void init()
    {
        System.setProperty("webdriver.chrome.driver",propertyReader.getChromePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(propertyReader.getapplicationURL());
    }

//    public WebElement presenceOfElement(final By elementLocation)
//    {
//        return new WebDriverWait(Drivermanger.getDriver(), Duration.ofSeconds(20)).until(ExpectedCondition) );
//    }

    public static void down()
    {

        driver.quit();
    }
}
