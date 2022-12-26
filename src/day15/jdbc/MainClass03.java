package day15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass03 {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement 사용하지 말고 preparedStatement 사용하자!! //바인드 변수때문에
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
				
		try {
			 // 1. 드라이버 클래스 정보를 로딩
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			 
			 // 2. 데이터 베이스 
			 String url = "jdbc:oracle:thin:@localhost:21521:xe";
			 conn = DriverManager.getConnection(url, "hr", "hr");
			 
			 // 3. 쿼리 수행 위한  
			 StringBuffer sql = new StringBuffer();
			 

			 
			 // 4.SQL 쿼리 작성
			  
//			 SELECT id, name, salary 
//			 FROM sales_reps 
//			 WHERE ID = 2;
			 		 
			 sql.append("SELECT id, name, salary ");
			 sql.append("FROM sales_reps ");
			 sql.append("WHERE id = ? ");
			 
			 // 5. prepareStatement 객체 생성
			 pstmt = conn.prepareStatement(sql.toString());
			 
			 // ↓ 첫번째 ?에 2를 넣겠다
			 pstmt.setInt(1, 2);
			 
			 rs = pstmt.executeQuery();
			 
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 String name = rs.getString(2);
				 double salary = rs.getDouble(3);
				 
				 System.out.printf("%d, %s, %f \n", id, name, salary);
			 }
			 
			 // 6. 실행결과 출력하기
			
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null)conn.close();
			
		}
		
	}
	
	
}
