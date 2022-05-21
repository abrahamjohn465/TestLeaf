package week2.assignment2;

import week1.assignment1.Reusable;

public class Calculator {
	 double c;
	 public static Calculator INSTANCE=new Calculator();

	  public static Calculator getINSTANCE()
	  {
	    return INSTANCE;
	  }
	
	public double add(int a,int b)
	{
		 return c = a + b;
		
	}
	public double sub(int a,int b)
	{
		return c = a - b;
		
	}
	public double mul(int a,int b)
	{
		return c = a * b;
		
	}
	public double div(int a,int b)
	{
		return c = a / b;
		
	}
	
	

}
