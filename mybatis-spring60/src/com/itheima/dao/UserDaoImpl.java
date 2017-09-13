package com.itheima.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.itheima.pojo.User;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月31日 上午11:25:57 
* 类说明 
*/
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(Integer id) {
//		创建SqlSession操作数据库
		SqlSession sqlSession = super.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		
		return user;
	}

	@Override
	public List<User> findUserByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

}
