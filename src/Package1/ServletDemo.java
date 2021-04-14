package Package1;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Package2.LoginData;

@WebServlet("/login")

public class ServletDemo extends HttpServlet{
	 private static final long serialVersionUID = 1L;
	    private LoginData loginDao;

	    public void init() {
	        loginDao = new LoginData();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        Login loginBean = new Login();
	        loginBean.setUsername(username);
	        loginBean.setPassword(password);

	        try {
	            if (loginDao.validate(loginBean)) {
	               
	                response.sendRedirect("Timings.jsp");
	            } else {
	               
	                response.sendRedirect("login.jsp");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

}
