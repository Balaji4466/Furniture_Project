package shopping.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import shopping.service.ProductService;

@Controller
public class AdminController {

	@Autowired
	ProductService productService; 
	
	@RequestMapping(value = ("/kitchen"), method = RequestMethod.GET)
	public ModelAndView kitchen(ModelMap model, Principal principal) 
	{
		String name = principal.getName();
		model.addAttribute("user", name);
		Map<String, Object> modell = new HashMap<String, Object>();
		Gson gson = new Gson();
		String temp = gson.toJson(productService.getproduct());
		model.put("productList", temp);
		return new ModelAndView("kitchen", modell);
	}
	
	@RequestMapping(value = ("/hall"), method = RequestMethod.GET)
	public ModelAndView hall(ModelMap model, Principal principal) 
	{
		String name = principal.getName();
		model.addAttribute("user", name);
		Map<String, Object> modell = new HashMap<String, Object>();
		Gson gson = new Gson();
		String temp = gson.toJson(productService.getproduct());
		model.put("productList", temp);
		return new ModelAndView("hall", modell);
	}
	
	@RequestMapping(value = ("/bar"), method = RequestMethod.GET)
	public ModelAndView bar(ModelMap model, Principal principal) 
	{
		String name = principal.getName();
		model.addAttribute("user", name);
		Map<String, Object> modell = new HashMap<String, Object>();
		Gson gson = new Gson();
		String temp = gson.toJson(productService.getproduct());
		model.put("productList", temp);
		return new ModelAndView("bar", modell);
	}
	
	
}
