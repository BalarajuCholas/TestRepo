package sit.mp.ecrop.service;

import sit.mp.ecrop.db.UserDAO;
import sit.mp.ecrop.entity.User;

public class UserService {
	
	public static String findUser(User u)
	{
		UserDAO dao=new UserDAO();
		return dao.findUser(u);
	}

}
