package week5.assignment.workout;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {
	
public static ChromeDriver driver;
public String filename;
public String Sheetname;

//public String url="http://leaftaps.com/opentaps/control/login";
public static Properties pro =new Properties();

public static void LoadProperties()
{
  try {
    String fileName = "src/test/resources/Environment.properties";
    Common.class.getClassLoader().getResourceAsStream(fileName);
    pro.load(new FileInputStream(fileName));
  }catch (Exception e)
  {e.printStackTrace();}

}
	
	@Parameters({"url"})
	@BeforeMethod
	public void openbrowser(String url) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//W	driver.manage().window().maximize();
		
		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
	

	}
	@DataProvider(name ="getdata")
	public String[][] fetchdata() throws IOException {
		return ReadExcel.Readdata(filename, Sheetname);
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
