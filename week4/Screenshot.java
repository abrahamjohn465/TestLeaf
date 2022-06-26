package week4.assignment.classroom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public  void screenshotpage(ChromeDriver driver) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("./screenshot1.png");
		FileUtils.copyFile(source, DestFile);
		
	}
	
	public  void screenshotpage1(ChromeDriver driver) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("./screenshot1.png");
		FileUtils.copyFile(source, DestFile);
		
	}


	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub WebDriverManager.chromedriver().setup();
				 WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("http://leafground.com/pages/Alert.html");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
				
				org.openqa.selenium.Alert alert = driver.switchTo().alert();
				Thread.sleep(1000);
				
				alert.accept();
				Screenshot sc=new Screenshot();
				
				sc.screenshotpage(driver);
				
				/*
				 * Screenshot screenshot=new
				 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).
				 * takeScreenshot(driver); try { ImageIO.write(screenshot.getImage(),"PNG",new
				 * File("path of the file")); } catch (IOException e) { // TODO Auto-generated
				 * catch block e.printStackTrace(); }
				 */
	}

}
