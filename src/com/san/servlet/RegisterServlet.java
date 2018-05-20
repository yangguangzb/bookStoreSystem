package com.san.servlet;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.san.domain.User;
import com.san.exception.UserException;
import com.san.service.UserService;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String inputCode=request.getParameter("inputCode");
		String code=(String) request.getSession().getAttribute("checkcode_session");
		if(!inputCode.equals(code)){
			//输入的验证码不正确
			request.setAttribute("codeMsg","验证码错误");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return ;
		}
		User user=new User();
		try {
			//处理表单数据
			BeanUtils.populate(user,request.getParameterMap());
			//设置激活码
			user.setActiveCode(UUID.randomUUID().toString());
			UserService us=new UserService();
			//调用业务处理
			us.regist(user);
			request.getSession().setAttribute("user",user);
			//注册成功跳转
			request.getRequestDispatcher("registersuccess.jsp").forward(request, response);
		}catch(UserException e){
			//注册异常
			request.setAttribute("user_msg",e.getMessage());
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return ;
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
