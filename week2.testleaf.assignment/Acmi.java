package week2.assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 1. Load url "https://acme-test.uipath.com/login" 2. Enter email as
		 * "kumar.testleaf@gmail.com" 3. Enter Password as "leaf@12" 4. Click login
		 * button 5. Get the title of the page and print 6. Click on Log Out 7. Close
		 * the browser (use -driver.close()) ==============
		 */
		
		WebDriverManager.chromedriver().setup();
		//W	driver.manage().window().maximize();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Email:')]/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Password:')]/following-sibling::input")).sendKeys("leaf@12");
		driver.findElement(By.xpath("(//label[contains(text(),'Password:')]/following-sibling::input/following::button)[1]")).click();
		 
		String title=driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.xpath("//*[@id='logout-form']/following-sibling::li/a")).click();
		
		
		
	}

}
