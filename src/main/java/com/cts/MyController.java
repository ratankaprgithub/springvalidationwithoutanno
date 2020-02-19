package com.cts;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@Autowired
	MyValidator val;
	
	
	@RequestMapping("/")
	public String sayHello(Model m){
	
		StudentBean st=new StudentBean();
	
		m.addAttribute("student", st);
		
		return "home";
	}
	
	
	@RequestMapping(value="/addstudent")
	public String registerStudent(@ModelAttribute("student")StudentBean student,BindingResult br,Model m){
		
		val.validate(student, br);
		
		if(br.hasErrors()){
			
			return "home";
			
			
		}
		
		m.addAttribute("result", student);
		
		return "sucess";
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	

}
