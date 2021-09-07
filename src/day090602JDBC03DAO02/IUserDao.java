package day090602JDBC03DAO02;

import java.util.List;

import day090603JDBC04DAO03entity.User;

//用户的数据操作
public interface IUserDao {
	
	//保存用户
	public int save(User user);
	
	//删除
	public int del(int id);
	
	//修改
	public int update(User user);
	
	//查询
	public User findById(int id);
	
	//查询多个
	public List<User> findByName(String name);
	
	//查询所有
	public List<User> findAll();
	
	//查询所有（分页）
	public List<User> findAll(int pageNo);
	
	//根据需求查询
	public List<User> findBy(User user);
	
	
	
	

}
