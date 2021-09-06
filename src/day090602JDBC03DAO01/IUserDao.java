package day090602JDBC03DAO01;

import java.util.List;

import day090603JDBC04DAO02entity.User;

public interface IUserDao {
	
	public int save(User user);
	
	public int del(id);
	
	public int update(User user);
	
	public User findByid(int id);
	
	public List<User>findByName(String name);
	
	public List<User> findAll();
	
	public List<User> findBy(User user);
	
	
	
	

}
