import java.sql.*;


public class JDBC_Connection {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		// forName is the method for loading the class of connection 
		// Driver is the class Name
		Class.forName("con.mysql.jdbc.Driver");
		
		// Connection is a interface 
		// So we cannot creat object for an interface direclty 
		// So we use getConnection method of DriverManager class
		
		// Method ==> Connection getConnection(String url, String username, String password) 
		
		String url="jdbc:mysql://localhost:3306/bank";
		String username="root";
		String pass="";
		Connection con= DriverManager.getConnection(url,username,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from bank_det");
		
		//getString(columnIndex)
		System.out.print(rs.getString(1));
		

	}

}
