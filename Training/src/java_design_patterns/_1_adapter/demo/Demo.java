package java_design_patterns._1_adapter.demo;

import java_design_patterns._1_adapter.payd.PayD;
import java_design_patterns._1_adapter.site.XpayImpl;
import java_design_patterns._1_adapter.site.XpayToPayDAdapter;
import java_design_patterns._1_adapter.xpay.Xpay;

public class Demo {

	public static void main(String[] args) {
		
		Xpay xpay=new XpayImpl();
		xpay.setCustomerName("David Backham");
		xpay.setCreditCardNo("1234567890");
		xpay.setCardExpYear("2018");
		xpay.setCardExpMonth("08");
		xpay.setCardCVVNo((short)99);
		xpay.setAmount(1d);
		
		PayD payD=new XpayToPayDAdapter(xpay);
		testPayD(payD);
	}	
	
	private static void testPayD(PayD payD) {
		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCardExpMonthDate());
		System.out.println(payD.getCVVNo());		
		System.out.println(payD.getTotalAmount());
	}

}
