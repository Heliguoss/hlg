package com.emp.service.impl;

import static org.junit.Assert.*;

import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emp.entity.User;
import com.emp.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserServiceImplTest {
   @Resource
   private UserService userService;
   
   
	@Test
	public void testGetByUserName() {
		User user = userService.getByUserName("ls");
		System.out.println(user);
	}

	@Test
	public void testGetRoles() {
		Set<String> set = userService.getRoles("ls");
		System.out.println(set);
	}

	@Test
	public void testGetPermissions() {
		Set<String> set = userService.getPermissions("ls");
		System.out.println(set);
	}

}
