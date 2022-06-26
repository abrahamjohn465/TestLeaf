package week4.workout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//WebDriver frame = driver.switchTo().frame(1);
			 WebElement source = driver.findElement(By.xpath("(//div[@id='columns']/div)[1]"));
			 WebElement destination = driver.findElement(By.xpath("(//div[@id='columns']/div)[2]"));
			Thread.sleep(200);
			 Actions action=new Actions(driver);
			 //action.dragAndDrop(destination, source).perform();
			 
			// action.clickAndHold(destination).pause(2000).moveToElement(source).release().perform();
	}

}
