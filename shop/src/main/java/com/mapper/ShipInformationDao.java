package com.mapper;

import java.util.List;

import com.bean.ShipInformation;

public interface ShipInformationDao {

	public List<ShipInformation> listAll();
	public ShipInformation getById(int shipId);
	public void delete(int shipId);
	public void save(ShipInformation shipInformation);
	public void update(ShipInformation shipInformation);
	public void updateByShipId(int shipId);
}
