package week4.assignment.classroom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub WebDriverManager.chromedriver().setup();
				 WebDriverManager.chromedriver().setup();
				 /* Disable Popup Notifications on the browser */
			        ChromeOptions options = new ChromeOptions();
			        options.addArguments("--disable-notifications");
				ChromeDriver driver=new ChromeDriver(options);
			
				driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
				//iframeResult
				 driver.switchTo().frame("iframeResult");
				 
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				Alert alert = driver.switchTo().alert();
				alert.sendKeys("John Abraham");
				alert.accept();
				String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
				
				if (text.contains("John Abraham"))
				{
					System.out.println("present");
				}
				else
				{
					System.out.println(" Not present");
				}
				
				
				
				Set<String> windowHandles = driver.getWindowHandles();
				
				List<String> win=new ArrayList<String>(windowHandles);
				
			
				
				driver.switchTo().window(win.get(1));
				
	}

}
