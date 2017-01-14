package org.orders.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orders.entity.Inventories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class InventoriesRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Inventories> getAllInventories(){
		return getSession().createQuery("from Inventories").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Inventories> getInventoriesByProductID(Long productID) {
		return getSession().createQuery("from Inventories where inventoriesPK.productID = :productID").
				setParameter("productID", productID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Inventories> getInventoriesByWareHouseID(Short wareHouseID) {
		return getSession().createQuery("from Inventories where inventoriesPK.wareHouseID = :wareHouseID").
				setParameter("wareHouseID", wareHouseID).list();
	}
}
