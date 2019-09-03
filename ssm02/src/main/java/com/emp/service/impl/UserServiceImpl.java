package com.emp.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.UserDao;
import com.emp.entity.User;
import com.emp.service.UserService;
/**
 * 
 * @author jojt
 * UserServiceµÄÊµÏÖ²ã
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	public User getByUserName(String username) {
		return userDao.getByUserName(username);
	}
 
	public Set<String> getRoles(String username) {
		return userDao.getRoles(username);
	}
 
	public Set<String> getPermissions(String username) {
		return userDao.getPermissions(username);
	}


}
