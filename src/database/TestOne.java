package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestOne {
	private static Connection conn=null;
	private static Statement stmt=null;
	private static PreparedStatement pstmt=null;
	private static ResultSet resSet=null;
	public static void main(String[] args) throws SQLException {
		//Load mysql driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) { System.out.println(e.getMessage());}
		//set up connection with DB
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/feedback?"+"user=admin&password=admin");
		} catch (SQLException e) { System.out.println(e.getMessage());}
		//statement allows to issue sql queries to db
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//result set
		try {
			resSet= stmt.executeQuery("select * from emp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writeResultSet(resSet);
		
		//
	}
	
	private static void writeResultSet(ResultSet resSet) throws SQLException
	{
		while(resSet.next()) {
			int empno=resSet.getInt("emp_no");
			String empName=resSet.getString("emp_name");
			System.out.println("Emp no:"+empno);
			System.out.println("EMp Name:"+empName);
		}
	}

}
