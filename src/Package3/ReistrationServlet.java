package Package3;
import java.io.IOException;
import java.io.PrintWriter;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class ReistrationServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
    private RegisterData employeeDao;

    public void init() {
        employeeDao = new RegisterData();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String vehiclenumber = request.getParameter("vehiclenumber");
        String contact = request.getParameter("contact");
        
        Registration employee = new Registration();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setContact(contact);
        employee.setVehiclenumber(vehiclenumber);

        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        out.println("<html><head></head><body onload=\"alert('Registration Successfull')\"></body></html>");
        response.sendRedirect("index.jsp");
    }

}
