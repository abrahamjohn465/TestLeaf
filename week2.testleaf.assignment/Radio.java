package week2.assignment3;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//1. Load url "http://www.leafground.com/pages/radio.html"
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='myradio' and @id='yes']")).click();
		
		driver.findElement(By.xpath("//input[@name='news' and @value='0']")).click();
		
		driver.findElement(By.xpath("//input[@name='age' and @value='1']")).click();
		
		//driver.close();
	}

}
