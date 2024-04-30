package com.vmo.Basetest;

import com.vmo.Base.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestClass extends BasePage {
    @BeforeClass
    public void setup()
    {
        BasePage.init();
    }

    @AfterClass
    public void teardown()
    {
        //BasePage.down();
    }
}
