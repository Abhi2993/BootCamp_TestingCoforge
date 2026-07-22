package SeleniumWebDriver_DropdownBoxItem;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownBoxItem {
	WebDriver driver;
	String url = "https://testautomationpractice.blogspot.com/";

	@BeforeTest
	public void Setup() {

		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@Test
	public void DropDownList() throws Exception {

		WebElement Country_Dropdown = driver.findElement(By.id("country"));
		Select country_list = new Select(Country_Dropdown);

		country_list.selectByIndex(3);
		Thread.sleep(5000);

		country_list.selectByVisibleText("India");
		Thread.sleep(5000);

		WebElement option = country_list.getFirstSelectedOption();
		String countryindex = option.getText();

		System.out.println("Selected Country : " + countryindex);

		List<WebElement> c_list = country_list.getOptions();
		int total_months = c_list.size();
		System.out.println("Total no. of months in List : " + total_months);

		// Print All Country Names
		for (WebElement ele : c_list) {
			String coun_name = ele.getText();
			System.out.println("Country Names in list: " + coun_name);
		}
	}
}