package day090301JDBC01基础01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Test3清除缓存01 {

	public static void main(String[] args) throws Exception {

//		Class.forName("com.mysql.jdbc.Driver");
//
//		String url = "jdbc:mysql://localhost:3306/javatzy";
//		String user = "root";
//		String password = "123456";

		List<Connection> list = new ArrayList<Connection>();

		for (int i = 0; i < 101; i++) {
			
			Connection conn=DBHelp.getConn();
//			Connection conn = DriverManager.getConnection(url, user, password);
			
			DBHelp.closeConn(conn);
//			conn.close();
			
			list.add(conn);
		}
		
		System.out.println(list.size());

	}

}
