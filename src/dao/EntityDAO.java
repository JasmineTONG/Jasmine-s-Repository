package dao;

import bean.User;

import java.util.HashMap;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class EntityDAO {
	public static EntityDAO instance;

    public static EntityDAO getInstance() {
        if (instance == null) instance = new EntityDAO();
        return instance;
    }
    
    private HashMap<String, User> storage = new HashMap<String, User>();

    public User findUser(String userName) {
    	if (storage.containsKey(userName)) {
    		return storage.get(userName);
    	}
    	return null;
    }
    
    public void save(String userName, String password) {
    	User u = new User();
    	u.setUserName(userName);
    	u.setPassword(password);
    	storage.put(userName, u);
    }
    
    public boolean isExist(String userName) {
    	if (storage.containsKey(userName)) return true;
    	else return false;
    }
    
    public User validateUser(String userName, String password) {
    	if (storage.containsKey(userName)) {
    		User u = storage.get(userName);
    		if (u.getPassword().equals(password)) return u;
    		else return null;
    	}
    	return null;
    }
    
}