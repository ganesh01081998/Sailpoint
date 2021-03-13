package demo;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.object.GroupDefinition;
import sailpoint.object.GroupFactory;
import sailpoint.object.Identity;
import sailpoint.object.Link;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;

public class dsfsdf {

	public static void main(String[] args) throws GeneralException {
		SailPointContext context = null;
		 QueryOptions qo=new QueryOptions();
			/*qo.addFilter(Filter.subquery("location",GroupDefinition.class,"name",Filter.ignoreCase(Filter.eq("name","San Jose"))));
			List list=context.getObjects(Identity.class,qo);
             list.size();
			  for(Identity iden:list){
			 iden.add(context.getObjectByName(Identity.class,"demo"));
			 
			    context.saveObject(iden);
	        context.commitTransaction();
			  }*/
		 
		 
		 /*
		 Identity id = new Identity();
		 id.setName("CustomWorkgroup");
		 id.setWorkgroup(true);
		 context.saveObject(id);
		 context.commitTransaction();*/
		 GroupFactory gfo = new GroupFactory();
		 gfo.setName("hello");
		 gfo.setEnabled(true);
		
  context.saveObject(gfo);
		 context.commitTransaction();
		Identity list = context.getObjects(Identity.class);
		
		list.add(gfo);
		
	for(Identity ideno:list) {
		ideno.add(context.getObjectByName(GroupFactory.class,"hello"));
     context.saveObject(ideno);
		 context.commitTransaction();
    
	}
		 
		
		 
		
		 
		 
		 
	    
	}

}
