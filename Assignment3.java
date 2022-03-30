package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome to Selenium Aotomation Testing");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aspanu@gmail.com");
		
		WebElement eleDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select dd = new Select(eleDropdown);
		
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();    
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JHANVI");
		
		driver.findElement(By.name("submitButton")).click(); 
		
		String title1 = driver.getTitle();
		System.out.println(title1); 
		driver.close();
	}

}
