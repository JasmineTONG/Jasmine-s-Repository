package service;

import bean.User;

public interface IUserService {

	User login(String userName, String password);

	boolean addUser(String userName, String password);
	
	User findUserByName(String userName);
	
}
