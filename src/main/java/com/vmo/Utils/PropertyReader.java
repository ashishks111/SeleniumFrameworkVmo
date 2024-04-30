package com.vmo.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class PropertyReader {
Properties pro;
    public PropertyReader()
    {
        File src = new File("src/main/resources/data.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }
        catch (Exception e)
        {
            System.out.println("Exception is" + e.getMessage());
        }
    }
    public String getUsername()
    {
    String username = pro.getProperty("username");
        return username;
    }

    public String getPassword()
    {
        String password = pro.getProperty("password");
        return password;
    }

    public String getChromePath()
    {
        String chromepath = pro.getProperty("chromepath");
        return chromepath;
    }

    public String getapplicationURL()
    {
        String applicationURL = pro.getProperty("applicationurl");
        return applicationURL;
    }

    public String getExpectedUsername()
    {
        String expectedUsername = pro.getProperty("expected_username");
        return expectedUsername;
    }
}
