package week4.workout;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*
		 * Amazon: 1.Load the URL https://www.amazon.in/ 2.search as " 3.Get
		 * the price of the first product 4. Print the number of customer ratings for
		 * the first displayed product 5. Click the first text link of the first image
		 * 6. Take a screen shot of the product displayed 7. Click 'Add to Cart' button
		 * 8. Get the cart subtotal and verify if it is correct. 9.close the browser
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//https://www.softwaretestingo.com/github-git-tutorial/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("Vivo");
		search.sendKeys(Keys.ENTER);
		
		//span[@class='a-price-whole']
		
		// WebElement findElement = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base']/a/span[@class='a-price']/span)[1]"));
			
		List<WebElement> listprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		String price = listprice.get(0).getText();
	
		 
		 List<WebElement> productname = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			
		 
		    Map<String,String> map = new LinkedHashMap<String,String>();  // ordered

		    for (int i=0; i<productname.size(); i++) {
		      map.put(productname.get(i).getText(), listprice.get(i).getText());    // is there a clearer way?
		    }

		    System.out.println(map);
             
		    for(Map.Entry m:map.entrySet())
			{  
			   System.out.println("Key :"+m.getKey()+"Value:"+m.getValue());  
			   
			
			}
		    
		    Thread.sleep(1000);
		    WebElement Rat = driver.findElement(By.xpath("//div[@class='a-row a-size-small']/span/following-sibling::span/a/span"));
		    System.out.println(Rat.getText());
		
		      productname.get(0).click();
		      
		      Set<String> windowHandles = driver.getWindowHandles();
		     
		    List<String> ls=new ArrayList<String>(windowHandles);
		   
		    
		 String window = ls.get(1);
		 driver.switchTo().window(window);
		 
		 
		 File source = driver.getScreenshotAs(OutputType.FILE);
		 
		 //File source = driver.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("./new.png");
			FileUtils.copyFile(source, DestFile);
			
			WebElement addtocard = driver.findElement(By.id("add-to-cart-button"));
			addtocard.click();
			
			WebElement subtotal = driver.findElement(By.xpath("//div[@id='attach-added-to-cart-message']/div/div[@class='a-fixed-left-grid-col a-col-right']//span[@class='a-size-base-plus a-color-price a-text-bold']/span"));
			String sub = subtotal.getText();
			 
			
			System.out.println(price);
			System.out.println(sub);
			if(price.equals(sub))
			{
				System.out.println("Equals");
			}
			{
				System.out.println(" Not -Equals");
			}
			
		
		 /*
			 * String Flag = "false"; for (int i = 0; i < list.size(); i++) {
			 * 
			 * if (Flag=="false") { String Price = list.get(i).getText();
			 * System.out.println(Price); Flag="True"; }
			 * 
			 * 
			 * 
			 * }
			 */
		
		//System.out.println(price);
		

	}

}
