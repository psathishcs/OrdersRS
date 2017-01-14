package org.orders.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CUSTOMERS")
public class Customers implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CUSTOMER_ID")
	private Long customerID;
	@Column(name = "CUST_FIRST_NAME")
	private String custFirstName;
	@Column(name = "CUST_LAST_NAME")
	private String custLastName;
	//@Column(name = "CUST_ADDRESS")
	private String custAddress;
	//@Column(name = "PHONE_NUMBERS")
	private String phoneNumbers;
	@Column(name = "NLS_LANGUAGE")
	private String nlsLanguage;
	@Column(name = "NLS_TERRITORY")
	private String nlsTerritory;
	@Column(name = "CREDIT_LIMIT")
	private Double creditLimit;
	@Column(name = "CUST_EMAIL")
	private String custEmail;
	@Column(name = "ACCOUNT_MGR_ID")
	private Long accountMgrID;
//	@Column(name = "CUST_GEO_LOCATION")
	private BigInteger custGeoLocation;
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	@Column(name = "MARITAL_STATUS")
	private String maritalStatus;
	@Column(name = "GENDER")
	private Character gender;
	@Column(name = "INCOME_LEVEL")
	private String incomeLevel;
	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}
	public String getCustFirstName() {
		return custFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public String getNlsLanguage() {
		return nlsLanguage;
	}
	public void setNlsLanguage(String nlsLanguage) {
		this.nlsLanguage = nlsLanguage;
	}
	public String getNlsTerritory() {
		return nlsTerritory;
	}
	public void setNlsTerritory(String nlsTerritory) {
		this.nlsTerritory = nlsTerritory;
	}
	public Double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public Long getAccountMgrID() {
		return accountMgrID;
	}
	public void setAccountMgrID(Long accountMgrID) {
		this.accountMgrID = accountMgrID;
	}
	public BigInteger getCustGeoLocation() {
		return custGeoLocation;
	}
	public void setCustGeoLocation(BigInteger custGeoLocation) {
		this.custGeoLocation = custGeoLocation;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public String getIncomeLevel() {
		return incomeLevel;
	}
	public void setIncomeLevel(String incomeLevel) {
		this.incomeLevel = incomeLevel;
	}
}
