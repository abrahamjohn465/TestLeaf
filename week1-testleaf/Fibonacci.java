package week1.assignment1;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		int range =8;
	    System.out.println("The total range " + range);
	    
	    int firstnum = 0;
	    int secondnum =1;
	    int sum=0;
	    
	   for (int i = 0; i < range; i++) {
		   System.out.println(firstnum);
		sum =firstnum + secondnum;
		
		firstnum=secondnum;
		secondnum=sum;
		
		
	}
	}

}
