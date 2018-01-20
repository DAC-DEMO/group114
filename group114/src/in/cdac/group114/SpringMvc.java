package in.cdac.group114;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/module1")
public class SpringMvc {

	@GetMapping
	@RequestMapping("/1")
	public ModelAndView hie() {
		ModelAndView model = new ModelAndView();
		
		model.setViewName("hello");
		return model;
	}
	
	
	@GetMapping
	@RequestMapping("/read")
	public ModelAndView hie(HttpServletRequest request) {
		String name = request.getParameter("name");
		
		ModelAndView model = new ModelAndView();
		model.addObject("name", name);
		
		model.setViewName("hello");
		return model;
	}
	
}
