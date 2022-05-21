package week1.assignment1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSampleCode {

	public static void main(String[] args) {
		Browser.getINSTANCE().OpenBrower();
		Reusable.getINSTANCE().driver.get("https://www.saucedemo.com/");
		WebElement username = Reusable.getINSTANCE().driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement password = Reusable.getINSTANCE().driver.findElement(By.id("password"));
        WebElement Login = Reusable.getINSTANCE().driver.findElement(By.id("login-button"));
       // WebElement menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
        
        //WebElement logout = driver.findElement(By.xpath("//noscript[text()='You need to enable JavaScript to run this app.']/following-sibling::div"));
        
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        Login.click();
        //menu.click();
        //logout.click();
	}

}
