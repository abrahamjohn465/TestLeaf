package week5.assignment.workout;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabledependspiority {

	
	
	 
	  @Test (priority = 1)
	  public void createlead() {
		  System.out.println("createlead");
	  }

	  @Test(invocationCount = 10)
	  public void editlead() {
		  System.out.println("editlead");
	  }

	  @Test(dependsOnMethods = {"viewlead"})
	  public void deletelead() {
		  System.out.println("deletelead");
	  }

	  @Test
	  public void viewlead() {
		  System.out.println("viewlead");
	  }
	 
}
