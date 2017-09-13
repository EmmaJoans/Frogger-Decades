package cn.itcast.mybatis.mapper;

import java.util.List;

import cn.itcast.mybatis.pojo.QueryVo;
import cn.itcast.mybatis.pojo.User;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月26日 下午5:13:11 
* 类说明 
*/
public interface UserMapper {

	/**
	 * 根据用户ID查询用户信息
	 * @param id
	 * @return
	 */
	public User findUserById(Integer id);
	
	/**
	 * 根据用户名模糊查询用户列表
	 * @param username
	 * @return
	 */
//	public List<User> findUserByUsername(String username);
	public List<User> findUserByUsername(QueryVo vo);
	
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * 查询用户总条数
	 * @return
	 */
	public int findUserCount();
	
//	public List<User> findUserByIds(Integer[] ids);
//	public List<User> findUserByIds(List<Integer> ids);
	public List<User> findUserByIds(QueryVo vo);
	
	
	public List<User> findUserOrderList();
	
}
