package week3.assignment.classroom;

public class Smartphones extends Androidphone {
	
	
	public void connectwhatsapp()
	{
		System.out.println("connectwhatsapp");
	}
	
	public void takevideo()
	{
		System.out.println("takevideo smart pointoveride");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphones sp=new Smartphones();
		Androidphone ap=new Androidphone();
		//sp.savecontact();
		//sp.sendmsg();
		//sp.makecall();
		sp.takevideo();
		ap.takevideo();
		//sp.connectwhatsapp();
	}

}
