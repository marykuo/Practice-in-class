
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class user_JdbcDemo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			// handle the error
		}

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/406410471?"
					+ "user=root&password=0000&serverTimezone=UTC&useSSL=false");

			Statement stmt = conn.createStatement();

			PreparedStatement sql=conn.prepareStatement("UPDATE user SET username=?, password=?, WHERE id=?");
			sql.setString(1, "meiyu");
			sql.setInt(2, 123);
			sql.setString(3, "meiyu19980928@gmail.com");
			sql.setInt(4, 1);
			sql.setInt(5, 2);
			sql.executeUpdate();
			
			ResultSet rs = stmt.executeQuery("select s.id, username, password, email, phone " + " from user s");

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3)+ "\t" + rs.getString(4)+ "\t" + rs.getInt(5));
			}

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}
}