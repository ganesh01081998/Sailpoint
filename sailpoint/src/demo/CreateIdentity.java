package demo;

import sailpoint.api.SailPointContext;
import sailpoint.object.Identity;
import sailpoint.tools.GeneralException;

public class CreateIdentity {

	public static void getDetails()  {
		SailPointContext context = null;
		 Identity id = new Identity();
		  
			id.setDisplayName("maruthikumar");
			id.setFirstname("maruthi");
			id.setLastname("kumar");
			id.setAttribute("email", "maruthikumar@gmail.com");
			id.setAttribute("employeeId", "20119");
			id.setAttribute("fullName", "maruthikumar");

			try {
				context.saveObject(id);
			} catch (GeneralException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				context.commitTransaction();
			} catch (GeneralException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
	}
}
