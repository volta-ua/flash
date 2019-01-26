package java_design_patterns._1_adapter.xpay;

public interface Xpay {
	
	public String getCreditCardNo();
	public String getCustomerName();
	public String getCardExpMonth();
	public String getCardExpYear();
	public Short getCardCVVNo();
	public Double getAmount();
	
	public void setCreditCardNo(String CreditCardNo);
	public void setCustomerName(String CustomerName);
	public void setCardExpMonth(String CardExpMonth);
	public void setCardExpYear(String CardExpYear);
	public void setCardCVVNo(Short CardCVVNo);
	public void setAmount(Double Amount);
	

}
