package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		// 1: find the dropdown element (select tag)
		 
		WebElement eleDropdown = driver.findElement(By.id("dropdown1"));
		
		// 2: convert it to select class (Dropdown)
		
		Select dd = new Select(eleDropdown);
		
		// 3: choose your value from drop down 
//		dd.selectByVisibleText("Selenium");
//		dd.selectByIndex(1);
		dd.selectByValue("1");
		
		// how to get options?
		int size = dd.getOptions().size();
		dd.selectByIndex(size-2);
		
	}


}
