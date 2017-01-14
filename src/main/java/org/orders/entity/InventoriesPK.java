package org.orders.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class InventoriesPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "PRODUCT_ID")
	private Long productID;
	@Column(name = "WAREHOUSE_ID")
	private Short wareHouseID;
	
	public InventoriesPK() {
		super();
	}
	public Long getProductID() {
		return productID;
	}
	public void setProductID(Long productID) {
		this.productID = productID;
	}
	public Short getWareHouseID() {
		return wareHouseID;
	}
	public void setWareHouseID(Short wareHouseID) {
		this.wareHouseID = wareHouseID;
	}
}
