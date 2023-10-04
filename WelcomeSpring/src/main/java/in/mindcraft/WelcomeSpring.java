package in.mindcraft;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeSpring {
	
	@RequestMapping("/display")
	public ModelAndView add(HttpServletRequest request , HttpServletResponse response) {
		 String a = request.getParameter("name");
		 
		 System.out.println(a);
		 
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("result.jsp");
		 mv.addObject("name",a);
		 return mv;
		
	}

}
