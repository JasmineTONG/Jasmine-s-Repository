package service.impl;

import java.util.ArrayList;
import java.util.List;

import bean.User;
import dao.EntityDAO;
import exception.LoginFailException;
import exception.RepeatException;
import service.IUserService;

@SuppressWarnings("unchecked")
public class UserServiceImpl implements IUserService {
	private EntityDAO entityDAO;

	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@Override
	public User login(String userName, String password) {
		// TODO Auto-generated method stub
		User u = (User) entityDAO.findUser(userName);
		return u;
	}

	public boolean addUser(String userName, String password) {
		if (entityDAO.isExist(userName)) {
			//System.out.println("--- entity exist, registration fails---");
			return false;
		}
		entityDAO.save(userName, password);
		return true;
	}
	
	public User findUserByName(String userName) {
		User u = (User)entityDAO.findUser(userName);
		return u;
	}

	
}
