package sit.mp.ecrop.service;

import sit.mp.ecrop.db.AssessmentDAO;
import sit.mp.ecrop.entity.Assessment;
import sit.mp.ecrop.entity.Cultivator;
import sit.mp.ecrop.entity.Fertilizer;
import sit.mp.ecrop.entity.Insurance;
import sit.mp.ecrop.entity.Pesticide;
import sit.mp.ecrop.entity.Seed;

public class AssessmentService {
	
	 static AssessmentDAO dao;
	
	public static  int createAssessment(Assessment assmt)
	{
		dao=new AssessmentDAO();
		return dao.createAssessment(assmt);
	}
	
	public static int createCultivator(Cultivator c)
	{
		dao=new AssessmentDAO();
		return dao.createCultivator(c);
	}
	
	public static boolean insertFertilizer(Fertilizer f)
	{
		dao=new AssessmentDAO();
		return dao.insertFertilizer(f);
	}
	
	public static boolean insertPesticide(Pesticide p)
	{
		dao=new AssessmentDAO();
		return dao.insertPesticide(p);
	}
	
	public static boolean insertSeed(Seed s)
	{
		dao=new AssessmentDAO();
		return dao.insertSeed(s);
	}
	
	public static boolean insertInsurance(Insurance ins)
	{
		dao=new AssessmentDAO();
		return dao.insertInsurance(ins);
	}
}
