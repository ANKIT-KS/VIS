

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.CustomerBO;

/**
 * Servlet implementation class VehicleRegistrationServlet
 */
@WebServlet("/VehicleRegistrationServlet")
public class VehicleRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String state = request.getParameter("state");
		String v_type = request.getParameter("type");
		String manufacturer = request.getParameter("manufacturer");
		String model = request.getParameter("model");
		int engine_number = Integer.parseInt(request.getParameter("engine"));
		String yom = request.getParameter("yom");
		String location = request.getParameter("location");
		int price = Integer.parseInt(request.getParameter("price"));
		String dop = request.getParameter("dop");
		
		
		if(name.isEmpty()||v_type.isEmpty()||manufacturer.isEmpty()||model.isEmpty()||state.isEmpty()||yom.isEmpty()||location.isEmpty()||dop.isEmpty());
		{
			RequestDispatcher rd = request.getRequestDispatcher("vehicleregistration.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		}
		
		{
			VehicleBO vehicleBO=new VehicleBO();
			boolean x= vehicleBO.register(engine_number,name,state,manufacturer,model,yom,location,price,dop);
			if(x){
			
			RequestDispatcher rd = request.getRequestDispatcher("vehicle_registered.jsp");
			out.println("<font color=red>Vehicle Registered successfully</font>");
			
			rd.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
