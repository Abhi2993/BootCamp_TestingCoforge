package Waits_Syncronisation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EaseMyTripFlightSearch {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.easemytrip.com/");

        // FROM
        WebElement from = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("FromSector_show")));
        from.click();
        from.sendKeys("Delhi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(.,'Delhi')]"))).click();

        // TO
        WebElement to = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("Editbox13_show")));
        to.click();
        to.sendKeys("Mumbai");

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(.,'Mumbai')]"))).click();

        // DATE
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ddate"))).click();

        // Example: choose first available date
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//li[@class='active'])[1]"))).click();

        // SEARCH
        wait.until(ExpectedConditions.elementToBeClickable(
                By.className("srchBtnSe"))).click();
    }
}