package de.oio.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("CC") //notwendig für InheritanceType.SINGLE_TABLE
@PrimaryKeyJoinColumn(name = "CC_ID")
public class CreditCard extends BillingDetail {

	private CreditCardType creditCardType;
	private int expiryMonth; 
	private int expiryYear;
	
	public CreditCardType getCreditCardType() {
		return creditCardType;
	}
	public void setCreditCardType(CreditCardType creditCardType) {
		this.creditCardType = creditCardType;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
}
