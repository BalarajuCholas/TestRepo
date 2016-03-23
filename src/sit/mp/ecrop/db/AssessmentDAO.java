package sit.mp.ecrop.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sit.mp.ecrop.entity.Assessment;
import sit.mp.ecrop.entity.Cultivator;
import sit.mp.ecrop.entity.Fertilizer;
import sit.mp.ecrop.entity.Insurance;
import sit.mp.ecrop.entity.Pesticide;
import sit.mp.ecrop.entity.Seed;
import sit.mp.ecrop.service.DateConvertion;

public class AssessmentDAO {
	
	ResultSet keyset;
	
	public int createAssessment(Assessment assmt)
	{
		int key=0;
		String sql="insert  into assessment(survey_id,year,start_date,end_date,area,crop,predicted_yield,actual_yield,cultivator_id,longitude,lattitude)values(?,?,?,?,?,?,?,?,?,?,?)";
	    Connection conn=DBConnectionManager.getConnection();
	    
	    try
	    {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, assmt.getSurvey_id());
			ps.setInt(2, assmt.getYear());
			ps.setDate(3, DateConvertion.convertJavaDateToSqlDate(assmt.getStart_date()));
			ps.setDate(4, DateConvertion.convertJavaDateToSqlDate(assmt.getEnd_date()));
			ps.setString(5, assmt.getArea());
			ps.setString(6, assmt.getCrop());
			ps.setFloat(7, assmt.getPredicted_yield());
			ps.setFloat(8, assmt.getActual_yield());
			ps.setInt(9, assmt.getCultivator_id());
			ps.setFloat(10, assmt.getLongitude());
			ps.setFloat(11, assmt.getLattitude());
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
	
	public int createCultivator(Cultivator c)
	{
		String sql="insert into cultivator(fname,lname,phone_no,adhar_no)values(?,?,?,?)";
		int row=0;
		int key=0;
		Connection conn = DBConnectionManager.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getFname());
			ps.setString(2, c.getLname());
			ps.setInt(3, c.getPhone_no());
			ps.setString(4, c.getAdhar_No());
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
	
	public boolean insertFertilizer(Fertilizer f)
	{
		String sql="insert into fertilizer(assess_id,name,quantity,cost)values(?,?,?,?)";
		int row=0;
		Connection conn = DBConnectionManager.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, f.getAssess_id());
			ps.setString(2, f.getName());
			ps.setFloat(3, f.getQuantity());
			ps.setFloat(4, f.getCost());
			row=ps.executeUpdate();
			conn.close();
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return row>0;
	}
	
	public boolean insertPesticide(Pesticide p)
	{
		String sql="insert into pesticide(assess_id,name,quantity,cost)values(?,?,?,?)";
		int row=0;
		Connection conn = DBConnectionManager.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, p.getAssess_id());
			ps.setString(2, p.getName());
			ps.setFloat(3, p.getQuantity());
			ps.setFloat(4, p.getCost());
			row=ps.executeUpdate();
			conn.close();
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return row>0;
	}
	
	public boolean insertSeed(Seed s)
	{
		String sql="insert into seed(assess_id,breed,supplier,quantity,cost)values(?,?,?,?,?)";
		int row=0;
		Connection conn = DBConnectionManager.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, s.getAssess_id());
			ps.setString(2, s.getBreed());
			ps.setString(3, s.getSupplier());
			ps.setFloat(4, s.getQuantity());
			ps.setFloat(5, s.getCost());
			row=ps.executeUpdate();
			conn.close();
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return row>0;
	}
	
	public boolean insertInsurance(Insurance ins)
	{
		String sql="insert into insurance(assess_id,policy_no,premium_cost,duration)values(?,?,?,?)";
		int row=0;
		Connection conn = DBConnectionManager.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ins.getAssess_id());
			ps.setString(2, ins.getPolicy_no());
			ps.setFloat(3, ins.getPremium_cost());
			ps.setString(4, ins.getDuration());
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
