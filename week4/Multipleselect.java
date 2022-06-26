package week4.workout;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipleselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//1. Load url "http://www.leafground.com/pages/radio.html"
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		WebElement Item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement Item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
        WebElement Item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
        
		/*
		 * Actions act=new Actions(driver); Thread.sleep(1000);
		 * act.keyDown(Keys.CONTROL) .click(Item1) .click(Item3) .click(Item7)
		 * .keyUp(Keys.CONTROL) .perform();
		 */
        Actions act=new Actions(driver);
        act.clickAndHold(Item7).moveToElement(Item3).release().perform();
	}

}
