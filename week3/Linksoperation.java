package week3.assignment.classroom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linksoperation {
	
	/*1. Launch Chrome Browser and go to http://leafground.com/pages/Link.html
	 *2. Get all the links(using findElements)
	 *3. Click on the first Link (using get method with index as 0)
	 *4. Print the title
	 *5. Navigate back on the browser (driver.navigate().bac())
	 *6. Get all the links again (using findElements)
	 *7. Print the count of the links(size)
	 *8. print the href value(getAttribute) of the second link 
	 * */

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		List<WebElement> tagname = driver.findElements(By.tagName("a"));
		
		tagname.get(0).click();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		List<WebElement> tagname1 = driver.findElements(By.tagName("a"));
		System.out.println(tagname1.size());
		
		for (int i = 0; i < tagname1.size(); i++) {
			
			//System.out.println(tagname1.get(i).getAttribute("href"));
			
		}
		

	}

}
