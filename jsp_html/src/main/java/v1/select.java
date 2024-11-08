package v1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class select
 */
@WebServlet("/select")
public class select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public select() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		String s=request.getParameter("n");
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root","Venky@256"); 	
            PreparedStatement ps=con.prepareStatement("select * from "+s);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
    			String Emp_id=rs.getString(1);
    			String Emp_Name=rs.getString(2);
    			String Emp_salary=rs.getString(3);
    		    pw.println(Emp_id+" "+Emp_Name+" "+Emp_salary);
            } 
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
