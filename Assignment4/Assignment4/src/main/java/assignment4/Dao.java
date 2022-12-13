package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {

	public String login(Model user) throws ClassNotFoundException {	
		Connection con;
		ResultSet rs = null;
		String name = user.getUsername();
		String password = user.getPassword();

		String username="";
		String pass="";		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/W11";
			String username="root";
			String password = "12345";
			con = DriverManager.getConnection(url, username, password);		
	
    		Statement st = con.createStatement();   		
    		
    		String sql= "select * from USER";
    		rs = st.executeQuery(sql);   
		
    		while(rs.next()) 
            {
             username= rs.getString("Username");
             pass = rs.getString("Password");
              if(name.equals(username) && password.equals(pass))
              {
                 return "True";
              }
            }			
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return "False";		
	}
}
