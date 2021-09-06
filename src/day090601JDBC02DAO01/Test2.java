package day090601JDBC02DAO01;

import java.util.Properties;

public class Test2 {

	public static void main(String[] args) throws Exception {
		
		Properties pro=new Properties();
		
		pro.load(Test1.class.getResourceAsStream("obj.properties"));
		
		IUserService  userService= (IUserService) Class.forName(pro.getProperty("userService")).newInstance();
		
		userService.show();
		
	}

}
