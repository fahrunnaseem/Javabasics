package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classroomsession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver setup
		WebDriverManager.chromedriver().setup();
		
		//open chrome browser using object
		ChromeDriver driver = new ChromeDriver();
		
		//get the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Find the username element and send value
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Demosalesmanager");
		
		//Find the password element and send value
		WebElement element2 = driver.findElement(By.name("PASSWORD"));
		element2.sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on the CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();
        
		//Click on the leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//identify the companyname and sendkeys
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mindtree");
		
		//identify the firstname and sendkeys
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fahrun");
		
		//identify the Lastname and sendkeys
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nazeem");
		
		//Click on the createlead
		driver.findElement(By.className("smallSubmit")).click();
		
		//get the Leads code
		String code = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		//print the code
		System.out.println(code);
		
		
		
		
		

	}

}
