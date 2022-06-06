package week3.assignment.classroom;

import java.util.HashSet;
import java.util.Set;

public class Removerepeat {

	public static void main(String[] args) {
		
		
		String company="amazon";
		
		char[] charArray = company.toCharArray();
		
		Set<Character> dup=new HashSet<Character>();
		
	 for (Character char1 : charArray) {
		 dup.add(char1);
	}
	 
	System.out.println(dup);
		
	 //for (Character char2 : dup) {
		//System.out.println(char2);
	}
		
		

	}


