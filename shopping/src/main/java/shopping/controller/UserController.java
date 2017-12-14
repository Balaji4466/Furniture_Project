package shopping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import shopping.model.FormValidator;
import shopping.model.User;
import shopping.service.UserService;

@Controller
public class UserController {

	@Autowired
	public  UserService userService;

	@RequestMapping(value="signup",method = RequestMethod.GET)
	public ModelAndView user(@ModelAttribute("command")User user)
	{
		return new ModelAndView("registration");
	}

	@RequestMapping(value="saveUser")
	public ModelAndView saveUser(@Valid @ModelAttribute("command") User user,BindingResult result)
	{	
		new FormValidator().validate(user,result);
		
		
	    if(result.hasErrors()) 
	    {
	    	return new ModelAndView("registration");
	    }
	    
	    userService.save(user);
	    return new ModelAndView("redirect:/index");
	}

}
