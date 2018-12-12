package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection 
{
	public static Connection Connector()
	{
		 try
		 {
			 //Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/factory", "root", "root");
			 return con;
			 
		 }
		 catch(Exception e)
		 {
			 return null;
		 }
		
	}

}
