package sailpoint;



import org.apache.log4j.Logger;


import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Application;
import sailpoint.object.Attributes;
import sailpoint.object.Configuration;
import sailpoint.object.Schema;
import sailpoint.tools.GeneralException;
import sailpoint.tools.xml.XMLObjectFactory;

public class GroupRule {

	public static void main(String[] args) throws GeneralException {
		SailPointContext ctx = SailPointFactory.getCurrentContext();
		Logger log = Logger.getLogger("sailpoint.services.AllRule");
		String firstname = account.getStringAttribute("firstname");
		if (ctx == null) {
			throw new GeneralException("Unable to get sailpoint context.");
		}
		String name = Application.getName() + "_aggregationStats";
		Configuration config = ctx.getObject(Configuration.class, name);
		if (config == null) {
			if (log.isDebugEnabled()) {
				log.debug("Configuration [" + name + "] was not found creating new one.");
			}
			config = new Configuration();
			config.setName(name);
		}
		Attributes attrs = config.getAttributes();
		if (attrs == null)
			attrs = new Attributes();
		String key = Schema.getObjectType();
		attrs.put(key, stats);
		config.setAttributes(attrs);
		if (log.isDebugEnabled()) {
			log.debug("Newly created Configuration object :\n" + config.toXml());
		}
		ctx.saveObject(config);
		ctx.commitTransaction();
	}

}
