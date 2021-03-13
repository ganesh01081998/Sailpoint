package demo;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.object.Capability;
import sailpoint.object.Identity;

public class Hello {

	public static void main(String[] args) {
		SailPointContext context = null;
		String firstname = account.getStringAttribute("givenName");
		String lastname = account.getStringAttribute("sn");
		String name  = firstname + "." + lastname;
		Identity identity =new Identity();
		identity.setName(name);
		// add capabilities based on group membership
		List groups = (List)account.getAttribute("memberOf");
		if ( ( groups != null ) && ( groups.contains("user") ) ) {
		identity.add(context.getObjectByName(Capability.class,"Application Administrator"));
		}
		identity.setPassword("P@ssw0rd”");

	}

}
