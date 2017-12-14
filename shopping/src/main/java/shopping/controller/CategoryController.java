package shopping.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import shopping.model.Category;
import shopping.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("categorycrud")
	public ModelAndView categoryhome(@ModelAttribute("command") Category category)
	{	
		return new ModelAndView("categorycrud");
	}
	
	@RequestMapping("saveCategory")
	public ModelAndView saveCategory(Category category)
	{
        categoryService.createorupdate(category);
        return new ModelAndView("redirect:/homeadmin");		
	}
	
	@RequestMapping("addCategory")
	public ModelAndView addCategory(@ModelAttribute("command") Category category, BindingResult result)
	 {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("categories", categoryService.getcategory());	
		return new ModelAndView("categorycrud",model);
     }
	
	@RequestMapping(value = "/deleteCategory", method = RequestMethod.GET)
	public ModelAndView deleteCategory(@ModelAttribute("command") Category category,@RequestParam("categoryCId")Integer cid,
			BindingResult result) {
		categoryService.delete(cid);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("categories",  categoryService.getcategory());
		return new ModelAndView("categorycrud", model);
	}
	
	@RequestMapping(value = "/editCategory", method = RequestMethod.GET)
	public ModelAndView editCategory(@ModelAttribute("command") Category category,@RequestParam("categoryCId")Integer cid, 
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("category",  categoryService.getcategory(cid));
		model.put("categories",  categoryService.getcategory());
		return new ModelAndView("categorycrud", model);
	}
	
	@RequestMapping(value="/categories", method = RequestMethod.GET)
	public List<Category> getCategories() {
		return categoryService.getcategory();
	}
	
	
}
