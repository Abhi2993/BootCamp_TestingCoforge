package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startApplication(String browserName, String url) {

        if (browserName.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();

        } else {

            System.out.println("Browser Not Found");
        }

        driver.manage().window().maximize();

        driver.get(url);

        return driver;
    }

    public static void quitBrowser() {

        if (driver != null) {

            driver.quit();
        }
    }
}