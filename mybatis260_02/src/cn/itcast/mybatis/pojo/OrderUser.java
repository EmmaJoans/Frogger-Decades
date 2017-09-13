package cn.itcast.mybatis.pojo;
/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月27日 下午4:20:43 
* 类说明 
*/
public class OrderUser extends Order {

	private String username;
	
	private String address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OrderUser [username=" + username + ", address=" + address + "]";
	}
	
	
}
