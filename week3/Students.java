package week3.assignment.classroom;

public class Students {

	
	public void getStudentInfo(int id)
	{
	  System.out.println(id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println(id + name);
	}
	
	public void getStudentInfo(String email, String phonenumber)
	{
		System.out.println(email + phonenumber);
	}
	public static void main(String[] args) {
		
		Students stu=new Students();
		stu.getStudentInfo(101);
		stu.getStudentInfo(102, "jo");
		stu.getStudentInfo("johnsither", "9578015902");

	}

}
