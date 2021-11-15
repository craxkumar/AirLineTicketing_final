package booking;
import signup.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class BookDao {
	public int save(Book b) throws Exception {
		int s1 = 0;
		Connection con = Signup_Dao.getConnection();
		PreparedStatement st = con.prepareStatement("insert into book values(?,?,?,?,?)");
		st.setInt(1, b.getBookid());
		st.setString(2, b.getSource());
		st.setString(3, b.getDestination());
		st.setInt(5, b.getNoofpassengers());
		st.setString(4, b.getDateofjourney());
		s1 = st.executeUpdate();
		return s1;
	}

	public static List<Book> getAllBooks() {
		ArrayList<Book> list = new ArrayList<Book>();
		try {
			Connection con = Signup_Dao.getConnection();
			PreparedStatement pStatement = con.prepareStatement("select * from Book");
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				Book s = new Book();
				s.setBookid(rSet.getInt(1));
				s.setSource(rSet.getString(2));
				s.setDestination(rSet.getString(3));
				s.setDateofjourney(rSet.getString(4));
				s.setNoofpassengers(rSet.getInt(5));
				
				list.add(s);
			}
		} catch (Exception e) {

		}
		return list;
}
}
