package sit.mp.ecrop.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sit.mp.ecrop.entity.Assessment;
import sit.mp.ecrop.service.AssessmentService;

/**
 * Servlet implementation class CreateAssessmentServlet
 */
public class CreateAssessmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAssessmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(true);
		RequestDispatcher rd=null;
		
		int survey_id=Integer.parseInt(request.getParameter("Survey_ID"));
		int year=Integer.parseInt(request.getParameter("Year"));
		String start_date=request.getParameter("StartDate");
		String end_date=request.getParameter("EndDate");
		String area=request.getParameter("Area");
		String crop=request.getParameter("Crop");
		int cultivator_id=Integer.parseInt(request.getParameter("Cultivator_ID"));
		float longitude=Float.parseFloat(request.getParameter("longitude"));
		float lattitude=Float.parseFloat(request.getParameter("lattitude"));
		float predicted_yield=Float.parseFloat(request.getParameter("PredictedYield"));
		float actual_yield=Float.parseFloat(request.getParameter("ActualYield"));
		
		int assess_id=AssessmentService.createAssessment(new Assessment(survey_id, year, start_date, end_date, area, crop, predicted_yield, actual_yield, cultivator_id, longitude, lattitude));
		
		if(assess_id!=0)
		{
			session.setAttribute("ASSESS_ID", assess_id);
			rd=request.getRequestDispatcher("viewAssessment.jsp");
		}
		
		else
		{
			session.setAttribute("ERR_MSG","unable to create the assessment record");
			rd=request.getRequestDispatcher("createAssessment.jsp");
		}
		rd.forward(request, response);
	}

}
