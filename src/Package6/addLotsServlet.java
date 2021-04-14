package Package6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lots")
public class addLotsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private addLotsData addLots;
       
	 public void init() {
	        addLots = new addLotsData();
	 }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			    	PrintWriter out = response.getWriter();
			        String slotname = request.getParameter("sname");
			        String status = request.getParameter("status");
			        
			       addLots lots = new addLots();
			        lots.setSlotname(slotname);
			        lots.setStatus(status);
			        
			        try {
			            addLots.validateSlots(lots);
			        } catch (Exception e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
			        out.println("<html><head></head><body onload=\"alert('Lots Added')\"></body></html>");
			        response.sendRedirect("AdminDuty.jsp");
			    }
}
