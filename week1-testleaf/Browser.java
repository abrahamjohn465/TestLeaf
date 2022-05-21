package week1.assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static Browser INSTANCE =new Browser();
	
	public void OpenBrower()
	{
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.get("http://leaftaps.com/opentaps/");
}
	public static Browser getINSTANCE()
	{
	return INSTANCE;
	}
}