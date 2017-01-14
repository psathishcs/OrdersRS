package org.orders.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WAREHOUSES")
public class WareHouses {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "WAREHOUSE_ID")
	private Integer wareHouseID;
	@Column(name = "WAREHOUSE_SPEC")
	private String wareHouseSpec;
	@Column(name = "WAREHOUSE_NAME")
	private String wareHouseName;
	@Column(name = "WH_GEO_LOCATION")
	private String location;

	public Integer getWareHouseID() {
		return wareHouseID;
	}
	public void setWareHouseID(Integer wareHouseID) {
		this.wareHouseID = wareHouseID;
	}
	public String getWareHouseSpec() {
		return wareHouseSpec;
	}
	public void setWareHouseSpec(String wareHouseSpec) {
		this.wareHouseSpec = wareHouseSpec;
	}
	public String getWareHouseName() {
		return wareHouseName;
	}
	public void setWareHouseName(String wareHouseName) {
		this.wareHouseName = wareHouseName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
