package com.Framework.Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;

	public LoginPage(WebDriver ldriver)
	{
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	@FindBy(id="login2")
	WebElement loginLink;

	@FindBy(id="loginusername")
	WebElement username;

	@FindBy(id="loginpassword")
	WebElement password;

	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginButton;

	@FindBy(id="nameofuser")
	WebElement nameofuser;

	@FindBy(linkText="Samsung galaxy s6")
	WebElement samsungGalaxy;

	@FindBy(linkText="Add to cart")
	WebElement addToCart;

	@FindBy(id="cartur")
	WebElement cart;

	@FindBy(id="logout2")
	WebElement logout;

	// Login
	public void login(String uname,String pass)
	{
		wait.until(ExpectedConditions.elementToBeClickable(loginLink));
		loginLink.click();

		wait.until(ExpectedConditions.visibilityOf(username));
		username.clear();
		username.sendKeys(uname);

		password.clear();
		password.sendKeys(pass);

		loginButton.click();

		wait.until(ExpectedConditions.visibilityOf(nameofuser));
	}

	// Login Validation
	public boolean isLoginSuccessful()
	{
		try
		{
			return nameofuser.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public void selectSamsungGalaxy()
	{
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(samsungGalaxy));
			samsungGalaxy.click();
		}
		catch(StaleElementReferenceException e)
		{
			driver.findElement(By.linkText("Samsung galaxy s6")).click();
		}
	}

	
	public void addProductToCart()
	{
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(addToCart));
			addToCart.click();
		}
		catch(StaleElementReferenceException e)
		{
			driver.findElement(By.linkText("Add to cart")).click();
		}

		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

	
	public void openCart()
	{
		wait.until(ExpectedConditions.elementToBeClickable(cart));
		cart.click();
	}

	
	public boolean verifyProduct()
	{
		try
		{
			WebElement product = wait.until(
					ExpectedConditions.visibilityOfElementLocated(
							By.xpath("//td[text()='Samsung galaxy s6']")));

			return product.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public void logout()
	{
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		logout.click();
	}

}