package demo;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import sailpoint.object.Identity;

public class IIQRestClient {

    public static void main(String[] args) {
        Logger log  =   Logger.getLogger("Mbank.Active.Rule");
        
        log.debug(Level.DEBUG);
        log.debug("Mbank.Active.Rule starting .......");
        boolean isValid = false;
        
        Identity newIdentity = null;
        if(newIdentity != null && newIdentity.getAttribute("inactiveIdentity").equals("FALSE")) {
        	
        }
        
        
    }
}