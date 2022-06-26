package week5.assignment.workout;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clead extends Common{
	
	
	@Test (dataProvider ="fetchdata")
	public void creatlead(String cNme, String fisrt, String last) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cNme);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fisrt);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("jo");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("hello");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("johnsither465@gmail.com");
		
		WebElement eleStateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selectState=new Select(eleStateDropDown);
		selectState.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		
		System.out.println("Title of the resulting page : "+driver.getTitle());
	
		
	}
	
	@DataProvider
	public String[][] fetchdata() {
		String[][] data = new String[1][3];
		
		data[0][0] ="TestLeaf";
		data[0][1]="Balasubramaniam";
		data[0][2]="S P";
		
		return data;
	}



}