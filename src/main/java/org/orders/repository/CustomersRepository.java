package org.orders.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orders.entity.Customers;
import org.orders.entity.Inventories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomersRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Customers> getAllCustomers(){
		return getSession().createQuery("from Customers").list();
	}
	
	public Customers getCustomersByID(Long customerID){
		return (Customers) getSession().createQuery("from Customers where customerID = :customerID").
				setParameter("customerID", customerID).uniqueResult();
	}
	
	public Customers getCustomersByEmail(String custEmail){
		return (Customers) getSession().createQuery("from Customers where custEmail = :custEmail").
				setParameter("custEmail", custEmail).uniqueResult();
	}

	
	@SuppressWarnings("unchecked")
	public List<Customers> getCustomersByFirstName(String custFirstName){
		return getSession().createQuery("from Customers where custFirstName = :custFirstName").
				setParameter("custFirstName", custFirstName).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Customers> getCustomersByAccountMgrID(String accountMgrID){
		return getSession().createQuery("from Customers where accountMgrID = :accountMgrID").
				setParameter("accountMgrID", accountMgrID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Customers> getCustomersByMaritalStatus(String maritalStatus){
		return getSession().createQuery("from Customers where maritalStatus = :maritalStatus").
				setParameter("maritalStatus", maritalStatus).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Customers> getCustomersByGender(Character gender){
		return getSession().createQuery("from Customers where gender = :gender").
				setParameter("gender", gender).list();
	}
}
