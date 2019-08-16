package com.melvin;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@RequestMapping(path="/studentfornjstl")
	public String showstudentform(Model model) {
		
		return "studentfornjstl";
	}

	@RequestMapping(path="/processStudentForm")
	public String showStudentDetailV2(
			@RequestParam(name="name") String Name,
			@RequestParam(name="lastname") String lastname,
			Model model
			) {
		//String Name=request.getParameter("name");
		//String lastname=request.getParameter("lastname");
		Name=(Name.charAt(0)+"").toUpperCase()+Name.substring(1).toLowerCase();
		lastname=(lastname.charAt(0)+"").toUpperCase()+lastname.substring(1).toLowerCase();
		model.addAttribute("Name", Name);
		model.addAttribute("lastname", lastname);
		return"processStudentForm";
	}
	
	
	
	@RequestMapping(path="/processStudentFormV3")
	public String showStudentDetailV3(
			@Valid @ModelAttribute(name="student") Student student,BindingResult result
			) 
			{
		
		if(result.hasErrors())
			return"studentfornjstl";
		String Name=student.getName();
		String lastname=student.getLastname();
		
		Name=(Name.charAt(0)+"").toUpperCase()+Name.substring(1).toLowerCase();
		lastname=(lastname.charAt(0)+"").toUpperCase()+lastname.substring(1).toLowerCase();
		//model.addAttribute("Name", Name);
		//model.addAttribute("lastname", lastname);
		student.setName(Name);
		student.setLastname(lastname);
		return"processStudentForm";
	}


}
