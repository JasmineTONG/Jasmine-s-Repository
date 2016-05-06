package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bean.User;
import service.IUserService;

@Controller
public class registerController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/default/userRegister", method = RequestMethod.GET)
	public String doRegister(String userName, String password, ModelMap model) {

		boolean registerFlag = userService.addUser(userName, password);
		
		User ru = new User();
		String regState = "Registration fails: same username already exist.";
		
		if (registerFlag) {
			ru = userService.findUserByName(userName);
			ru.setPassword("password hidden");
			regState = "Registration done.";
		}  
		model.addAttribute("user", ru);
		//System.out.println("*** "+ru.getUserName());
		model.addAttribute("regState", regState);
		
		return "goodRegister";
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
