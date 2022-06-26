package week4.workout;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> column = driver.findElements(By.xpath("//table//tr/th"));
		
		int col = column.size();
		
		List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		
         int row1 = row.size();
         
         System.out.println("column count" + col);
         System.out.println("row count"+ row1);
         
         for (int i = 2; i <= row1; i++) {
        	 
        	 Thread.sleep(1000);
        	 
        	WebElement Learninteract = driver.findElement(By.xpath("//table//tr[" + i + "]/td[1]"));
        	String actual = Learninteract.getText();
        	
        	String excepted="Learn to interact with Elements";
        	if (actual.equals(excepted))
        	{
				    
        		 WebElement ele = driver.findElement(By.xpath("//table//tr[" + i + "]/td[2]"));
        		 System.out.println(ele.getText());
        	}
        	else
        	{
        		System.out.println("not found");
        	}
				
        	WebElement Progress = driver.findElement(By.xpath("//table//tr[" + i + "]/td[2]"));
        	
        	String per = Progress.getText();
        	
        	if (per.contains("100%"))
        		
        	{
        		//table//tr[" + i + "]/td[3]/input
        		WebElement check = driver.findElement(By.xpath("//table//tr[" + i + "]/td[3]/input"));
        		check.click();
        		System.out.println("selected");
        	}
        	
			
		}
         
         
         
         
	}

}
