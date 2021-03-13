package demo;



import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import sailpoint.api.RequestManager;
import sailpoint.api.SailPointContext;
import sailpoint.object.Attributes;
import sailpoint.object.Identity;
import sailpoint.object.Request;
import sailpoint.object.RequestDefinition;
import sailpoint.object.Workflow;
import sailpoint.tools.GeneralException;

public class EntitlementRule {

	public static void main(String[] args) throws GeneralException {
		SailPointContext context = null;
		HashMap launchArgsMap = new HashMap();
		launchArgsMap.put("launcher","spadmin");		
		launchArgsMap.put("source","Workflow");
		launchArgsMap.put("notificationScheme","none");
		launchArgsMap.put("approvalScheme", "none");		
		Workflow wf = context.getObjectByName(Workflow.class, "Form");
		Request req = new Request();
		RequestDefinition reqdef = context.getObject(RequestDefinition.class, "Workflow Request");
		req.setDefinition(reqdef);
		Attributes allArgs = new Attributes();
		allArgs.put("workflow",  wf.getName());
		//Start the WF 10 seconds from now. 
		long current = System.currentTimeMillis();
		current += TimeUnit.SECONDS.toMillis(10);
		String requestName = "Launching Provisioning WF " + current;
		allArgs.put("requestName", requestName);
		allArgs.putAll(launchArgsMap);
		req.setEventDate(new Date(current));
		Identity id = context.getObjectByName(Identity.class, "spadmin");
		req.setOwner(id);
		req.setName(requestName);
		req.setAttributes(reqdef, allArgs);
		//Actually launch the work flow via the request manager.
		RequestManager.addRequest(context, req);
	}
}
