package com.SeleniumWebDriver.LocatorsDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ID_Locator {

    WebDriver driver;
    String baseURL = "https://practicetestautomation.com/practice-test-login/";

    @Test
    public void IDLocator() {

        driver = new ChromeDriver();
        driver.navigate().to(baseURL);
        driver.manage().window().maximize();

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        String Title = driver.getTitle();
        System.out.println(Title);

        
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        
       String actualoutput= driver.findElement(By.tagName("h1")).getText();

    
        String expectedoutput = "Logged In Successfully";

     if(actualoutput.equals(expectedoutput))
     {
         System.out.println("PASS : Login Successful");
         System.out.println("Expected : " + expectedoutput);
         System.out.println("Actual   : " + actualoutput);
     }
     else
     {
         System.out.println("FAIL : Login Failed");
         System.out.println("Expected : " + expectedoutput);
    }
    }
    }
