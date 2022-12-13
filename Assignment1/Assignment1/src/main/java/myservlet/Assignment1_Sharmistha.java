package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class assignment1_Sharmistha
 */
@WebServlet("/Assignment1_Sharmistha")
public class Assignment1_Sharmistha extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException{
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String zipcode = req.getParameter("zipcode");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String[] music = req.getParameterValues("genre");
		
		
		//Validations
		if ( firstname == null || firstname.isEmpty())
			firstname = "  Please refill the form with your firstname";
		if ( lastname == null || lastname.isEmpty())
			lastname = "  Please refill the form with your lastname";
		if ( email == null || email.isEmpty())
			email = "  Please refill the form with your email";
		if ( zipcode == null || zipcode.isEmpty())
			zipcode = "  Please refill the form with your zipcode";
		if ( username == null || username.isEmpty())
			username = "  Please refill the form with your username";
		if ( password == null || password.isEmpty())
			password = "  Please refill the form with your password";
	String musicInterest= "";
		if(music!=null) {
			for (int i = 0; i < music.length; i++) {
				musicInterest+=music[i];
			}
		}
		else musicInterest+="Nothing selected";
		String notification = req.getParameter("notify");
		//notification=(notification.isEmpty()||notification==null)?notification ="Nothing selected":notification;
		if ( notification == null || notification.isEmpty())
			notification = "  Nothing selected";
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel = 'stylesheet' href= '/Assignment1/CSS/assignment1_Sharmistha.css'>");
		out.println("<title>");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Thank you for joining our mailing list</h3>");
		out.println("<h5>Here is the information that you entered</h5>");
		out.println("<h5>FirstName &emsp;&emsp;&emsp;         :" + firstname+"</h5>");
		out.println("<h5>LastName &emsp; &emsp;&emsp;        :" + lastname+"</h5>");
		out.println("<h5>Email &emsp;&emsp;&emsp;&emsp;        :" + email+"</h5>");
		out.println("<h5>ZipCode &emsp;&emsp;&emsp;&emsp;        :" + zipcode+"</h5>");
		out.println("<h5>UserName &emsp; &emsp;&emsp;      :" + username+"</h5>");
		out.println("<h5>Password &emsp;&emsp;&emsp;        :" + password+"</h5>");
		out.println("<h5>Preferred Music  &emsp; &emsp;&emsp;      :" + musicInterest+"</h5>");
		out.println("<h5>Receive special sale notification  &emsp;        :" + notification+"</h5>");
		out.println("</body>");
		out.println("</html>");
	}
	
	public void destroy() {
		System.out.println("Destroy method is called");
	}

}
