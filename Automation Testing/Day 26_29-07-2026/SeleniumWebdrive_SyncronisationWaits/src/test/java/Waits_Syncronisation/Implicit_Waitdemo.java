package Waits_Syncronisation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Waitdemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.easemytrip.com/");

        // From
        driver.findElement(By.id("FromSector_show")).click();
        driver.findElement(By.id("FromSector_show"))
              .sendKeys("Delhi", Keys.ENTER);

        // To
        driver.findElement(By.id("Editbox13_show")).click();
        driver.findElement(By.id("Editbox13_show"))
              .sendKeys("Mumbai", Keys.ENTER);

        // Departure Date
        driver.findElement(By.id("ddate")).click();

        // Select Date (change locator if required)
        driver.findElement(By.xpath("(//li[contains(@class,'active')])[1]")).click();

        // Search
        driver.findElement(By.className("srchBtnSe")).click();

        // Close Browser
         driver.quit();
    }
}