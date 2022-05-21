package week2.assignment2;



import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Filoconcept {

	public static void main(String[] args) throws FilloException{
		// TODO Auto-generated method stub
		
		String query = "SELECT * from Sheet1";
		//String filePath = "./files/SampleExcelFile1.xlsx";
		
		String filePath = "./src/main/resources/newsheet.xlsx";
		
			Fillo fillo = new Fillo();
			
			
			Connection  con = fillo.getConnection(filePath);
			
				Recordset recordset = con.executeQuery(query);
			
			
			
			
			while (recordset.next()) {
				System.out.println(recordset.getField("Name"));
			}
			recordset.close();
			con.close();
		
		

	}
	
}



