package Selenium_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertExample {

    WebDriver driver;
    String baseURL = "https://mail.rediff.com/cgi-bin/login.cgi";

    @Test
    public void HandleAlert() {

        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();

        // Click Login without entering credentials
        driver.findElement(By.name("proceed")).click();

        // Switch to Alert
        Alert alert = driver.switchTo().alert();

        // Print Alert Text
        System.out.println("Alert Message : " + alert.getText());

        // Validate Alert Message
        String expected = "Please enter a valid user name";
        String actual = alert.getText();

        if(expected.equals(actual))
        {
            System.out.println("Alert Validation Passed");
        }
        else
        {
            System.out.println("Alert Validation Failed");
        }

        // Click OK
        alert.accept();

        driver.quit();
    }
}