package week1.assignment1;

public class Primenumber {

	public static void main(String[] args) {
		
		
		int prime=13;
		
		int num;
		boolean flag =false;		
		for (int i = 2; i <= prime-1; i++) {
			if (i%2==0)
			{
				flag=true;
				break;
			}
			
			
			
			
			
		}
		
		if (flag==true)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("prime");
		}
		
		

	}

}
