package com.emp.service;

import java.util.Set;

import com.emp.entity.User;
/**
 * 
 * @author jojt
 * UserService层
 */
public interface UserService {
	/**
	 *  通过用户名查找用户
	 *  @param username
	 *  @return User
	 */
	public User getByUserName(String username);
	
	/**
	 *  通过用户名查找该用户所有的角色并保存在Set集合中
	 *  @param username
	 *  @return Set<String>
	 */
	public Set<String> getRoles(String username);
	
	/**
	 *  通过用户名查找该用户所有的权限并保存在Set集合中
	 *  @param username
	 *  @return Set<String>
	 */	
	public Set<String> getPermissions(String username);

}
