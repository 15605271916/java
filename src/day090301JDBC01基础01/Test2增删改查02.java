package day090301JDBC01基础01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Test2增删改查02 {
	
	

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/javatzy";
		String user="root";
		String password="123456";
		
		Connection conn=DriverManager.getConnection(url,user,password);
		
		String sql="select * from user where id=?";
		
		PreparedStatement pcmd=conn.prepareStatement(sql);
		
		pcmd.setInt(1, 5);
		
		ResultSet rs=pcmd.executeQuery();
		
		//System.out.println(rs.next());
		
		rs.next();
		String name=rs.getString(2);
		System.out.println(name);
		
		String sex=rs.getString("sex");
		System.out.println(sex);
		
		String course=rs.getString("course");
		System.out.println(course);
		
		String defen=rs.getString("defen");
		System.out.println(defen);
		
		System.out.println("==========");
		
		sql="select * from user where 1=1";
		pcmd=conn.prepareStatement(sql);
		rs=pcmd.executeQuery();
		
		Timestamp birthday;
		Date startdate;
		
		while(rs.next()) {
			name=rs.getString("name");
			sex=rs.getString("sex");
			birthday=rs.getTimestamp("birthday");
			startdate=rs.getDate("startdate");
			course=rs.getString("course");
			defen=rs.getString("defen");
			
			System.out.println(name+"-"+sex+"-"+course+"-"+defen+"-"+birthday+"-"+startdate);
		}
		
		
		
		
		
		
	}
}
