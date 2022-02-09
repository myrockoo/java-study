package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleInsert {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##ezen";
		String password = "ezen1234";
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url,user,password);
			System.out.println("oracle connection success.\n");			
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT ename, sal FROM emp";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("ename") + " ");
//				System.out.print(rs.getString("class_id") + " ");
				System.out.println(rs.getString("sal") + " ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


