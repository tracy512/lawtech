

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import feedback.FeedbackEntity;
import feedbackDOA.Feedbackimpl;

/**
 * Servlet implementation class TaskServlet
 */
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String Uname = request.getParameter("Uname");
		String email = request.getParameter("email");
		String meg = request.getParameter("meg");
		String reg = request.getParameter("reg");
				int regarding = 0;
				if (reg != null && !reg.isEmpty()) {
				try {
	        // Parse the string value to an integer
	        regarding = Integer.parseInt(reg);
	    } catch (NumberFormatException e){
	        // Handle the exception or log an error message
	        e.printStackTrace();
	    }
		
		
		String code = request.getParameter("code");
		String rate = request.getParameter("rate");
		int rating = 0;
		if (rate !=null && !rate.isEmpty()) {
		try {
	        // Parse the string value to an integer
	        regarding = Integer.parseInt(rate);
	    } catch (NumberFormatException b){
	    	b.printStackTrace();
	    }
		
		
		FeedbackEntity Fb = new FeedbackEntity();
		Fb.setName(Uname);
		Fb.setEmail(email);
		Fb.setMessage(meg);
		Fb.setRegarding(regarding);
		Fb.setCode(code);
		Fb.setRating(rating);
		
Feedbackimpl Fdoa = new Feedbackimpl();
		
		try {
			Fdoa.insertData(Fb);
		
			response.getWriter().println("Registration successful!");
			

		
		}catch (Exception ex){
			
			 ex.printStackTrace(); 
			    response.getWriter().println("Error: Registration failed.");
		}
		
		
		doGet(request, response);
		
	    
	    }
				}}
}


