package week1.assignment1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input =153;
		int rem;
		int sum =0;
		while(input>0)
		{
			rem = input % 10;
			sum = sum + (rem * rem * rem);
			input = input /10;
			
			System.out.println(sum);
		}

	}

}
