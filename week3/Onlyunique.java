package week3.assignment.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Onlyunique {

	public static void main(String[] args) {
		/*
		 * PrintOnlyUniqueCharacters
String input = "babu";

output:// a u
/*
	 * Psuedocode
	 * 
	 * 1) Convert String to Character array
	 * 2) Create a new Set -> HashSet
	 * 3) Add each character to the Set and if it is already there, remove it
	 * 4) Finally, print the set
		 */

		String input = "babu";
		
		char[] charArray = input.toCharArray();
		
		Set<Character> num=new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if (!num.contains(charArray[i]))
			{
				num.add(charArray[i]);
			}
			else
			{
				num.remove(charArray[i]);
			}
		}
		
		System.out.println(num);
		

	}

}
