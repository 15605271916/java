package day090601JDBC02DAO01;

import java.sql.Date;
import java.util.List;

import day090602JDBC03DAO02.IUserDao;
import day090603JDBC04DAO03entity.User;
import day090604JDBC05DAO04impl.UserDAO;

public class Test4 {
	
	public static void main(String[] args) {

		IUserDao userDAO=new UserDAO();
		
		day090603JDBC04DAO03entity.User user=new day090603JDBC04DAO03entity.User();
		
		user.setId(8);
		user.setName("zh");
//		user.setSex("0");
		user.setBirthday(new Date(0));
		
//		int count=userDAO.save(user);
//		if(count==1) {
//			System.out.println("保存成功！");
//		}
		
//		userDAO.del(7);
		
//		userDAO.update(user);
		
//		User u1= userDAO.findById(2);
//		System.out.println(u1.getId());
//		System.out.println(u1.getName());
		
//		List<User> userList=userDAO.findByName("zh");
//		System.out.println(userList);
		
//		List<User> userList=userDAO.findAll();
//		System.out.println(userList);
		
//		List<User> userList=userDAO.findAll(1);
//		System.out.println(userList);
//		userList=userDAO.findAll(2);
//		System.out.println(userList);
//		userList=userDAO.findAll(3);
//		System.out.println(userList);
//		userList=userDAO.findAll(4);
//		System.out.println(userList);
//		userList=userDAO.findAll(5);
//		System.out.println(userList);
		
		List<User> userList=userDAO.findBy(user);
		System.out.println(userList.size());
		
		
		
		
		
		
		
		
		
		
	}

}
