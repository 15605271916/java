package day090701JDBC07事务处理01;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.omg.CORBA.DATA_CONVERSION;

import day090605JDBC06DAO05util.DBHelp;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection conn=DBHelp.getConn();
		
		DatabaseMetaData md=conn.getMetaData();
		
		System.out.println(md.getDatabaseProductName());
		System.out.println(md.getDatabaseMajorVersion());
		System.out.println(md.getDefaultTransactionIsolation());
		System.out.println(md.getDriverVersion());
		System.out.println(md.getDriverName());
		
		ResultSet rs= md.getTables(null, null, null, null);
		while(rs.next()) {
			System.out.println(rs.getObject(3));
		}
		
//		System.out.println(rs.next());
//		System.out.println(rs.getObject(1));
//		System.out.println(rs.getObject(2));
		
		rs=md.getCatalogs();
		while(rs.next()) {
			System.out.println(rs.getObject(1));
		}
		
		System.out.println("==========");
		
		rs= md.getColumns(null, null, "user", null);
		while(rs.next()) {
			System.out.println(rs.getObject("COLUMN_NAME"));
			System.out.println("----------");
			System.out.println(rs.getObject("DATA_TYPE"));
		}
		
		ResultSetMetaData md2=rs.getMetaData();
		
		System.out.println(md2.getColumnCount());
		
		for (int i = 1; i < md2.getColumnCount(); i++) {
			System.out.println(md2.getColumnName(i));
		}
		
	}

}
