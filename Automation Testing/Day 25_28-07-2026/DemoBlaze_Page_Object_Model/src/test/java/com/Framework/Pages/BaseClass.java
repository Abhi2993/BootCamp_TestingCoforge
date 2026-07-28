package com.Framework.Pages;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.BrowserFactory;
import Utility.ConfigDataProvider;
import Utility.ExcelDataReader;
import Utility.Helper;

public class BaseClass {

    public WebDriver driver;

    public ConfigDataProvider config;

    public ExcelDataReader excel;

    @BeforeMethod
    public void setup() {

        config = new ConfigDataProvider();

        excel = new ExcelDataReader();

        driver = BrowserFactory.startApplication(
                config.getBrowser(),
                config.getURL());

        Helper.implicitWait(driver);
    }

    @AfterMethod
    public void tearDown() {

        BrowserFactory.quitBrowser();
    }

}