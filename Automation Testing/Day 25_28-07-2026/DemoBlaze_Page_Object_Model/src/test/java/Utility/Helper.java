package Utility;




import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

    public static void captureScreenshot(WebDriver driver,String name) {

        try {

            TakesScreenshot ts=(TakesScreenshot)driver;

            File src=ts.getScreenshotAs(OutputType.FILE);

            File dest=new File("./Screenshots/"+name+".png");

            FileUtils.copyFile(src,dest);

        }
        catch(IOException e) {

            System.out.println("Screenshot Failed");
        }

    }

    public static void implicitWait(WebDriver driver) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

}