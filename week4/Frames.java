package week4.workout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
			
			WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		//https://www.softwaretestingo.com/github-git-tutorial/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement source = driver.findElement(By.id("txtStationFrom"));
		driver.switchTo().frame("frame1");
		
driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("jo");

Thread.sleep(1000);
		
		driver.switchTo().frame("frame3");
		
		//b[@id='topic']/following-sibling::input
		
		driver.findElement(By.xpath("//input[@id='a' and @type='checkbox']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement findElement = driver.findElement(By.id("animals"));
		
		Select sl=new Select(findElement);
		
		sl.selectByIndex(3);
		
		
	}

}
