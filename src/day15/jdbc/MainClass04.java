package day15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass04 {


	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement 사용하지 말고 preparedStatement 사용하자!! //바인드 변수때문에
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isSuccess = false;
				
		try {
			 // 1. 드라이버 클래스 정보를 로딩
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			 
			 // 2. 데이터 베이스 
			 String url = "jdbc:oracle:thin:@localhost:21521:xe";
			 conn = DriverManager.getConnection(url, "hr", "hr");
			 
			 // 트랜잭션 시작  
			 conn.setAutoCommit(false);

			 pstmt = conn.prepareStatement(
					 "INSERT INTO sales_reps VALUES (6 , '야도란', 200, 0.2)"
					 );
			 
			 pstmt = conn.prepareStatement(
					 "INSERT INTO sales_reps VALUES (7 , '피존투', 200, 0.2)"
					 );
			 
			 pstmt = conn.prepareStatement(
					 "INSERT INTO sales_reps VALUES (8 , '또가스', 200, 0.2)"
					 );
			 pstmt.executeLargeUpdate();
			 
			 isSuccess = true;
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(isSuccess) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null)conn.close();
			 // 4.SQL 쿼리 작성
			 
			 
			 // 5. prepareStatement 객체 생성
			 
			 
			 // 6. 실행결과 출력하기
			
			 
			 
		
			
			
		}
		
	}
	
	
}
