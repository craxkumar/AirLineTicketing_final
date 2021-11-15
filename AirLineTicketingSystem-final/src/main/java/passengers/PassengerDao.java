package passengers;
import signup.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import signup.Signup_Dao;

import java.io.*;

public class PassengerDao {
	

	public static int save(Passenger s) {
		int sid = 1;
		int status = 0;
		try {
			Connection con = Signup_Dao.getConnection();
			PreparedStatement pStatement = con.prepareStatement("insert into Passengers values(?,?,?,idseq.nextval)");
			pStatement.setString(1, s.getP_name());
			pStatement.setInt(2, s.getP_age());
			pStatement.setString(3, s.getP_gender());
			
			status = pStatement.executeUpdate();    
			con.close();
		} catch (Exception ex) {
			ex.getStackTrace();
		}
		return status;
	}

	public static List<Passenger> getAllPassengers() {
		ArrayList<Passenger> list = new ArrayList<Passenger>();
		try {
			Connection con = Signup_Dao.getConnection();
			PreparedStatement pStatement = con.prepareStatement("select * from Passengers");
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				Passenger s = new Passenger();
				s.setP_id(rSet.getInt(4));
				s.setP_name(rSet.getString(1));
				s.setP_age(rSet.getInt(2));
				s.setP_gender(rSet.getString(3));
				list.add(s);
			}
		} catch (Exception e) {

		}
		return list;
	}
	public static int DeletePassenger(int pid) throws SQLException
	{
		Connection con = Signup_Dao.getConnection();
		PreparedStatement pst = con.prepareStatement("delete from passengers where p_id=?");
		pst.setInt(1,pid);
		int status= pst.executeUpdate();
		
		return status;
	}
	
}
