package shopping.model;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import shopping.model.User;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FormValidator implements Validator {

	private Matcher matcher;
	private Pattern pattern;
	
	 private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"  
			   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	 
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

		User user= (User) target;
		
		if (!(user.getEmail() != null && user.getEmail().isEmpty())) 
		{  
			pattern = Pattern.compile(EMAIL_PATTERN);  
			matcher = pattern.matcher(user.getEmail());  
			if (!matcher.matches())
			  {  
				errors.rejectValue("email",null,"Enter a correct email");  
			  }  
		}	
		
		}
}