package org.orders.repository;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orders.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class OrdersRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Orders> getAllOrders(){
		return getSession().createQuery("from Orders").list();
	}

	public Orders getOrdersByID(BigInteger orderID){
		return (Orders) getSession().createQuery("from Orders where orderID = :orderID").
				setParameter("orderID", orderID).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Orders> getOrdersByOrderMode(String orderMode){
		return getSession().createQuery("from Orders where orderMode = :orderMode").
				setParameter("orderMode", orderMode).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Orders> getOrdersByCustomerID(Long customerID){
		return getSession().createQuery("from Orders where customerID = :customerID").
				setParameter("customerID", customerID).list();
	}
	@SuppressWarnings("unchecked")
	public List<Orders> getOrdersByOrderStatus(Short orderStatus){
		return getSession().createQuery("from Orders where orderStatus = :orderStatus").
				setParameter("orderStatus", orderStatus).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Orders> getOrdersBySalesRepID(Long salesRepID){
		return getSession().createQuery("from Orders where salesRepID = :salesRepID").
				setParameter("salesRepID", salesRepID).list();
	}
}
