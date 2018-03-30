package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Permissions;
import com.mapper.PermissionsDao;

@Service
public class PermissionsServiceImpl implements PermissionsService{

	@Autowired
	private PermissionsDao permissionsDao;
	
	@Override
	public List<Permissions> listAll(Map map) {
		List<Permissions> permissions = permissionsDao.listAll(map);
		return permissions;
	}

	@Override
	public List<Permissions> getChildNode(int per_id) {
		List<Permissions> permissions = permissionsDao.getChildNode(per_id);
		return permissions;
	}

	@Override
	public void save(Permissions per) {
		permissionsDao.save(per);
	}

	@Override
	public void delete(int per_id) {
		permissionsDao.delete(per_id);
	}

	@Override
	public void update(Permissions per) {
		permissionsDao.update(per);
	}

	@Override
	public List<Permissions> getPermissionsByRoleId(int role_id) {
		List<Permissions> permissions = permissionsDao.getPermissionsByRoleId(role_id);
		return permissions;
	}

	
	
}
