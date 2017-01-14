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
@Table(name="ORDERS")
public class Orders implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ORDER_ID")
	private BigInteger orderID;
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@Column(name = "ORDER_MODE")
	private String orderMode;
	@Column(name = "CUSTOMER_ID")
	private Long customerID;
	@Column(name = "ORDER_STATUS")
	private Short orderStatus;
	@Column(name = "ORDER_TOTAL")
	private Double orderTotla;
	@Column(name = "SALES_REP_ID")
	private Long salesRepID;
	@Column(name = "PROMOTION_ID")
	private Long promotionID;
	public BigInteger getOrderID() {
		return orderID;
	}
	public void setOrderID(BigInteger orderID) {
		this.orderID = orderID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderMode() {
		return orderMode;
	}
	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}
	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}
	public Short getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getOrderTotla() {
		return orderTotla;
	}
	public void setOrderTotla(Double orderTotla) {
		this.orderTotla = orderTotla;
	}
	public Long getSalesRepID() {
		return salesRepID;
	}
	public void setSalesRepID(Long salesRepID) {
		this.salesRepID = salesRepID;
	}
	public Long getPromotionID() {
		return promotionID;
	}
	public void setPromotionID(Long promotionID) {
		this.promotionID = promotionID;
	}
}
