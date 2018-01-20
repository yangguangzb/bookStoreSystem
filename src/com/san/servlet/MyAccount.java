package com.san.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.san.domain.User;

public class MyAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user=(User)request.getSession().getAttribute("user");
		String path;
		if(user==null){
			path="/login.jsp";
		}else{
			if("admin".equals(user.getRole())){
				path="/admin/login/home.jsp";
			}else{
				path="myAccount.jsp";
			}
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
