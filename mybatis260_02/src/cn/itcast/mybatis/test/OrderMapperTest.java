package cn.itcast.mybatis.test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.itcast.mybatis.mapper.OrderMapper;
import cn.itcast.mybatis.pojo.Order;
import cn.itcast.mybatis.pojo.OrderUser;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月27日 下午3:14:34 
* 类说明 
*/
public class OrderMapperTest {

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
	public void testFindOrderAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		
		
		List<Order> list = orderMapper.findOrderAll();
		
		for (Order order : list) {
			System.err.println(order);
		}
		
	}
	
	@Test
	public void testName() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		
//		List<OrderUser> list = orderMapper.findOrderUserList();
		List<Order> list = orderMapper.findOrderList();
		for (Order orderUser : list) {
			System.err.println("============");
		}
		
	}

	
}
