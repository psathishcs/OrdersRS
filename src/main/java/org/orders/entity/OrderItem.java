package  org.orders.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_ITEMS")
public class OrderItem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private OrderItemPK orderItemPK;
	@Column(name = "PRODUCT_ID")
	private Long productID;
	@Column(name = "UNIT_PRICE")
	private Double unitPrice;
	@Column(name = "QUANTITY")
	private Long quantity;
	
	
	public OrderItemPK getOrderItemPK() {
		return orderItemPK;
	}
	public void setOrderItemPK(OrderItemPK orderItemPK) {
		this.orderItemPK = orderItemPK;
	}
	public Long getProductID() {
		return productID;
	}
	public void setProductID(Long productID) {
		this.productID = productID;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
		
	
}
