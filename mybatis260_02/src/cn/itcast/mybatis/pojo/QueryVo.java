package cn.itcast.mybatis.pojo;

import java.util.List;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月27日 下午3:01:28 
* 类说明 
*/
public class QueryVo {

	private User user;
	
	private List<Integer> ids;
	
	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
