/**
 * 
 */
package week2.assignment2;

import java.util.Arrays;

/**
 * @author Admin
 *
 */
public class Secondlargestnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] num = {8,55,66,22,33,11,44,33,78,98,101,32,42,21,84,10,8,4,6};
		
		Arrays.sort(num);
		
		for (int i=0; i < num.length; i++)
		{
			System.out.println(num[num.length-2]);
			break;
		}
	}

}
