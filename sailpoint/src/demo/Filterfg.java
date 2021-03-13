package demo;

import java.util.ArrayList;


import java.util.List;


import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.QueryOptions;

public class Filterfg {

	public static void main(String[] args) {
		SailPointContext context = null;
		 QueryOptions qo = new QueryOptions();
		  
	     //get identity based on location get one identity or more
			//Filter inactiveIdentity = Filter.like("location","hin");
	  
	  
	  //GET IDENTITIES 
	 // Filter inactiveIdentity = Filter.like("name","A",Filter.MatchMode.START);
	  Filter inactiveIdentity = Filter.eq("managerStatus" , (boolean)true);
	  
	  
	  		qo.add(inactiveIdentity);
	  qo.add(Filter.eq("Inactive", (boolean)true));
	     List demo = new ArrayList();
			
			List<Identity> identitiesNames = context.getObjects(Identity.class, qo);
			
			if(identitiesNames != null &amp;&amp; identitiesNames.size()>0) {
				for(Identity identityName:identitiesNames) {
					
					
					demo.add(identityName.getName());
					//demo.add(identityName.getFirstname());
					//demo.add(identityName.getStringAttribute("location"));
					
				}
			}
	

	}

}
