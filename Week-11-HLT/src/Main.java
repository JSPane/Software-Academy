
import java.sql.*;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Users;");
			
			while(rs.next()) {
				System.out.println(rs.getInt("user_id") + " " + rs.getString("First_name") + " " + rs.getString("Last_name"));
				
			}
			
			System.out.println();
            rs = stmt.executeQuery("SELECT * FROM Books;");
			
			while(rs.next()) {
				System.out.println(rs.getString("title") + " " + rs.getString("author") + " " + rs.getInt("ISBN"));
				
			}
			
			System.out.println();
            rs = stmt.executeQuery("SELECT * FROM Loaned WHERE (ISBN IS NOT NULL);");
			
			while(rs.next()) {
				System.out.println(rs.getInt("user_id") + " " + rs.getInt("ISBN"));
				
			}
			
			System.out.println();
            rs = stmt.executeQuery("SELECT * FROM Loaned WHERE (user_id IS NOT NULL);");
			
			while(rs.next()) {
				System.out.println(rs.getInt("user_id") + " " + rs.getInt("ISBN"));
				
			}
			
			System.out.println();
            rs = stmt.executeQuery("SELECT * FROM Loaned WHERE (ISBN IS NOT NULL AND user_id IS NOT NULL);");
			
			while(rs.next()) {
				System.out.println(rs.getInt("user_id") + " " + rs.getInt("ISBN"));
				
			}
			
			System.out.println();
            rs = stmt.executeQuery("SELECT * FROM Loaned JOIN Books ON Loaned.ISBN=Books.ISBN WHERE (due_date<CURDATE());");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Loaned.ISBN") + " " + rs.getInt("Loaned.user_id") + " " + rs.getString("Books.title")
				+ " " + rs.getString("Books.author") + " " + rs.getDate("Loaned.due_date"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}

	}

}
