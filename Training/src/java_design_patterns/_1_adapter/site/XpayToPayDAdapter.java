package java_design_patterns._1_adapter.site;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Locale;

import java_design_patterns._1_adapter.payd.PayD;
import java_design_patterns._1_adapter.xpay.Xpay;

public class XpayToPayDAdapter implements PayD {
	
	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;
	
	private final Xpay xpay;
	
	public XpayToPayDAdapter(Xpay xpay) {
		this.xpay=xpay;
		setProp();
	}
	
	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

		/*		
	    DateFormat df;
	    df = DateFormat.getDateInstance(1, Locale.forLanguageTag("uk"));	    
		
		Calendar calendar=Calendar.getInstance();
		
		calendar.set((int)Integer.parseInt(obj.getCardExpYear()), (int)Integer.parseInt(obj.getCardExpMonth()),1);
		
		LocalDateTime ldt=LocalDateTime.of((int)Integer.parseInt(obj.getCardExpYear()), (int)Integer.parseInt(obj.getCardExpMonth()), 1, 0, 0);
		//DateTimeFormatter formmater = DateTimeFormatter.ofPattern("yyyy-mmm-dd", Locale.forLanguageTag("uk"));
		
		FormatStyle style=FormatStyle.MEDIUM;
		DateTimeFormatter formmater = DateTimeFormatter.ofLocalizedDate(style);
		return formmater.format(ldt);
	}
*/
	@Override
	public Integer getCVVNo() {
		return cVVNo;	
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo=custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName=cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate=cardExpMonthDate;
		//obj.setCardExpMonth(cardExpMonthDate.substring(5, 7));
		//obj.setCardExpYear(cardExpMonthDate.substring(0, 4));		
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo=cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount=totalAmount;
	}

	private void setProp() {
		setCardOwnerName(this.xpay.getCustomerName());
		setCustCardNo(this.xpay.getCreditCardNo());
		setCardExpMonthDate(this.xpay.getCardExpMonth()+"/"+this.xpay.getCardExpYear());
		setCVVNo(this.xpay.getCardCVVNo().intValue());
		setTotalAmount(this.xpay.getAmount());
	}
}
