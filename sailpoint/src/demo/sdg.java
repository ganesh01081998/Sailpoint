package demo;

import java.util.HashMap;
import sailpoint.connector.DelimitedFileConnector;
public class sdg {

	public static void main(String[] args) {
		

		 
		HashMap map = DelimitedFileConnector.defaultBuildMap(cols,record);
		String studentId= (String) map.get("employeeId");
		String fname= (String) map.get( "firstName" );
		String lname= (String) map.get( "lastName" );

		char c1 = fname.charAt(0);
		char c2 = lname.charAt(0);

		String text = c1 +c2+studentId;

		   map.put( "employeeId", text );
		 

	}

}
