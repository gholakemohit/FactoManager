package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel 
{
	Connection connection;
	public LoginModel()
	{
		connection = MysqlConnection.Connector();
		if(connection == null)
		{
			System.exit(1);
		}
	}
	
	public boolean isDbConnected()
	{
		try
		{
			return !connection.isClosed();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isLogin(String user,String pass) throws SQLException
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "select * from user where id = ? and password = ?";
		
		try
		{
			ps = connection.prepareStatement(query);
			ps.setString(1,user);
			ps.setString(2,pass);
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		catch(Exception e)
		{
			return false;
		}
		finally
		{
			ps.close();
			rs.close();
		}
	}
}
