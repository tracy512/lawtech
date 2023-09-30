package task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import feedbackDOA.Feedbackimpl;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
		
	}
	@RequestMapping("/feedback.html")
	public String feedback() {
		return "feedback.jsp";	
		}
	
	@RequestMapping("/TaskServlet")
	public String addFeedback() {
		
		return "welcome.jsp";
	}

}
