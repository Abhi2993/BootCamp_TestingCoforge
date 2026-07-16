package WebDriver.Commands;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
    @Test (priority=0)
    public void CromeBrowserTest() {
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://practicetestautomation.com/practice-test-login/");
    	driver.manage().window().maximize();
    	
    	String BrowserTitle = driver.getTitle();
    	System.out.println(BrowserTitle);
    	
    	String BrowserURL = driver.getCurrentUrl();
    	System.out.println(BrowserURL);
    	  String ExpectedURL = "https://practicetestautomation.com/practice-test-login/";

          if (BrowserURL.equals(ExpectedURL)) {
              System.out.println("PASS");
          } else {
              System.out.println("FAIL");
          }

          driver.quit();
    	
    	
    
    	
    	
    }
    @Test (priority=2)
    
    public void FirefoxBrowserTest() {
    	FirefoxDriver driver = new FirefoxDriver();
    	driver.get("https://www.youtube.com/");
    	
    	String BrowserURL = driver.getCurrentUrl();
    	System.out.println(BrowserURL);
    	  String ExpectedURL = "https://www.youtube.com/";

          if (BrowserURL.equals(ExpectedURL)) {
              System.out.println("PASS");
          } else {
              System.out.println("FAIL");
          }

          driver.quit();
    	
    }
    @Test (priority=1)
    public void EdgeBrowserTest() {
    	EdgeDriver driver  = new EdgeDriver();
    	driver.get("https://www.flipkart.com/aw-base-new-inline-2025-at-store?pageUID=1782478308884&affid=salescueli&affExtParam2=20260714cl6sxxjy9ssz&affExtParam1=249009");
    	String BrowserTitle = driver.getTitle();
    	System.out.println(BrowserTitle);
    	
    	String BrowserURL = driver.getCurrentUrl();
    	System.out.println(BrowserURL);
    	  String ExpectedURL = "https://practicetestautomation.com/practice-test-login/";

          if (BrowserURL.equals(ExpectedURL)) {
              System.out.println("PASS");
          } else {
              System.out.println("FAIL");
          }

          driver.quit();
    	
    }
       
}
