package week5.assignment.workout;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elead extends Common {

	
	
	@Test (dataProvider ="fetchdata")
	public void editlead(String cNme, String fisrt, String last) throws InterruptedException {

	
		

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cNme);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fisrt);
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
	
	@DataProvider
	public String[][] fetchdata() {
		String[][] data = new String[1][3];
		
		data[0][0] ="TestLeaf";
		data[0][1]="Balasubramaniam";
		data[0][2]="S P";
		
		return data;
	}

	

}
