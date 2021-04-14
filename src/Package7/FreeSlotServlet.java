package Package7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/realese")
public class FreeSlotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private FreeSlotData free;
	
	 public void init() 
	 {
	        free = new FreeSlotData();
	 }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			    	PrintWriter out = response.getWriter();
			        String slotid  = request.getParameter("slotid");
			        
			        FreeSlot conf = new FreeSlot();
			        conf.setSlotid(slotid);
			        
			        try {
			            free.freeSlot(conf);
			        } catch (Exception e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
			        out.println("<html><head></head><body onload=\"alert('Slot Is Set Free')\"></body></html>");

			    }

    

	
	
}
