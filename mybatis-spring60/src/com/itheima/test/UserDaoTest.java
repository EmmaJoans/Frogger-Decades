package com.itheima.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月31日 上午11:32:06 
* 类说明 
*/
public class UserDaoTest {

	@Test
	public void testFindUserById() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		User user = userDao.findUserById(10);
		System.err.println(user);
		
	}


	@Test
	public void testFindUserByUsername() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

}
