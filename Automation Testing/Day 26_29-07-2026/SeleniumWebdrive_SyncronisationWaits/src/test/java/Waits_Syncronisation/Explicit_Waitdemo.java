package Waits_Syncronisation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Waitdemo {
//explicit used based on the condition satisfied
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        username.sendKeys("student");

        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        password.sendKeys("Password123");

        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("submit")));
        loginButton.click();

        WebElement success = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

        System.out.println(success.getText());

        driver.quit();
    }
}