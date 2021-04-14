package Package10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Package8.ConfBook;
import Package8.ConfBookData;

/**
 * Servlet implementation class WaitinglistServlet
 */
@WebServlet("/waiting")
public class WaitinglistServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private WaitinglistData wait;
	
	 public void init() {
	        wait = new WaitinglistData();
	    }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			    	PrintWriter out = response.getWriter();
			        String slotid  = request.getParameter("slotid");
			        String vehnum = request.getParameter("vehnum");
			        String email = request.getParameter("email");
			        
			        
			        Waitinglist conf = new Waitinglist();
			        conf.setSlotid(slotid);
			        conf.setEmail(email);
			        conf.setVehnum(vehnum);
			        
			        try {
			            wait.registerEmployee(conf);
			        } catch (Exception e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
			        out.println("<html><head></head><body onload=\"alert('Request Added You Will Be Notified When Slot Is Free')\"></body></html>");

			    }

      
       
   

}
