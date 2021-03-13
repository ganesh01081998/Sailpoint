package demo;

import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import sailpoint.api.Provisioner;
import sailpoint.api.SailPointContext;
import sailpoint.object.Identity;
import sailpoint.object.ProvisioningPlan;
import sailpoint.object.ProvisioningPlan.AttributeRequest;
import sailpoint.tools.GeneralException;

public class Demo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		SailPointContext context = null;

		Logger log = Logger.getLogger("sailpoint.services.bshdemo");
		log.setLevel(Level.DEBUG);
		log.debug("provisioning plan starting....");
		Identity identityName = null;
		try {
			identityName = context.getObject(Identity.class, "jaisai");
		} catch (GeneralException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ProvisioningPlan plan = new ProvisioningPlan();
		if (log.isDebugEnabled())
			log.debug("#########  provision plan before Account request");
		if (null != identityName)
			plan.setIdentity(identityName);
		ArrayList list = new ArrayList();
		ProvisioningPlan.AccountRequest req = new ProvisioningPlan.AccountRequest();
		req.setApplication("employee");
		req.setOperation(ProvisioningPlan.AccountRequest.Operation.Create);		
		req.setNativeIdentity("jai.sai");
		AttributeRequest reqq = new AttributeRequest("firstname",ProvisioningPlan.Operation.Set,"jai");
		req.add(reqq);
		list.add(req);
		if(list != null)
			plan.setAccountRequests(list);
			log.debug("#########  provision plan after Account request");
			Provisioner p = new Provisioner(context);
		
			
			if(plan != null)
				try {
					p.compile(plan);
				} catch (GeneralException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			try {
				p.execute();
			} catch (GeneralException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		log.debug("#########  provision plan completed  ##################");
	}
}
