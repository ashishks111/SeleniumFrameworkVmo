package com.vmo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage
{
//    By uname = By.id("login-username");
//    By pswd = By.id("login-password");
//    By loginButton = By.id("js-login-btn");
//    WebDriver ldriver;
//    public LoginPage(WebDriver rdriver)
//    {
//        ldriver = rdriver;
//        PageFactory.initElements(rdriver, this);
//    }
static WebDriver driver;
    public LoginPage(WebDriver driver)

    {
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy (how= How.ID,using = "login-username")
    static WebElement UserName;

    @FindBy (how= How.ID,using = "login-password")
    static WebElement Password;
    @FindBy (how= How.ID,using = "js-login-btn")
    static WebElement Loginbutton;

    public static void setUsername(String username)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait up to 10 seconds
        wait.until(ExpectedConditions.visibilityOf(UserName));
        UserName.sendKeys(username);
    }
    public static void setPassword(String password)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait up to 10 seconds
        wait.until(ExpectedConditions.visibilityOf(Password));
        Password.sendKeys(password);
    }
    public static void clickButton()
    {
        Loginbutton.click();
    }

}
