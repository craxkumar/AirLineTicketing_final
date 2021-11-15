package signup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Signup_Dao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "hr", "hr");

//			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.103:1521:xe", "rax", "123");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int save(Signup s) {
		int sid = 1;
		int status = 0;
		try {
			Connection con = Signup_Dao.getConnection();
			PreparedStatement pStatement = con.prepareStatement("insert into Users values(s_idseq.nextval,?,?)");
			pStatement.setString(1, s.getUsername());
			pStatement.setString(2, s.getPassword());
			status = pStatement.executeUpdate();
			con.close();
		} catch (Exception ex) {
			ex.getStackTrace();
		}
		return status;
	}

}
