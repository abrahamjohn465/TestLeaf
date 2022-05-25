package myextendreport;


import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Acmi1report {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup(){
		WebDriverManager.chromedriver().setup();
		//W	driver.manage().window().maximize();
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://acme-test.uipath.com/login");
		
		
	}
	
	@BeforeMethod
	public void login() {
		
		driver.findElement(By.xpath("//label[contains(text(),'Email:')]/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Password:')]/following-sibling::input")).sendKeys("leaf@12");
		driver.findElement(By.xpath("(//label[contains(text(),'Password:')]/following-sibling::input/following::button)[1]")).click();
		
	}
	
	@Test
	public void titlevalidation() {
		
		String title=driver.getTitle();
		
		System.out.println(title);
		String excepted="ACME System 1 - Dashboard";
		Assert.assertEquals(title,excepted);
		
	}
	
	@Test
	public void geturl() {
		
		String actual = driver.getCurrentUrl();
		String excepted ="https://acme-test.uipath.com/";
		
		Assert.assertEquals(actual,excepted);
	}
	
	
	
	
	@AfterMethod
	public void logout() {
		
		driver.findElement(By.xpath("//*[@id='logout-form']/following-sibling::li/a")).click();
		
	}

	
	
	
	
		
	@AfterTest
	public void close(){
		driver.close();
	}
			
		
			
			
			
			
			 
			
			
			
			
			
			
		

		

	}
