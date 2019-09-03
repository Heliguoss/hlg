package com.emp.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.emp.entity.User;

//用户持久层
public interface UserDao {
	/**
	 *  通过用户名查找用户
	 *  @param username
	 *  @return User
	 */
	@Select("select id,username,password,role_id from t_user where username=#{username}")
	public User getByUserName(@Param("username") String username);
	
	/**
	 *  通过用户名查找该用户所有的角色并保存在Set集合中
	 *  返回值类型是Shiro定义的
	 *  @param username
	 *  @return Set<String>
	 */	
	@Select("select r.rolename from t_user u inner join t_role r on r.id=u.role_id where u.username=#{username}")
	public Set<String> getRoles(@Param("username") String username);
	
	/**
	 *  通过用户名查找该用户所有的权限并保存在Set集合中
	 *  
	 *  @param username
	 *  @return Set<String>
	 */	 
	@Select("select p.permission_name"+
           " from t_user u inner join"+ 
              " t_role r"+
          " on u.role_id=r.id"+
         " inner join t_permission p"+
        " on p.role_id=r.id"+ 
           " where u.username=#{username}")
	public Set<String> getPermissions(@Param("username") String username);


}
