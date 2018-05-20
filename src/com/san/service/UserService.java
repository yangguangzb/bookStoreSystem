package com.san.service;
import java.sql.SQLException;
import com.san.dao.UserDao;
import com.san.domain.User;
import com.san.exception.UserException;
import com.san.util.SendJMail;

public class UserService {
	UserDao ud=new UserDao();
	SendJMail sjm=new SendJMail();
	public void regist(User user) throws UserException {
		try {
			ud.addUser(user);
			//发送邮箱激活码
			sjm.sendMail(user.getEmail(), "请<a href='www.bookStore.com/activerUserServlet?actionCode="+user.getActiveCode()+"'>激活</a>后登陆", "网上书店激活");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException("注册失败");
		}
	}
	//用户激活码
	public void activerUser(String actionCode) throws UserException {
		User user;
		try {
			user = ud.findUserByactionCode(actionCode);
			if(user!=null){
				//激活码存在
				ud.activeUser(actionCode);
				return ;
			}
			throw new UserException("激活失败");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException("激活失败");
		}
	}
	//用户登录
	public User login(String username, String password) throws UserException {
		User user;
		try {
			user=ud.findUserByUserNameAndPassword(username, password);
			if(user==null){
				throw new UserException("用户名或密码错误");
			}
			if(user.getState()==0){
				throw new UserException("用户未激活");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException("用户名或密码错误");
		}
		return user;
	}
}
