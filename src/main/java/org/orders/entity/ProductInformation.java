package org.orders.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_INFORMATION")
public class ProductInformation  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private Long productID;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "PRODUCT_DESCRIPTION")
	private String productDescription;
	@Column(name = "CATEGORY_ID")
	private Short categoryID;
	@Column(name = "WEIGHT_CLASS")
	private Short weightClass;
//	@Column(name = "WARRANTY_PERIOD")
	private Integer warrantyPeriod;
	@Column(name = "SUPPLIER_ID")
	private Long supplierID;
	@Column(name = "PRODUCT_STATUS")
	private String productStatus;
	@Column(name = "LIST_PRICE")
	private Double listPrice;
	@Column(name = "MIN_PRICE")
	private Double minPrice;
	@Column(name = "CATALOG_URL")
	private String catalogURL;
	
	public Long getProductID() {
		return productID;
	}
	public void setProductID(Long productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Short getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Short categoryID) {
		this.categoryID = categoryID;
	}
	public Short getWeightClass() {
		return weightClass;
	}
	public void setWeightClass(Short weightClass) {
		this.weightClass = weightClass;
	}
	public Integer getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void setWarrantyPeriod(Integer warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	public Long getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(Long supplierID) {
		this.supplierID = supplierID;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public Double getListPrice() {
		return listPrice;
	}
	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public String getCatalogURL() {
		return catalogURL;
	}
	public void setCatalogURL(String catalogURL) {
		this.catalogURL = catalogURL;
	}
}
