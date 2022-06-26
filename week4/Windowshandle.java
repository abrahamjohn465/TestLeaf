package week4.assignment.classroom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowshandle {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 	
		 * 6. Click on Merge Contacts using Xpath Locator
		 * 
		 * 7. Click on Widget of From Contact
		 * 
		 * 8. Click on First Resulting Contact
		 * 
		 * 9. Click on Widget of To Contact
		 * 
		 * 10. Click on Second Resulting Contact
		 * 
		 * 11. Click on Merge button using Xpath Locator
		 * 
		 * 12. Accept the Alert
		 * 
		 * 13. Verify the title of the page
		 */
	
		
		
		
		  WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();

			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement user=driver.findElement(By.xpath("//*[@id='username']"));
			
			user.sendKeys("DemoSalesManager");
			
			
			WebElement pwd=driver.findElement(By.xpath("//*[@id='password']"));
			
			pwd.sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.xpath("(//a[contains(text(),'Contacts')])[1]")).click();
			driver.findElement(By.linkText("Merge Contacts")).click();
			
			String parentWindow = driver.getWindowHandle();
			
			WebElement wid1=driver.findElement(By.xpath("(//table[@class='twoColumnForm']//tr//a/img)[1]"));
			wid1.click();
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			List<String> window1 = new ArrayList<String>(windowHandles);
			for (int i = 0; i < windowHandles.size(); i++) {
				
				driver.switchTo().window(window1.get(i));
				if(driver.getTitle().equals("Find Contacts")) {
					WebElement firstid=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr/td[1]//a"));
					firstid.click();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			driver.switchTo().window(parentWindow);
			WebElement wid2=driver.findElement(By.xpath("(//table[@class='twoColumnForm']//tr//a/img)[2]"));
			wid2.click();
			
	Set<String> windowHandles1 = driver.getWindowHandles();
			
			List<String> window2 = new ArrayList<String>(windowHandles1);
			for (int i = 0; i < windowHandles1.size(); i++) {
				
				driver.switchTo().window(window2.get(i));
				if(driver.getTitle().equals("Find Contacts")) {
					WebElement firstid=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr/td[1]//a"));
					firstid.click();
					
					break;
				}
			}
			driver.switchTo().window(parentWindow);
			driver.findElement(By.linkText("Merge")).click();
			
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
			
	}

}
