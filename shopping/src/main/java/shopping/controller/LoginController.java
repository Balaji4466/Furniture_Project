package shopping.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("login")
	public ModelAndView login()
	{
		return new ModelAndView("login");
	}
	
	@RequestMapping(value=("/homeuser"), method = RequestMethod.GET)
	public ModelAndView homeuser(ModelMap model, Principal principal)
	{
		  String name = principal.getName();
		  model.addAttribute("user", name);
		  return new ModelAndView("homeuser");
	}
	
	@RequestMapping(value=("/homeadmin"),method= RequestMethod.GET)
	public ModelAndView homeadmin(ModelMap model,Principal principal)
	{
		String name= principal.getName();
		model.addAttribute("admin",name);
		return new ModelAndView("homeadmin");
	}
	
	@RequestMapping("accessdenied")
	public ModelAndView accessdenied()
	{
		return new ModelAndView("accessdenied");
	}
	
	@RequestMapping("logout")
	  public ModelAndView logout(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
	    return new ModelAndView("redirect:/login");
	}
}
