package week3.assignment.classroom;

public class Calculator {
	
	
	public int add(int a, int b)
	{
		int d = a + b;
		return d;
	}
	
	public int add(int a, int b, int c)
	{
		int d = a + b + c;
		return d;
	}
	
	
	public int sub(int a, int b)
	{
		int d = a - b;
		return d;
	}
	
	
	public double sub(double a, double b)
	{
		double d = a - b;
		return d;
	}
	public double mul(int a,int b)
	{
		int d = a * b;
		return d;
	}
	public double mul(int a, double b)
	{
		double d = a * b;
		return d;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(3, 40));
		System.out.println(cal.add(5, 4, 10));
		System.out.println(cal.sub(5, 4));
		System.out.println(cal.sub(61.5, 20.0));
		System.out.println(cal.mul(5, 60));
		System.out.println(cal.mul(5, 45.80));
		
		

	}
}
