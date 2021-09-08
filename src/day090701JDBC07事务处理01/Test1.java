package day090701JDBC07事务处理01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import day090605JDBC06DAO05util.DBHelp;

public class Test1 {

	public static void main(String[] args) {

		Connection conn = DBHelp.getConn();

		try {
			conn.setAutoCommit(false);
			String sql = " insert into user(birthday,startdate) values(?,?) ";
			PreparedStatement pcmd = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			System.out.println(conn.getAutoCommit());

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String date = sdf.format(new java.util.Date());
			
			pcmd.setString(1, date);
			pcmd.setObject(2, date);

			pcmd.executeUpdate();

			ResultSet rs = pcmd.getGeneratedKeys();
			System.out.println(rs.next());
			System.out.println(rs.getInt(1));

			sql = " insert into tel(nums,uid) values(?,?) ";
			pcmd = conn.prepareStatement(sql);
			pcmd.setString(1, "188");
			pcmd.setInt(2, rs.getInt(1));

			pcmd.executeUpdate();

			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据库保存遇到问题");
			try {
				conn.rollback();
			} catch (Exception e2) {
				e.printStackTrace();
			}
		} finally {
			DBHelp.closeConn(conn);
		}

	}

}
