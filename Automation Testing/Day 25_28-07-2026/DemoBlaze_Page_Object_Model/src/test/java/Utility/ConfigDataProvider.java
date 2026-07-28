package Utility;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

    Properties pro;

    public ConfigDataProvider() {

        File src = new File("./Configuration/config.properties");

        try {

            FileInputStream fis = new FileInputStream(src);

            pro = new Properties();

            pro.load(fis);

        } catch (Exception e) {

            System.out.println("Unable to load config.properties file");
        }
    }

    public String getBrowser() {

        return pro.getProperty("Browser");
    }

    public String getURL() {

        return pro.getProperty("URL");
    }

    public String getUsername() {

        return pro.getProperty("Username");
    }

    public String getPassword() {

        return pro.getProperty("Password");
    }

}