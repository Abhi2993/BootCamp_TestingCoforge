  package Task82_Lab_Demo6CaseStudies;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task82_OpenCartCaseStudy {

    WebDriver driver;

    @Test
    public void openCartCaseStudy() throws InterruptedException {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com/");

        // Login
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.id("input-email")).sendKeys("Abhinandanp2993@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("9555901911");
        driver.findElement(By.cssSelector("input[value='Login']")).click();

        // Go to Components
        driver.findElement(By.linkText("Components")).click();

        // Select Monitors
        driver.findElement(By.linkText("Monitors (2)")).click();

        // Select 25 from Show dropdown
        Select show = new Select(driver.findElement(By.id("input-limit")));
        show.selectByVisibleText("25");

        // Click Add to Cart for first product
        driver.findElement(By.xpath("(//button[@title='Add to Cart'])[1]")).click();

        // Open first product
        driver.findElement(By.linkText("Apple Cinema 30\"")).click();

        // Click Specification tab
        driver.findElement(By.linkText("Specification")).click();

        // Validate Specification page
        Assert.assertTrue(driver.getPageSource().contains("Specification"));

        // Wishlist
        driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();

        // Validate Success Message
        String msg = driver.findElement(By.cssSelector(".alert-success")).getText();

        if(msg.contains("Success")) {
            System.out.println("Apple Cinema added to Wishlist");
        }

        // Search Mobile
        WebElement search = driver.findElement(By.name("search"));
        search.clear();
        search.sendKeys("Mobile");

        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();

        // Search in product description
        driver.findElement(By.name("description")).click();

        driver.findElement(By.id("button-search")).click();

        // Open HTC Touch HD
        driver.findElement(By.linkText("HTC Touch HD")).click();

        // Clear Quantity and Enter 3
        WebElement qty = driver.findElement(By.id("input-quantity"));
        qty.clear();
        qty.sendKeys("3");

        // Add to Cart
        driver.findElement(By.id("button-cart")).click();

        // Validate Success Message
        String cartMsg = driver.findElement(By.cssSelector(".alert-success")).getText();

        if(cartMsg.contains("Success")) {
            System.out.println("HTC Touch HD added to cart successfully");
        }

        // Open Cart
        driver.findElement(By.id("cart-total")).click();
        driver.findElement(By.linkText("View Cart")).click();

        // Validate Mobile Added
        Assert.assertTrue(driver.getPageSource().contains("HTC Touch HD"));

        // Checkout
        driver.findElement(By.linkText("Checkout")).click();

        // Logout
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Logout")).click();

        // Validate Logout
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Account Logout");

        // Continue
        driver.findElement(By.linkText("Continue")).click();

        driver.quit();
    }
}