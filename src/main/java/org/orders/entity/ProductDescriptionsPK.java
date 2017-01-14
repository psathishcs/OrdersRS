package org.orders.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class ProductDescriptionsPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name = "PRODUCT_ID")
	private Long productID;
	@Column(name = "LANGUAGE_ID")
	private String languageID;
	
	public ProductDescriptionsPK() {
		super();
	}

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public String getLanguageID() {
		return languageID;
	}

	public void setLanguageID(String languageID) {
		this.languageID = languageID;
	}
	
	
}
