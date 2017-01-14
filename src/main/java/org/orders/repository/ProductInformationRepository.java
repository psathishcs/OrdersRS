package org.orders.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orders.entity.ProductDescriptions;
import org.orders.entity.ProductInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductInformationRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<ProductInformation> getAllProductInformation(){
		return getSession().createQuery("from ProductInformation").list();
	}
	
	
	public ProductInformation getProductInformationByID(Long productID){
		return (ProductInformation) getSession().createQuery("from ProductInformation where productID = :productID").
				setParameter("productID", productID).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<ProductInformation> getProductInformationByName(String  productName){
		return getSession().createQuery("from ProductInformation where productName = :productName").
				setParameter("productName", productName).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<ProductInformation> getProductInformationByCategoryID(Short categoryID){
		return getSession().createQuery("from ProductInformation where categoryID = :categoryID").
				setParameter("categoryID", categoryID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<ProductInformation> getProductInformationBySupplierID(Long supplierID){
		return getSession().createQuery("from ProductInformation where supplierID = :supplierID").
				setParameter("supplierID", supplierID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<ProductInformation> getProductInformationByProductStatus(String productStatus){
		return getSession().createQuery("from ProductInformation where productStatus = :productStatus").
				setParameter("productStatus", productStatus).list();
	}
}
