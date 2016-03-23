package sit.mp.ecrop.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sit.mp.ecrop.entity.Survey;
import sit.mp.ecrop.entity.Survey_Boundary;

public class SurveyDAO {
	
	ResultSet keyset;
	public int createSurvey(Survey s)
	{
		String sql="insert into survey(survey_no,owner_name,soil_color,area)values(?,?,?,?)";
		int row=0;
		int key=0;
		Connection conn = DBConnectionManager.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getSurvey_no());
			ps.setString(2, s.getOwner_name());
			ps.setString(3, s.getSoil_color());
			ps.setString(4, s.getArea());
			row=ps.executeUpdate();
			keyset=ps.getGeneratedKeys();
			while(keyset.next()&&keyset!=null)
			{
				key=keyset.getInt(1);
			}
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return key;
	}
	
	public boolean createSurveyboundary(Survey_Boundary sb)
	{
	  String sql="insert into survey_boundary(survey_no,point,longitude,lattitude)values(?,?,?,?)";
	  int row=0;
	  Connection conn = DBConnectionManager.getConnection();
	
	  try 
	  {
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, sb.getSurvey_no());
		ps.setInt(2, sb.getPoint());
		ps.setFloat(3, sb.getLongitude());
		ps.setFloat(3, sb.getLatitude());
		row=ps.executeUpdate();
		conn.close();
	  } 
	  catch (SQLException e) 
	  {
			e.printStackTrace();
	  }
	  return row>0;
	}


}
