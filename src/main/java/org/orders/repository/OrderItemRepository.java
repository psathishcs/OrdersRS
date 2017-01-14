package org.orders.repository;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orders.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class OrderItemRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<OrderItem> getAllOrderItem(){
		return getSession().createQuery("from OrderItem").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<OrderItem> getOrderItemByID(BigInteger orderID){
		return getSession().createQuery("from OrderItem where orderItemPK.orderID = :orderID").
				setParameter("orderID", orderID).list();
	}

	@SuppressWarnings("unchecked")
	public List<OrderItem> getOrderItemByLineItemID(Integer lineItemID){
		return getSession().createQuery("from OrderItem where orderItemPK.lineItemID = :lineItemID").
				setParameter("lineItemID", lineItemID).list();
	}

	
	@SuppressWarnings("unchecked")
	public List<OrderItem> getOrderItemByProductID(Long productID){
		return getSession().createQuery("from OrderItem where productID = :productID").
				setParameter("productID", productID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<OrderItem> getOrderItemByPriceRange(Double minPrice, Double maxPrice){
		return getSession().createQuery("from OrderItem where unitPrice >= :minPrice and unitPrice <= :maxPrice").
				setParameter("minPrice", minPrice).
				setParameter("maxPrice", maxPrice).list();
	}
}
