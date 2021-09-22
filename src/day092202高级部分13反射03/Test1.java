package day092202高级部分13反射03;

import java.util.Properties;

public class Test1 {

	public static void main(String[] args) throws Exception {

//		UserServer01 userServer=new UserServer01();
//		
//		userServer.reg();
		
		Properties pro=new Properties();
		
		pro.load(Test1.class.getResourceAsStream("obj.properties"));
		
		Class c=Class.forName(pro.getProperty("userServer"));
		
		IUserService userService=(IUserService)c.newInstance();
		
		System.out.println(userService.reg());
		


	}

}
