package in.cdac.group114;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
public class AjaxMvc {
	
	@GetMapping
	@RequestMapping("/1")
	public Map<String, String> ajaxDemo(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("Hie", "Hie");
		
		return map;
	}
	
	@GetMapping
	@RequestMapping("/2")
	public List<String> ajaxDemo2(){
		List<String> list = new ArrayList<String>();
		list.add("Hie");
		
		return list;
	}
	
	
	@GetMapping
	@RequestMapping("/3")
	public EmployeePojo ajaxDemo3(){
		EmployeePojo emp = new EmployeePojo();
		emp.setName("Hie");
		
		return emp;
	}
	
	@GetMapping
	@RequestMapping("/4")
	public List<EmployeePojo> ajaxDemo4(){
		List<EmployeePojo> list = new ArrayList<>();
		
		EmployeePojo emp = new EmployeePojo();
		emp.setName("Hie");
		
		list.add(emp);
		
		return list;
	}
}
