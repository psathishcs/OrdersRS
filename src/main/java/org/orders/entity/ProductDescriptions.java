package org.orders.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_DESCRIPTIONS")
public class ProductDescriptions implements Serializable{
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ProductDescriptionsPK productDescriptionsPK;
	
	@Column(name = "TRANSLATED_NAME")
	private String translatedName;
	@Column(name = "TRANSLATED_DESCRIPTION")
	private String translatedDescription;

	public ProductDescriptionsPK getProductDescriptionsPK() {
		return productDescriptionsPK;
	}
	public void setProductDescriptionsPK(ProductDescriptionsPK productDescriptionsPK) {
		this.productDescriptionsPK = productDescriptionsPK;
	}
	public String getTranslatedName() {
		return translatedName;
	}
	public void setTranslatedName(String translatedName) {
		this.translatedName = translatedName;
	}
	public String getTranslatedDescription() {
		return translatedDescription;
	}
	public void setTranslatedDescription(String translatedDescription) {
		this.translatedDescription = translatedDescription;
	}
}
