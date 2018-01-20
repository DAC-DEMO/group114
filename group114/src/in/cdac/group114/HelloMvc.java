package in.cdac.group114;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloMvc {
	
	@GetMapping
	@RequestMapping("/noview")
	public String sayWithoutView() {
		return "Hello World";
	}
	
	
	@GetMapping
	@RequestMapping("/1")
	public ModelAndView sayHello() {
		ModelAndView model = new ModelAndView();
		
		model.setViewName("hello");
		return model;
	}
	
	
	@GetMapping
	@RequestMapping("/2")
	public ModelAndView sayHello2() {
		ModelAndView model = new ModelAndView();
		model.addObject("company", "CDAC");
		
		model.setViewName("hello");
		return model;
	}
	
	
	@GetMapping
	@RequestMapping("/3")
	public ModelAndView sayHello3() {
		ModelAndView model = new ModelAndView();
		model.addObject("company", "CDAC");
		
		List<String> list = new ArrayList<>();
		list.add("SHREEGIT");
		list.add("JATIN");
		list.add("ARSHIYA");
		list.add("SUPRIYA");
		list.add("VIDHI");
		model.addObject("USER_NAME_LIST", list);
		
		model.setViewName("hello");
		return model;
	}
	
	
	
	@GetMapping
	@RequestMapping("/4")
	public ModelAndView sayHello4() {
		ModelAndView model = new ModelAndView();
		model.addObject("company", "CDAC");
		
		List<EmployeePojo> list = new ArrayList<>();
		list.add(new EmployeePojo("1", "SHREEGIT"));
		list.add(new EmployeePojo("2", "JATIN"));
		
		model.addObject("EMP_LIST", list);
		
		model.setViewName("hello");
		return model;
	}
	
	
	
}
