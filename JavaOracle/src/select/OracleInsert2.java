package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleInsert2 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##ezen";
		String password = "ezen1234";
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			Statement stmt = conn.createStatement();
			
			String ideptno = "50", sdname = "IT", sloc = "SEOUL";
			String sql = "INSERT INTO dept VALUES ('" + ideptno + "','"+ sdname + "','"+sloc +"')";
			boolean b = stmt.execute(sql);
			if(!b) {
				System.out.println("Insert success.\n");
			}else {
				System.out.println("Insert fail.\n");
			}
			String sq12 = "SELECT deptno,dname,loc FROM dept";
			ResultSet rs = stmt.executeQuery(sq12);
			while(rs.next()) {
				System.out.print(rs.getString("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("loc") + " ");
			}
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}

}
