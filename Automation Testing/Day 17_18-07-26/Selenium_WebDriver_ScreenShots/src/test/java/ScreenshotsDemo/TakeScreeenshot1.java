package ScreenshotsDemo;





import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Reusebility.Reusebility;

public class TakeScreeenshot1 {

	@Test
	public void Browser() throws Exception {

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open Application
		driver.get("https://auth.hollandandbarrett.com/u/login");

		// Capture Screenshot - Launch Application
		Reusebility.capturedScreenshot(driver, "A_Launch_Application");

		// Enter Username
		driver.findElement(By.id("username"))
				.sendKeys("raghu.astepahead@gmail.com");

		// Enter Password
		driver.findElement(By.name("password"))
				.sendKeys("raghuBN@123");

		Thread.sleep(5000);

		// Click Sign In Button
		driver.findElement(By.xpath("//button[@name='action']")).click();

		// Capture Screenshot - After Sign In Click
		Reusebility.capturedScreenshot(driver, "B_Click_SignIn_Button");

		Thread.sleep(3000);

		// Close Browser
		driver.quit();
	}
}