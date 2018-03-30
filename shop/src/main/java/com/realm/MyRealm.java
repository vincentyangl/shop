package com.realm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Permissions;
import com.bean.User;
import com.service.PermissionsService;
import com.service.UserService;

public class MyRealm extends AuthorizingRealm{

	@Autowired
	private UserService userService;
	@Autowired
	private PermissionsService permissionsService;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//��ȡ�ĵ�¼����û���
		String user_name = (String) principals.getPrimaryPrincipal();
		User user = getUserByName(user_name).get(0);
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		Set<String> set = new HashSet<>();
		set.add(user.getRole().getRole_name());
		//��װ��ɫ����
		authorizationInfo.setRoles(set);
		//��װ��ɫ��Ӧ��Ȩ�޼���
		authorizationInfo.setStringPermissions(getPermissionsName(user.getRole().getRole_id()));
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//  AuthenticationToken �Ǵ�handler�д������� UsernamePasswordToken ���ǵĹ�ϣ��һ��
		// 1.�� AuthenticationToken ת��Ϊ UsernamePasswordToken
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		// 2. ��UsernamePasswordToken�л�ȡ username
		String username = upToken.getUsername();
		// 3.�������ݿ�ķ����������ݿ��в�ѯusername��Ӧ���û���¼
		List<User> users = getUserByName(username);
		//4.���û������ڣ�������׳� UnknownAccountException �쳣
		if (users.size()==0) {
			return null;
		}
		/*//5.�����û�����������Ƿ���Ҫ�׳����� AuthenticationException �쳣
			if ("monster".equals(username)) {
				throw new LockedAccountException("�û�������");
			}*/
		//6.�����û������������ AuthenticationInfo ���󲢷���,ͨ��ʹ�õ�ʵ������  SimpleAuthenticationInfo
		//������Ϣ�Ǵ����ݿ��л�ȡ��

		//1��principal��֤��ʵ����Ϣ������ʹusername,Ҳ���������ݱ��Ӧ���û���ʵ�����
		Object principal = username;
		//2)�����ݿ��л�ȡ������
		Object credentials = users.get(0).getUser_password();
		
		//3)realmName����ǰrealm�����name,���ø����getName() ��������
		String realmName = getName();
		//��ֵ
		ByteSource salt = ByteSource.Util.bytes(username);
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials,salt, realmName);
		return info;
	}
	
	public Set<String> getPermissionsName(int role_id) {
		Set<String> set = new HashSet<>();
		List<Permissions> permissions = permissionsService.getPermissionsByRoleId(role_id);
		for (Permissions permissions2 : permissions) {
			set.add(permissions2.getPer_name());
		}
		return set;
	}

	public List<User> getUserByName(String user_name) {
		Map map = new HashMap<>();
		map.put("user_name", user_name);
		List<User> users = userService.listAll(map);
		return users;
	}
	

	public static void main(String[] args) {
		
		String hashAlgorithName="MD5";
		String pass="888888";
		Object salt=ByteSource.Util.bytes("jack");
		int count=1024;
		Object result=new SimpleHash(hashAlgorithName, pass,salt,count);
		System.out.println("result:"+result);
		
	}
	
}
