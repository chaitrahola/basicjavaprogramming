package jdbc;

	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class DataBaseConnection {


		public static void main(String[] args) 
		{
			
			Connection con=null;
			try {
				Class.forName("org.h2.Driver");
			}
		catch (ClassNotFoundException e) {
							e.printStackTrace();
			}
			
			try {
			con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			System.out.println(" connected");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Statement st=null;
			try {
				st = con.createStatement();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				st.execute("insert into student values (25,'anu')");
				System.out.println(" inserted in to table student");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				ResultSet rt=st.executeQuery("select * from student");
				
				while(rt.next())
				{
					System.out.println(rt.getInt(1)+" "+rt.getString(2));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		
	}



