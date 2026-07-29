package com.testNG_DataProvider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDataProvider {

    WebDriver driver;

    @DataProvider(name = "loginData")
    public Object[][] supplyData() {

        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"}
        };
    }

    @Test(dataProvider = "loginData")
    public void executeLogin(String username, String password) throws Exception {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys(username);

        driver.findElement(By.id("password")).sendKeys(password);

        Thread.sleep(5000);

        driver.findElement(By.id("login-button")).click();
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}