package demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sailpoint.api.SailPointContext;
import sailpoint.object.Identity;
import sailpoint.tools.GeneralException;

public class DisableIdentity {

	public static void main(String[] args) throws GeneralException {

		SailPointContext context = null;

		String map = "";

		List<Identity> identity = context.getObjects(Identity.class);

		for (Identity iden : identity) {

			map = context.decrypt(context.getObject(Identity.class, iden.getDisplayName()).getPassword())  + iden.getDisplayName()+"\n";
		}
	}

}
