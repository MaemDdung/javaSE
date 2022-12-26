package day15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass01 {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. 드라이버 클래스 정보를 로딩
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			 
			 // 2. 데이터 베이스 
			 String url = "jdbc:oracle:thin:@localhost:21521:xe";
			 conn = DriverManager.getConnection(url, "hr", "hr");
			 // 3. 쿼리 수행ㅇ,ㄹ 위한  
			 stmt = conn.createStatement();
			 // 4.SQL 쿼리 작성 
			 String departmentId = "20";
			 String sql = "SELECT * "
					 + "FROM employees "
					 + "WHERE department_id = " + departmentId;
			 // 5. 쿼리 수행
			 rs = stmt.executeQuery(sql);
			 
			 while (rs.next()) {
				String employeeId = rs.getString(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				
				System.out.println(employeeId+ "/"+firstName+ "/"+ lastName);
				
			}
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)rs.close();
			if(stmt != null)stmt.close();
			if(conn != null)conn.close();
			
			//다음시간에 바인드 변수 설명 해주세요
		}
		
	}
	
}
