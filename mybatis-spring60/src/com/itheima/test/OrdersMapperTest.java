package com.itheima.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mapper.OrdersMapper;
import com.itheima.pojo.Orders;
import com.itheima.pojo.OrdersExample;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月31日 下午12:17:49 
* 类说明 
*/
public class OrdersMapperTest {

	@Test
	public void testSelectByExample() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		OrdersMapper ordersMapper = (OrdersMapper)applicationContext.getBean("ordersMapper");
		OrdersExample example = new OrdersExample();
		example.createCriteria().andUserIdEqualTo(1).andNumberLike("%00%");
		List<Orders> list = ordersMapper.selectByExample(example);
		
		for (Orders o : list) {
			System.err.println(o);
		}
	}

	@Test
	public void testSelectByPrimaryKey() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		OrdersMapper ordersMapper = (OrdersMapper)applicationContext.getBean("ordersMapper");
		
		Orders orders = ordersMapper.selectByPrimaryKey(3);
		System.err.println(orders);
	}

}
