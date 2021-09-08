package day090603JDBC04DAO03entity;

import java.sql.Date;

public class User {
	
	private int id;
	private String name;
	private String sex;
	private Date birthday;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getB() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public java.util.Date getBirthday() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
