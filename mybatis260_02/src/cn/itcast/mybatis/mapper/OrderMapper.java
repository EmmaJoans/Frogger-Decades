package cn.itcast.mybatis.mapper;

import java.util.List;

import cn.itcast.mybatis.pojo.Order;
import cn.itcast.mybatis.pojo.OrderUser;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月27日 下午3:11:53 
* 类说明 
*/
public interface OrderMapper {

	/**
	 * 查询所有订单
	 * @return
	 */
	public List<Order> findOrderAll();
	
//	public List<OrderUser> findOrderUserList();
	
	public List<Order> findOrderList();
	
}
