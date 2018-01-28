package payaramicro.com.exam;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;

public class EmbeddedPayara {
	 public static void main(String[] args) throws BootstrapException {
	        PayaraMicro.getInstance().addDeployment(args[0]).bootStrap();
	    }
}
