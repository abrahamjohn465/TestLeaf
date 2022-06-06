package week3.assignment.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 * 
		 * missing Number
int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};

/*
	 * Psuedocode
	 * 
	 * 1) Remove the duplicates using Set
	 * 2) Make sure the set is in the ascending order
	 * 3) Iterate from the starting number and verify the next number is + 1
	 * 4) If did not match, that is the number
	 * 
	 
		 */
		
		Integer[] numbers = {4,6,7,2,3,1,9,10,6,2};
		
		Set<Integer> num=new TreeSet<Integer>();
		
		//Arrays.asList(numbers);
		
		//System.out.println(numbers);
		
		num.addAll(Arrays.asList(numbers));
		
		//for (Integer element : num) {
			
			//System.out.println(num);
			
		//}
		
		List<Integer> test=new ArrayList<Integer>(num);
		
		for (int i = 0; i < test.size(); i++) {
			
int m =i+1;
int n=test.get(i);



			if (!test.contains(m))
			{
				System.out.println(m);
				continue;
				
			}
			
		}
		

	}

}
