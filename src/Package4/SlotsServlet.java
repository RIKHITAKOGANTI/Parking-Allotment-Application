package Package4;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list")
public class SlotsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SlotsServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SlotsData dao = new SlotsData();
 
        try {
 
            List<Slots> listCatagory = dao.list();
            request.setAttribute("listCategory", listCatagory);
            
            String st=request.getParameter("stime");    
            String et=request.getParameter("etime");    
            String vn=request.getParameter("vehnum"); 
            String du=request.getParameter("duration"); 
              
            HttpSession session=request.getSession();  
            session.setAttribute("starttime",st);
            session.setAttribute("endtime",et);
            session.setAttribute("vehnum",vn);
            session.setAttribute("duration",du);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("Slots.jsp");
            dispatcher.forward(request, response);
 
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }

	

}
