package week5.assignment.workout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Childclass extends Parentclass {
	
	@Test
	public void facebookmodule() {
		
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
		
		List<WebElement> allSelectedOptions = yr.getAllSelectedOptions();
		
		
		/*
		 * for (int i = 0; i < allSelectedOptions.size(); i++) {
		 * 
		 * WebElement ele = allSelectedOptions.get(i); String text = ele.getText(); }
		 */
		
		
		
		
		bday.selectByVisibleText("4");
		mo.selectByVisibleText("Apr");
		yr.selectByVisibleText("1997");
		//List<WebElement> se=bday.getOptions();
		
		//for (int i = 0; i < se.size(); i++) {
		//	WebElement li=se.get(i);
		//	String s=li.getText();
		//}
		
		
		WebElement gender=driver.findElement(By.xpath("(//*[contains(@name,'sex')])[1]/preceding-sibling::label"));
		gender.click();
		
		
	}
	
	@Test
	public void samefacebookmodule() {
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
		
		List<WebElement> allSelectedOptions = yr.getAllSelectedOptions();
		
		
		/*
		 * for (int i = 0; i < allSelectedOptions.size(); i++) {
		 * 
		 * WebElement ele = allSelectedOptions.get(i); String text = ele.getText(); }
		 */
		
		
		
		
		bday.selectByVisibleText("4");
		mo.selectByVisibleText("Apr");
		yr.selectByVisibleText("1997");
		//List<WebElement> se=bday.getOptions();
		
		//for (int i = 0; i < se.size(); i++) {
		//	WebElement li=se.get(i);
		//	String s=li.getText();
		//}
		
		
		WebElement gender=driver.findElement(By.xpath("(//*[contains(@name,'sex')])[1]/preceding-sibling::label"));
		gender.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
