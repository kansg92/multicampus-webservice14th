package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelecttCust {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program
		// java projcet에 mysql connector apply하기.
		
		// 변수 선언
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM CUST WHERE id = ?";
		
		// MySQO JDBC Driver Loading 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC Driver Loading");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// MySQL Connect
		String url = "jdbc:mysql://192.168.0.14/shopdb?serverTimezone=Asia/Seoul";
		// root로 접속을 보안상이유로 막아놓은다.
		String mid = "admin1";
		String mpwd = "111111";
		try {
			con = DriverManager.getConnection(url,mid,mpwd);
			System.out.println("MySQL Server Connected...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// SQL을 이용한 요청
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, "id99");
			// 요청 결과를 확인.
			rs = ps.executeQuery();
			// 항상 key포인트를 한칸 옆으로 간 후 가져와야한다.
			rs.next();
			
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			
			System.out.println(id+" "+pwd+" "+name);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			// 예외 상황이 발생하여도 close를 해주어야함.
			// MySQL Close -> !!! close를 안해주면 MYSQL에 쓰레기가 남아 DB가 터질 수 있다.!!!
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
