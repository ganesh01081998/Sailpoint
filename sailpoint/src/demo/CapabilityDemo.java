package demo;

import java.util.Date;

import sailpoint.api.SailPointContext;
import sailpoint.api.TaskManager;
import sailpoint.object.GroupFactory;
import sailpoint.object.TaskDefinition;
import sailpoint.object.TaskExecutor;
import sailpoint.tools.GeneralException;

public class CapabilityDemo {

	public static void main(String[] args) throws Exception {
		SailPointContext context = null;
		 GroupFactory gfo = new GroupFactory();
		 gfo.setName("mysura");
		 gfo.setFactoryAttribute("location");
		 gfo.setEnabled(true);
  
  context.saveObject(gfo);
		 context.commitTransaction();
		TaskDefinition task = context.getObjectByName(TaskDefinition.class, "Refresh Groups");
		TaskExecutor executor = null;
		executor.execute((SailPointContext) context.getObjectByName(TaskDefinition.class, "Refresh Groups"), null, null, null);
	
		
		TaskDefinition task = context.getObjectByName(TaskDefinition.class,"Identity Refresh");
		    TaskManager tm = new TaskManager(context);
		    tm.run(task, null);
		 
	
	
	
	
	
	
	}

}
