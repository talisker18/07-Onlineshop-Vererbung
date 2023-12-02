package de.oio.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("BA") //notwendig für InheritanceType.SINGLE_TABLE
@PrimaryKeyJoinColumn(name = "BA_ID")
public class BankAccount extends BillingDetail {
	private String bankName;
	private String bankCode;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
}
