package cn.itcast.mybatis.pojo;

import java.util.Date;

/** 
* @author lijin E-mail: lijin1@itcast.cn 
* @date   2017年8月27日 下午3:11:12 
* 类说明 
*/
public class Order {

	// 订单id
	private Integer id; 
	// 用户id
	private Integer userId;
	// 订单号
	private String number;
	// 订单创建时间
	private Date createtime;
	// 备注
	private String note;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + "]";
	}

}
