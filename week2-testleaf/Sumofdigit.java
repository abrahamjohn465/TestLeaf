package week2.assignment2;

public class Sumofdigit {

	public static void main(String[] args) {
		
		int input = 153;
		int rem;
		int sum =0;
		
		
		while (input>0) {
			
		
	   rem = input % 10;
	   sum = sum + rem;
	   input = input /10;
	   
		}

	}

}
