package sit.mp.ecrop.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sit.mp.ecrop.entity.User;
import sit.mp.ecrop.service.UserService;

/**
 * Servlet implementation class LoginServlet1
 */
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session=request.getSession(true);
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		//String role=request.getParameter("role");
		
		
		RequestDispatcher rd=null;
		
		String role=UserService.findUser(new User(userName, password));
		
		session.setAttribute("uname", userName);
		
		if("VO".equals(role))
		{
			rd=request.getRequestDispatcher("VOFunctions.jsp");
		}
		else if("GPO".equals(role))
		{
			rd=request.getRequestDispatcher("GPOFunctions.jsp");
		}

		rd.forward(request, response);		
	}

}
