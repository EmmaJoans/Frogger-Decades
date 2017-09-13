package com.itheima.dao;

import java.util.List;

import com.itheima.pojo.User;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月31日 上午11:24:47 
* 类说明 
*/
public interface UserDao {

	/**
	 * 根据ID查询用户信息
	 * @param id
	 * @return
	 */
	public User findUserById(Integer id);
	
	/**
	 * 根据用户名模糊查询用户列表
	 * @param name
	 * @return
	 */
	public List<User> findUserByUsername(String name);
	
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
	
}
