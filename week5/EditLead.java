package week5.assignment.workout;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends Common {
	@BeforeClass
	public void datafile() {
		
		LoadProperties();
		filename=pro.getProperty("Workbookname");
		Sheetname= pro.getProperty("sheet2");
	}
	
	
	@Test (dataProvider ="getdata")
	public void editlead(String cNme, String first, String last) throws InterruptedException {

	
		

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cNme);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Balu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hiii..!!");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("baluspb@gmail.com");

		WebElement eleStateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selectState=new Select(eleStateDropDown);
		selectState.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");	
		driver.findElement(By.className("smallSubmit")).click();

		Thread.sleep(3000);

		System.out.println("Title of the resulting page : "+driver.getTitle());
		

	}
	

	

}
