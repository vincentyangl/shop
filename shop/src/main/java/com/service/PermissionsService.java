package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Permissions;

public interface PermissionsService {

	public List<Permissions> listAll(Map map);
	public List<Permissions> getChildNode(int per_id);
	public void save(Permissions per);
	public void delete(int per_id);
	public void update(Permissions per);
	public List<Permissions> getPermissionsByRoleId(int role_id);
}
