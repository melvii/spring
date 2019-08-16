package com.melvin;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/customer")
public class CustomerController {

	
	@RequestMapping(path="/customerForm")
	public String showCustomeForm(Model model) {
		
		
		Customer customer =new Customer();
		model.addAttribute("customer", customer);
		return "customerForm";
		}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping(path="/processForm")
	public String processForm(
		@Valid	@ModelAttribute(name="customer") Customer customer,
		BindingResult bindingresult)
	{
		
		if(bindingresult.hasErrors()) {
			return"customerForm";
		}
		return"customerDetails";
	}
}
