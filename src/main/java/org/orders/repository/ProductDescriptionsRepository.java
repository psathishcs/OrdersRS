package org.orders.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orders.entity.ProductDescriptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductDescriptionsRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<ProductDescriptions> getAllProductDescriptions(){
		return getSession().createQuery("from ProductDescriptions").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<ProductDescriptions> getProductDescriptionsByProductID(Long productID){
		return getSession().createQuery("from ProductDescriptions where productDescriptionsPK.productID = :productID").
				setParameter("productID", productID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<ProductDescriptions> getProductDescriptionsByLanguageID(String languageID){
		return getSession().createQuery("from ProductDescriptions where productDescriptionsPK.languageID = :languageID").
				setParameter("languageID", languageID).list();
	}
}
