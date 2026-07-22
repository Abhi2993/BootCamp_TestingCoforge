package ScreenshotsDemo;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTestNg {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://spicejet.woohoo.in/en-in/home");
		Thread.sleep(5000);

		/*File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/GoogleHomepage.png"));
	
	
		we Can also use the above methOd*/
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots/SpicejetHomepage.png"));
		System.out.println("Captured Screenshot");
		
		driver.quit();
	}
}