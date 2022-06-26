package week4.assignment.classroom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irtc {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 /* Disable Popup Notifications on the browser */
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'FLIGHTS')])[1]")).click();
		//String windowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> win=new ArrayList<String>(windowHandles);
		
		//https://testng.org/testng-eclipse-update-site/
		
		driver.switchTo().window(win.get(1));
		
		
	}

}
