package org.orders.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orders.entity.ProductInformation;
import org.orders.entity.WareHouses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class WareHousesRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<WareHouses> getAllWareHouses(){
		return getSession().createQuery("from WareHouses").list();
	}
	
	public WareHouses getWareHousesByID(Integer wareHouseID){
		return (WareHouses) getSession().createQuery("from WareHouses where wareHouseID = :wareHouseID").
				setParameter("wareHouseID", wareHouseID).uniqueResult();
	}
	
	public WareHouses getWareHousesByName(String wareHouseName){
		return (WareHouses) getSession().createQuery("from WareHouses where wareHouseName = :wareHouseName").
				setParameter("wareHouseName", wareHouseName).uniqueResult();
	}
}
