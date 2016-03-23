package sit.mp.ecrop.service;

import sit.mp.ecrop.db.SurveyDAO;
import sit.mp.ecrop.entity.Survey;
import sit.mp.ecrop.entity.Survey_Boundary;

public class SurveyService {
	
	public static int createSurvey(Survey s)
	{
		SurveyDAO dao=new SurveyDAO();
		return dao.createSurvey(s);
	}

	public static boolean createSurveyBoundary(Survey_Boundary sb)
	{
		SurveyDAO dao=new SurveyDAO();
		return dao.createSurveyboundary(sb);
	}
}
