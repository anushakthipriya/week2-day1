package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleDropdown2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/crmsfa/control/createLeadForm;jsessionid=61670007003CED4556853345D7C96EB0.jvm1");
		driver.manage().window().maximize();
		
		WebElement eleDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select dd = new Select(eleDropdown);
		
		dd.selectByVisibleText("Employee");
	}

}
