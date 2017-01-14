package org.orders.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderItemPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ORDER_ID")
	private BigInteger orderID;
	@Column(name = "LINE_ITEM_ID")
	private Integer lineItemID;
	public OrderItemPK() {
		super();
	}
	public BigInteger getOrderID() {
		return orderID;
	}
	public void setOrderID(BigInteger orderID) {
		this.orderID = orderID;
	}
	public Integer getLineItemID() {
		return lineItemID;
	}
	public void setLineItemID(Integer lineItemID) {
		this.lineItemID = lineItemID;
	}
	
}
