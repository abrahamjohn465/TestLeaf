package week2.assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//W	driver.manage().window().maximize();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//*[contains(@name,'firstname')]")).sendKeys("jo");
		driver.findElement(By.xpath("//*[contains(@name,'lastname')]")).sendKeys("abraham");
		driver.findElement(By.xpath("//*[contains(@name,'reg_email__')]")).sendKeys("johnsither465@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("johnsither465@gmail.com");
		
		driver.findElement(By.xpath("//*[contains(@name,'reg_passwd__')]")).sendKeys("Grace");
		WebElement birth=driver.findElement(By.xpath("//*[contains(@name,'birthday_day')]"));
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'birthday_month')]"));
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'birthday_year')]"));
		
		
		Select bday=new Select(birth);
		Select mo=new Select(month);
		Select yr=new Select(year);
		
		bday.selectByVisibleText("4");
		mo.selectByVisibleText("Apr");
		yr.selectByVisibleText("1997");
		
		
		
		WebElement gender=driver.findElement(By.xpath("(//*[contains(@name,'sex')])[1]/preceding-sibling::label"));
		gender.click();
		
		
		
		

	}

}
