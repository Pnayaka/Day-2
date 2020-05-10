package springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});

  	    	Payment pay = (Payment)context.getBean("PaymentBean");
  	    	System.out.println(pay);
  	    	
  	    	UPIPay upipay = (UPIPay)context.getBean("UPIPayment");
  	    	System.out.println(upipay);
  	    	
  	    	WalletPayment walletpay = (WalletPayment)context.getBean("WalletPayment");
  	    	System.out.println(walletpay);
	}

}
