package controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import service.IUserService;
import service.ValidateService;
import bean.User;


@Controller
public class loginController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/default/userLogin", method = RequestMethod.GET)
	public String doLogin(String userName, String password, ModelMap model) {

		User u = userService.login(userName, password);
		
		User ru = new User();
		String loginState = "No such user or wrong password.";
		
		if (u != null) {
			ru.setUserName(u.getUserName());
			ru.setPassword("password hidden");
			loginState = "Welcome!";
		} 
		model.addAttribute("user", ru);
		model.addAttribute("loginState", loginState);
		
		return "goodLogin";
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
}
