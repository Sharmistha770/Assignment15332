package assignment4;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class Controller extends HttpServlet {
     
	Dao dao;
	String username;
	String pass;
	
	public void init() {
		dao = new Dao();
	}
    public Controller() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String password = request.getParameter("password");		
		Model user = new Model();

		user.setUsername(name);
		user.setPassword(password);		
		try {			
			String ulogin= dao.login(user);			
			if(ulogin.equals("True")) 
	             response.sendRedirect("success.jsp");
	         else
	             response.sendRedirect("error.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}

}