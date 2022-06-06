package week3.assignment.classroom;

public class Automation extends MultipleLangauge implements Language ,TestTool {

	public static void main(String[] args) {
		Automation a=new Automation();
		a.python();
		a.ruby();
		a.Selenium();
		a.java();

	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}

}
