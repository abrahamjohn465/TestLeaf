package week1.assignment1;

import org.openqa.selenium.WebDriver;

public class Reusable {
	
	
	
	
	  public static WebDriver driver;

	  public static Reusable INSTANCE=new Reusable();

	  public static Reusable getINSTANCE()
	  {
	    return INSTANCE;
	  }
	

}
