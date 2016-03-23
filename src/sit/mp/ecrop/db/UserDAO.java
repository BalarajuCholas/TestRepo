package sit.mp.ecrop.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sit.mp.ecrop.entity.User;

public class UserDAO {
	
	public String findUser(User u)
	{
		String role=null;
		String sql = "Select role,username from user where username=? and password=?";
		Connection conn = DBConnectionManager.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getUserName());
			ps.setString(2,u.getPassword());
			ps.execute();
			
			ResultSet rs = ps.executeQuery();
			while(rs!=null && rs.next())
			{
				role=rs.getString(1);
			}		
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return role;
	}


}
