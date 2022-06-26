package week5.assignment.workout;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parentclass {
	
	
	public static ChromeDriver driver;
	
	@Parameters({"url"})
	@BeforeMethod
	public void openbrowser(String url) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//W	driver.manage().window().maximize();
		
		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	

	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
