package com.example.j;
import sailpoint.api.SailPointContext;
import sailpoint.object.Identity;
import sailpoint.tools.GeneralException;


public class CreationOfIdentity {

	public static void main(String[] args) throws GeneralException {
		SailPointContext context = null;
		Identity it = new Identity();
		it.setDisplayName("GaneshAdapaOjasExample");
		it.setFirstname("Adapa");
		it.setLastname("Adapa");
		context.saveObject(it);
		context.commitTransaction();
		
	}

}
