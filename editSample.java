package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class editSample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("haja@testleaf.com  ");
		
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys("Anu");
		
		String attribute = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(attribute);
		
	//	driver.close();

	}

}
