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

import shopping.model.Supplier;
import shopping.service.SupplierService;

@Controller
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping("supplierCrud")
	public ModelAndView supplierHome(@ModelAttribute("command") Supplier supplier){
		
		return new ModelAndView("supplierCrud");
	}
	
	@RequestMapping("saveSupplier")
	public ModelAndView saveSupplier(Supplier supplier)
	{
        supplierService.createorupdate(supplier);
        
        return new ModelAndView("redirect:/homeadmin");		
	}

	@RequestMapping("addSupplier")
	public ModelAndView addSupplier(@ModelAttribute("command") Supplier supplier, BindingResult result){
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("suppliers", supplierService.getsupplier());
		
		return new ModelAndView("supplierCrud",model);
	}
	@RequestMapping(value = "/deleteSupplier", method = RequestMethod.GET)
	public ModelAndView deletesupplier(@ModelAttribute("command")  Supplier supplier, @RequestParam("supplierId")String id,
			BindingResult result) {
		supplierService.delete(id);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("suppliers",  supplierService.getsupplier());
		return new ModelAndView("supplierCrud", model);
	}
	
	@RequestMapping(value = "/editSupplier", method = RequestMethod.GET)
	public ModelAndView editsupplier(@ModelAttribute("command") Supplier supplier, @RequestParam("supplierId")String id,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("supplier",  supplierService.getSupplier(id));
		model.put("suppliers",  supplierService.getsupplier());
		return new ModelAndView("supplierCrud", model);
	}
	
	@RequestMapping(value="/suppliers", method = RequestMethod.GET)
	public List<Supplier> getsuppliers() {
		return supplierService.getsupplier();
	}
}
