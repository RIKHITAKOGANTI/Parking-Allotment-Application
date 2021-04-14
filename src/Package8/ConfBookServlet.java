package Package8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/book")
public class ConfBookServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private ConfBookData confbook;
	
	 public void init() {
	        confbook = new ConfBookData();
	    }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			    	PrintWriter out = response.getWriter();
			        String slotid  = request.getParameter("category");
			        String stime = request.getParameter("stime");
			        String etime = request.getParameter("etime");
			        String duration = request.getParameter("duration");
			        String vehnum = request.getParameter("vehnum");
			        
			        ConfBook conf = new ConfBook();
			        conf.setSlotid(slotid);
			        conf.setStime(stime);
			        conf.setEtime(etime);
			        conf.setDuration(duration);
			        conf.setVehnum(vehnum);
			        
			        try {
			            confbook.registerEmployee(conf);
			        } catch (Exception e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
			        out.println("<html><head></head><body onload=\"alert('Slot Booking  Successfull')\"></body></html>");
			        response.sendRedirect("confirm.jsp");

			    }

       
    
}
