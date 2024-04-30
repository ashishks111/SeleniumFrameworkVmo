package com.vmo.Pages;

import com.vmo.Base.BasePage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage extends BasePage
{

    @FindBy (how = How.XPATH, using = "//span[@data-qa ='lufexuloga']")
    public static WebElement userNameOnDashboard ;

    public static WebElement getUserNameOnDashboard() throws Exception
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // wait up to 10 seconds
        WebElement displyedName = wait.until(ExpectedConditions.visibilityOf(userNameOnDashboard));
        //System.out.println("Is element visible on webpage: " + displyedName.isDisplayed());
        if (displyedName != null && displyedName.isDisplayed()) {
            System.out.println("Element is visible on webpage");
        } else {
            throw new Exception("Element is null or not visible");
        }
        return displyedName;
    }
}
