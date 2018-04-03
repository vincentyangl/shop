package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ShipInformation;
import com.mapper.ShipInformationDao;

@Service
public class ShipInformationServiceImpl implements ShipInformationService{

	@Autowired
	private ShipInformationDao shipDao;
	
	@Override
	public List<ShipInformation> listAll() {
		List<ShipInformation> list = shipDao.listAll();
		return list;
	}

	@Override
	public ShipInformation getById(int shipId) {
		ShipInformation shipInformation = shipDao.getById(shipId);
		return shipInformation;
	}

	@Override
	public void delete(int shipId) {
		shipDao.delete(shipId);
	}

	@Override
	public void save(ShipInformation shipInformation) {
		if (shipInformation.getDefaults()==1) {
			shipDao.updateByShipId(shipInformation.getShipId());
		}
		shipDao.save(shipInformation);
	}

	@Override
	public void update(ShipInformation shipInformation) {
		if(shipInformation.getDefaults()==1){
			updateByShipId(shipInformation.getShipId());
		}
		shipDao.update(shipInformation);
	}

	@Override
	public void updateByShipId(int shipId) {
		shipDao.updateByShipId(shipId);
	}
}
