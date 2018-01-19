package com.san.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.san.domain.User;
import com.san.exception.UserException;
import com.san.service.UserService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService us=new UserService();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try {
			User user=us.login(username,password);
			request.getSession().setAttribute("user",user);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (UserException e) {
			e.printStackTrace();
			request.setAttribute("user_message",e.getMessage());
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
