package com.san.service;
import java.sql.SQLException;
import com.san.dao.UserDao;
import com.san.domain.User;

public class UserService {
	UserDao ud=new UserDao();
	public void regist(User user) throws SQLException {
		ud.addUser(user);
	}
	
}
