package week4.workout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectmul {

	public static void main(String[] args) {
		/*
		 * Launch http://www.leafground.com/pages/Dropdown.html --> Select multiple
		 * options from Select your programs dropdowns
		 */
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement sel = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Selenium']"));
		WebElement qtp = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='UFT/QTP']"));
		Actions builder=new Actions(driver);
		
		builder.keyDown(Keys.CONTROL)
		.click(sel)
		.click(qtp)
		.keyUp(Keys.CONTROL).perform();
		
		
		 

	}

}
