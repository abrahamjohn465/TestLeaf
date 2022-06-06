package week3.assignment.classroom;

public class BankInfo {
	
	
	public void saving() {
		System.out.println("saving");
	}
	public void fixed() {
		System.out.println("fixed");
	}
	public void deposit() {
		System.out.println("deposit");
	}

	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();

	}

}
