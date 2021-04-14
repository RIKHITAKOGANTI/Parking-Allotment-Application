package Package5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Package1.Login;
import Package2.LoginData;

@WebServlet("/adminlogin")
public class AdminServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	 private AdminLoginData loginDao;
	 public void init() {
	        loginDao = new AdminLoginData();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        AdminLogin loginBean = new AdminLogin();
	        loginBean.setUsername(username);
	        loginBean.setPassword(password);

	        try {
	            if (loginDao.validate(loginBean)) {
	               
	                response.sendRedirect("AdminDuty.jsp");
	            } else {
	               
	                response.sendRedirect("adminlogin.jsp");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
    

}
