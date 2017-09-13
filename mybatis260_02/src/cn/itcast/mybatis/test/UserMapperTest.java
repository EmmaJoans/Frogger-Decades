package cn.itcast.mybatis.test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.itcast.mybatis.mapper.UserMapper;
import cn.itcast.mybatis.pojo.QueryVo;
import cn.itcast.mybatis.pojo.User;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月26日 下午5:18:47 
* 类说明 
*/
public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void init() throws Exception {
		//1、配置文件： 1、核心配置文件；2、映射文件
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//2、创建SqlSessionFactory工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}
	
	@Test
	public void testFindUserById() {
		//创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过SqlSession对象获取Mapper的代理
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(10);
		System.err.println(user);
	}

	@Test
	public void testFindUserByUsername() {
		//创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过SqlSession对象获取Mapper的代理
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		QueryVo vo = new QueryVo();
		User user = new User();
		user.setUsername("张");
//		user.setSex("1");
		vo.setUser(user);
		List<User> list = userMapper.findUserByUsername(vo);
		for (User u : list) {
			System.err.println(u);
		}
		
	}

	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}
	
	/**
	 * 演示：查询用户总条数
	 * @throws Exception
	 */
	@Test
	public void testUserCount() throws Exception {
		//创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过SqlSession对象获取Mapper的代理
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		int count = userMapper.findUserCount();
		
		System.err.println(count);
		
	}
	
	@Test
	public void testFindUserByIds() throws Exception {
		
		//创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过SqlSession对象获取Mapper的代理
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
//		Integer[] ids = {1,10,26,30};
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(10);
		a.add(16);
		a.add(30);
		QueryVo vo = new QueryVo();
		vo.setIds(a);
		List<User> list = userMapper.findUserByIds(vo);
		
		for (User user : list) {
			System.err.println(user);
		}
		
	}

	
	
	@Test
	public void testName() throws Exception {
		//创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过SqlSession对象获取Mapper的代理
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.findUserOrderList();
		
		for (User user : list) {
			System.err.println(user);
		}
		
	}
}
