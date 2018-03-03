package com.wyizd.hfdp.c05singleton;

import java.util.Calendar;
import java.util.Date;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月27日 上午8:53:06
 * @Title 
 * @Discription 
 */
public class Commodity{
	int id;
	String description;
	String type;
	int price = 0;
	Date createDate = new Date();
	Date disableDate;
	{
		setDisableDate();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getDisableDate() {
		return disableDate;
	}
	public void setDisableDate() {
		Calendar calendar = Calendar .getInstance();
		calendar.setTime(getCreateDate());
		calendar.add(Calendar.DATE, 7);
		this.disableDate = calendar.getTime();
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", description=" + description + ", type=" + type + ", price=" + price
				+ ", createDate=" + createDate + ", disableDate=" + disableDate + "]\n";
	}

	

}
