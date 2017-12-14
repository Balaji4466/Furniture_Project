package shopping.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import shopping.dao.CartDAO;
import shopping.dao.CartItemDAO;
import shopping.dao.ProductDAO;
import shopping.dao.UserDAO;
import shopping.model.Cart;
import shopping.model.CartItem;
import shopping.model.Product;
import shopping.model.User;

@Controller
public class CartController {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private CartItemDAO cartItemDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CartDAO cartDAO;
	
	@RequestMapping(value = ("/addtocart"), method = RequestMethod.GET)
	public ModelAndView addtocart(@ModelAttribute("command")
	              @RequestParam("productPid") Integer pid,Principal principal)
	{
		User user= userDAO.getuser(principal.getName());
		Cart cart= user.getCart();
		Product product = productDAO.getproduct(pid);
		List<CartItem>cartItems= cart.getCartItem();
		boolean flag=false;
		
		  for (int i=0; i<cartItems.size(); i++)
		  {
	          if(product.getPid().equals(cartItems.get(i).getProduct().getPid()))
	          {
	        	   flag=true;
	                CartItem cartItem = cartItems.get(i);
	                cartItem.setName(product.getPname());
	                cartItem.setPrice(product.getPrice());
	                cartItem.setQuantity(cartItem.getQuantity()+1);
	                cartItem.setTotalprice(product.getPrice() * cartItem.getQuantity());
	                cartItemDAO.addCart(cartItem);
	          }
	      }
		
		if(flag==false){
		  CartItem cartItem = new CartItem();
	      cartItem.setProduct(product);
	      cartItem.setName(product.getPname());
	      cartItem.setPrice(product.getPrice());
	      cartItem.setQuantity(1);
	      cartItem.setTotalprice(product.getPrice()*cartItem.getQuantity());
	      cartItem.setCart(cart);
	      cartItemDAO.addCart(cartItem);
		}
		
	      Map<String, Object> model = new HashMap<String, Object>();
	      model.put("cartitemlist",cart.getCartItem());
	      return new ModelAndView("redirect:/cart",model);
	}
	
	@RequestMapping(value="/cartitemlist", method = RequestMethod.GET)
	public List<CartItem> getCartitem() {
		return cartItemDAO.list();
	}

	
	@RequestMapping(value=("/cart"), method = RequestMethod.GET)
	public ModelAndView cart(@ModelAttribute("command") CartItem cartItem,Principal principal)
	{
		User user= userDAO.getuser(principal.getName());
		Cart cart= user.getCart();
		List<CartItem>cartItems= cart.getCartItem();
		 Map<String, Object> model = new HashMap<String, Object>();
	      model.put("cartitemlist",cartItems);
		return new ModelAndView("Cart",model);
	}
	
	@RequestMapping(value=("/deletecartitem"), method = RequestMethod.GET)
    public ModelAndView deletecartitem(@ModelAttribute("command")
			@RequestParam("cartitemid") Integer Ciid, Principal principal)
    {
		
		cartItemDAO.removeCart(Ciid);
		User user= userDAO.getuser(principal.getName());
		Cart cart= user.getCart();
		List<CartItem>cartItems= cart.getCartItem();
		 Map<String, Object> model = new HashMap<String, Object>();
	      model.put("cartitemlist",cartItems);
		return new ModelAndView("Cart",model);
    }
	
	@RequestMapping(value=("/emptycart"), method = RequestMethod.GET)
    public ModelAndView emptycart(Principal principal)
    {
		
		User user= userDAO.getuser(principal.getName());
		Cart cart= user.getCart();
		List<CartItem>cartItems= cart.getCartItem();
		cartItemDAO.removeAllCart(cartItems);
		 Map<String, Object> model = new HashMap<String, Object>();
	      model.put("cartitemlist",cartItems);
		return new ModelAndView("redirect:/cart",model);
    }
	
	
	@RequestMapping(value=("/editquantity"), method = RequestMethod.GET)
    public ModelAndView editquantity(@ModelAttribute("command")
			@RequestParam("cartitemid") Integer Ciid, Principal principal)
    {
		int num;
		User user= userDAO.getuser(principal.getName());
		Cart cart= user.getCart();
		CartItem cartitem=cartItemDAO.getcartitem(Ciid);
		num = cartitem.getQuantity();
		if(num>1)
		{
		cartitem.setQuantity(cartitem.getQuantity()-1);
		double tp=cartitem.getTotalprice();
		cartitem.setTotalprice(tp - cartitem.getProduct().getPrice());
		cartItemDAO.addCart(cartitem);
		Map<String, Object> model = new HashMap<String, Object>();
	    model.put("cartitemlist",cart.getCartItem());
	    return new ModelAndView("redirect:/cart",model);
		}
		else
		{
			Map<String, Object> model = new HashMap<String, Object>();
		    model.put("cartitemlist",cart.getCartItem());
			return new ModelAndView("redirect:/cart",model);
		}
    }
	
	@RequestMapping(value=("/addquantity"), method = RequestMethod.GET)
    public ModelAndView addquantity(@ModelAttribute("command")
			@RequestParam("cartitemid") Integer Ciid, Principal principal)
    {
		User user= userDAO.getuser(principal.getName());
		Cart cart= user.getCart();
		CartItem cartitem=cartItemDAO.getcartitem(Ciid);
		cartitem.setQuantity(cartitem.getQuantity()+1);
		cartitem.setTotalprice(cartitem.getProduct().getPrice() * cartitem.getQuantity());
		cartItemDAO.addCart(cartitem);
		Map<String, Object> model = new HashMap<String, Object>();
	    model.put("cartitemlist",cart.getCartItem());
	    return new ModelAndView("redirect:/cart",model);
    }
	
	
	@RequestMapping(value="/shipping",method = RequestMethod.GET)
	public ModelAndView payment(ModelMap model,Principal principal)
	{
		double tp = 0;
		String name = principal.getName();
		  model.addAttribute("user", name);
		User user= userDAO.getuser(principal.getName());
		Cart cart= user.getCart();
		List<CartItem>cartItems= cart.getCartItem();
		
		int s=cartItems.size();
		for(int i=0;i<s;i++)
		{
			tp=tp+cartItems.get(i).getTotalprice();
		}
		 Map<String, Object> modell = new HashMap<String, Object>();
		 modell.put("totalprice", tp); 
		 modell.put("userlist",user);
	      modell.put("cartitemlist",cartItems);
		return new ModelAndView("shipping",modell);
	}
}
