package day15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//id 8번을 리자몽으로 바꾸기
public class MainClass05 {

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
			 
//			 UPDATE sales_reps SET
//			 NAME = '리자몽'
//			 WHERE id = 8

			 //id ?에 있는 name을 리자몽으로 바꾸겠다
			 StringBuffer sql = new StringBuffer();
			 sql.append("UPDATE sales_reps SET ");
			 sql.append("NAME = '리자몽' ");
			 sql.append("WHERE id = ?");
			 
			 pstmt = conn.prepareStatement(sql.toString());
			 // id ?에  8번을 넣겠다
			 pstmt.setInt(1, 8);
			  
			 
			 //업데이트된 것이 몇개가 바뀌었는지 알려주세요!
			 int result = pstmt.executeUpdate();
			 System.out.println("result : "+ result);
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null)conn.close();
		}
		
	}
	
}
