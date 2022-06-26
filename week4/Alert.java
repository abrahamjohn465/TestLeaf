package week4.assignment.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub WebDriverManager.chromedriver().setup();
		 WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		
		alert.accept();
	}

}
