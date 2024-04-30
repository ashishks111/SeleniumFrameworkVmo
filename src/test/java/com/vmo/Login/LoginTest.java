package com.vmo.Login;

import com.vmo.Basetest.BaseTestClass;
import com.vmo.Pages.DashboardPage;
import com.vmo.Pages.LoginPage;
import com.vmo.Utils.PropertyReader;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.vmo.Pages.DashboardPage.getUserNameOnDashboard;
import static com.vmo.Pages.DashboardPage.userNameOnDashboard;
import static com.vmo.Pages.LoginPage.setPassword;
import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTestClass
{
    @Test
    public void positiveTestCase() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername(username);
        loginPage.setPassword(password);

        LoginPage.clickButton();
        DashboardPage dashboardPage = new DashboardPage();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait up to 10 seconds
        WebElement ExpectedUsername = wait.until(ExpectedConditions.visibilityOf(dashboardPage.getUserNameOnDashboard()));
        //WebElement ExpectedUsername = getUserNameOnDashboard();
        String ActualUsername = propertyReader.getExpectedUsername();

        Assert.assertEquals(ExpectedUsername.getText(),ActualUsername);
        //System.out.println();
    }

}
