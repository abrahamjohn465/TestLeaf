/**
 * 
 */
package week2.assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Admin
 *
 */
public class CreateContact {

	/**
	 * @param args
	 * 
	 * http://leaftaps.com/opentaps/control/login
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
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
			
			driver.findElement(By.xpath("(//a[contains(text(),'Create Contact')])[1]")).click();
			
			WebElement first=driver.findElement(By.xpath("//*[@id='firstNameField']"));	
							
			WebElement last=driver.findElement(By.xpath("//*[@id='lastNameField']"));					
							
			first.sendKeys("john");
			last.sendKeys("abraham");
			
			
			WebElement firstlocal=driver.findElement(By.xpath("//*[@name='firstNameLocal']"));	
			
			WebElement lastlocal=driver.findElement(By.xpath("//*[@name='lastNameLocal']"));					
							
			firstlocal.sendKeys("john1");
			lastlocal.sendKeys("abraham1");
			
			WebElement depart=driver.findElement(By.xpath("//*[@name='departmentName']"));					
			
			WebElement description=driver.findElement(By.xpath("//*[@name='description']"));					
			
			depart.sendKeys("BSC");
			description.sendKeys("Use all the failures to success");
			WebElement email=driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']"));					
			email.sendKeys("johnsither465@gmail.com");
			
			WebElement state=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));					
			Select create = new Select(state);
			create.selectByVisibleText("New York");
			
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			
			driver.findElement(By.xpath("//*[@name='description']")).clear();
			
			
           WebElement importantNote=driver.findElement(By.xpath("//*[@name='importantNote']"));					
			
			
			importantNote.sendKeys("Use all the failures to success");
			
			driver.findElement(By.xpath("//input[@value='Update']"));					
			
			String page=driver.getTitle();
			
			System.out.println(page);
			
			//*[@name='importantNote']
			
			
			
	}

}
