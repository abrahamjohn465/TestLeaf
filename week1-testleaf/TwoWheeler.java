package week1.assignment1;


/*
 * Create a class TwoWheeler 2.Declare the given variables with appropriate values
 

int noOfWheels
short noOfMirrors
long chassisNumber
boolean isPunctured
String bikeName
double runningKM

Create object for TwoWheeler and call all the variables inside main method and print the values
*/




public class TwoWheeler {

	int noOfWheels =1;
	short noOfMirrors=32767;
	long chassisNumber=10L;
	boolean isPunctured=true;
	String bikeName="MT";
	double runningKM=1455.5;
	
	
	
	public static void main(String[] args) {
		
		TwoWheeler tw=new TwoWheeler();
		System.out.println(tw.noOfWheels);
		System.out.println(tw.noOfMirrors);
		System.out.println(tw.chassisNumber);
		System.out.println(tw.isPunctured);
		System.out.println(tw.bikeName);
		System.out.println(tw.runningKM);
	}

}
