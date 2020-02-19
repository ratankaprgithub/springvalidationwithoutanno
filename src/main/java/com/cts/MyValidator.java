package com.cts;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class MyValidator implements Validator {

	public boolean supports(Class cls) {
		
		return StudentBean.class.isAssignableFrom(cls);
		
		
	}

	public void validate(Object target, Errors err) {
		
		
		StudentBean student=(StudentBean)target;
		
		
		if(student.getRoll()<100){
			
			err.rejectValue("roll","roll.invalid",new Object[]{"100","200"},"Roll number should be greater than 100");
		}
		
		if(student.getName().equals("")){
			err.rejectValue("name","name.invalid","Name is mandatory..");
		}
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
