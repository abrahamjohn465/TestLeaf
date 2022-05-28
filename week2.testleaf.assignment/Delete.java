package week2.assignment3;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete {
		
		public static void main(String[] args) throws InterruptedException {
			
WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();

			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement user=driver.findElement(By.xpath("//*[@id='username']"));
			
			user.sendKeys("DemoSalesManager");
			
			
			WebElement pwd=driver.findElement(By.xpath("//*[@id='password']"));
			
			pwd.sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			Thread.sleep(5000);
			
			String id=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			//Integer number = Integer.valueOf(id);
			
			//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			
			//List <WebElement> rows = driver.findElements(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[1]/div[1]/div/table/thead/tr/td[1]/div")); 
			//System.out.println("No of rows are : " + rows.size());
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
			driver.findElement(By.xpath("//label[contains(text(),'Lead ID:')]/following::input[@name='id']")).sendKeys(id);
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			//*[@id="ext-gen943"]
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			String record=driver.findElement(By.xpath("//*[@class='x-paging-info']")).getText();
			
			if (record.contentEquals("No records to display"))
			{
				System.out.println("Not display");
			}
			
				
			
			/*http://leaftaps.com/opentaps/control/main
			 * 
			 * 
			 * 
			 * 
			 * 
			
			 
			Delete Lead:
			1	Launch the browser
			2	Enter the username
			3	Enter the password
			4	Click Login
			5	Click crm/sfa link
			6	Click Leads link
			7	Click Find leads
			8	Click on Phone
			9	Enter phone number
			10	Click find leads button
			11	Capture lead ID of First Resulting lead
			12	Click First Resulting lead
			13	Click Delete
			14	Click Find leads
			15	Enter captured lead ID
			16	Click find leads button
			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			18	Close the browser (Do not log out)
	*/
		}
	}