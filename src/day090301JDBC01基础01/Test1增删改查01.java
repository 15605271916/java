package day090301JDBC01基础01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;


public class Test1增删改查01 {

	public static void main(String[] args) throws Exception {


//		String className="day090301JDBC01.User";
//		//读取文件得到user对应的类的名字
//		className="day090301JDBC01.User";
//		
////		Object o1=Class.forName(className).newInstance();
////		System.out.println("*************");
////		System.out.println(o1);
//		
//		
		//动态实例化
		User u1= (User) Class.forName("day090301JDBC01基础01.User").newInstance();
		
		System.out.println(u1);
		
		Object o2=new day090301JDBC01基础01.User();
		System.out.println("*******2******");
		System.out.println(o2);
		
		//静态实例化
		User u2=new User();
		System.out.println(u2);
		
		System.out.println("==============");
	
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/javatzy";
		String user="root";
		String password="123456";
		
		
		Connection conn= DriverManager.getConnection(url, user, password);
		
		System.out.println(conn);
		
		Statement cmd=conn.createStatement();
		
		//增
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入名字:");
//		String name=sc.nextLine();
//		
//		String sql=" insert into user(id,name,sex,course,defen) values(1,'"+name+"',0,'yuwen',60)";
		
//		int count=cmd.executeUpdate(sql);
//		System.out.println(count);
		
		//删
//		String sql=" delete from user where id>=7";
//		int count=cmd.executeUpdate(sql);
//		System.out.println(count);
		
		//改
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入编号");
//		String id=sc.nextLine();
//		
//		sql=" update user set name='博为峰' where id="+id;
//		int count=cmd.executeUpdate(sql);
//		System.out.println(count);
		
		System.out.println("============");

		String sql=" insert into user(id,name) values(?,?) ";
		PreparedStatement pcmd=conn.prepareStatement(sql);
		
		//每次执行只要改变参数即可，不需要重新编译sql语句
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入姓名");
//		String name=sc.nextLine();
//		
//		pcmd.setInt(1, 7);//1表示上面的第一个问号
//		pcmd.setString(2, name);//2表示上面的第二个问号
//		//（？，？）>>(7,name)>>String sql=" insert into user(id,name) values(7,name) ";
//		pcmd.executeUpdate();
//		
//		
//		
//		System.out.println("请再次输入姓名");
//		name=sc.nextLine();
//		pcmd.setInt(1, 8);
//		pcmd.setString(2, name);
//		pcmd.executeUpdate();
		
		
		sql=" insert into user(id,name,birthday,startdate) values(?,?,?,?) ";
		pcmd=conn.prepareStatement(sql);
		
		pcmd.setInt(1, 7);
		pcmd.setString(2, "sunwuk");
//		pcmd.setDate(3, new Date(new java.util.Date().getTime()));
//		pcmd.setTimestamp(4, new Timestamp(new java.util.Date().getTime()));
		
//		pcmd.executeUpdate();
		
		pcmd.setString(3, "2021-1-1 13:20:30");
		pcmd.setString(4, "2021-1-1 13:20:31");
		
		pcmd.executeUpdate();
		
		System.out.println("============");
		
		System.out.println(new java.util.Date());
		System.out.println(new Date(102,1,1));//102意为在1900的基础上加102年（2002年）
		
		
		
	}

}
