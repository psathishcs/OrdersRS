package org.orders.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INVENTORIES")
public class Inventories implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private InventoriesPK inventoriesPK;
	
	@Column(name = "QUANTITY_ON_HAND")
	private Long quantityOnHand;
	
	public InventoriesPK getInventoriesPK() {
		return inventoriesPK;
	}
	public void setInventoriesPK(InventoriesPK inventoriesPK) {
		this.inventoriesPK = inventoriesPK;
	}
	public Long getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(Long quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
}
