package week4.workout;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import week4.assignment.classroom.Screenshot;

public class FullpageScreenshot {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 /* Disable Popup Notifications on the browser */
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		
		/*
		 * Screenshot screenshot=new
		 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).
		 * takeScreenshot(driver); try { ImageIO.write(screenshot.getImage(),"PNG",new
		 * File("path of the file")); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */

	}

}
