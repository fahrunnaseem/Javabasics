package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class replacexpath {

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
		WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
		element.sendKeys("Demosalesmanager");
		
		//Find the password element and send value
		WebElement element2 = driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
		element2.sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//click on the CRM/SFA
        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
        
		//Click on the leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click on the create lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//identify the companyname and sendkeys
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("infy");
		
		//identify the firstname and sendkeys
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Fah");
		
		//identify the Lastname and sendkeys
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("Naz");
		
		//Click on the createlead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//get the Leads code
		String code = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		
		//print the code
		System.out.println(code);
		
	
	}

}
