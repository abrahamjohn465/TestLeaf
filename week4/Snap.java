package week4.assignment.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snap {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/?utm_term=437025299421_104151711009_%7Bbidstrategy%7D&gclid=EAIaIQobChMI9OrT0KeW-AIV65JmAh1o5gMzEAAYASAAEgKmo_D_BwE&utm_campaign=brand_account_brandcat_cpt_1d_ftu&utm_source=earth_sembrand&utm_medium=snapdeal");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Men = driver.findElement(By.linkText("Men's Fashion"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(Men).perform();
		WebElement Shirts = driver.findElement(By.linkText("Shirts"));
		Shirts.click();
		
		WebElement first = driver.findElement(By.xpath("(//*[@class='js-section clearfix dp-widget dp-fired']/div)[1]"));
		
		builder.moveToElement(first).perform();
		
		
		
	
		
		

	}

}
