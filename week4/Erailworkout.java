package week4.workout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailworkout {
	
	public static void windowHandles(ChromeDriver driver){
		Set<String> windowHandles1 = driver.getWindowHandles();
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
		//https://www.softwaretestingo.com/github-git-tutorial/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement source = driver.findElement(By.id("txtStationFrom"));
		source.clear();
		source.sendKeys("MS");
		Thread.sleep(200);
		source.sendKeys(Keys.TAB);
		WebElement des = driver.findElement(By.id("txtStationTo"));
		des.clear();
		des.sendKeys("MDU");
		Thread.sleep(200);
		des.sendKeys(Keys.TAB);
		WebElement sort = driver.findElement(By.id("chkSelectDateOnly"));
		sort.click();
		
		WebElement Quota = driver.findElement(By.xpath("//select[@title='Select seat reservation quota']"));
		
		Select sel=new Select(Quota);
		sel.selectByVisibleText("Ladies");
		
		WebElement Class = driver.findElement(By.xpath("//select[@id='selectClassFilter']"));
		
		//select[@id='selectClassFilter']
		
		Select sel1=new Select(Class);
		List<WebElement> options = sel1.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			String Excepted="SL - Sleeper";
			WebElement exc = options.get(i);
			String actual = exc.getText();
			 if (actual.equals(Excepted))
			 {
				 sel1.selectByVisibleText("SL - Sleeper");
			 }
			
		}
		
		List<WebElement> TrainNo = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[1]"));
		
		List<WebElement> Trainname = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a"));
		
		
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		for(int i=0;i<TrainNo.size();i++){
		  hmap.put(Integer.parseInt(TrainNo.get(i).getText()),Trainname.get(i).getText());
		}
		
		for(Map.Entry m:hmap.entrySet())
		{  
		   System.out.println("Key :"+m.getKey()+"Value:"+m.getValue());  

		} 
		
		//to check the train availabiliity
		
		
		 //System.out.println(hmap.get(TrainNo).charAt(1));
		
		 int key = hmap.keySet().stream().findFirst().get();
		 
		 String key1=String.valueOf(key);
		 
		 System.out.println(key);
		 
		String Parent = driver.getWindowHandle();
		 
		 WebElement live = driver.findElement(By.xpath("//input[@id='btnLive']"));
		 
		 live.click();
		 
		 Set<String> windowHandles1 = driver.getWindowHandles();
			
			List<String> window2 = new ArrayList<String>(windowHandles1);
			for (int i = 0; i < windowHandles1.size(); i++) {
				
				driver.switchTo().window(window2.get(i));
				if(driver.getTitle().equals("Train Running Status, Live Train Status, NTES Running Status of Train")) {
					WebElement firstid=driver.findElement(By.xpath("//div[@id='txtTrainSearch']"));
					firstid.click();
					//input[@class='searchInput' and @placeholder='Train No / Name']
					driver.findElement(By.xpath("(//input[@class='searchInput'])[2]")).sendKeys(key1);
					driver.findElement(By.xpath("//div[@id='divStnSearch']/div")).click();
					driver.findElement(By.linkText("Live")).click();
					driver.findElement(By.linkText("Show Satus")).click();
				    break;
				}
			}
			
			//driver.switchTo().window(Parent);
		 
	}

}
