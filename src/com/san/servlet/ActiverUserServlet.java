package com.san.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.san.exception.UserException;
import com.san.service.UserService;

public class ActiverUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService us=new UserService();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取激活码
		String actionCode=request.getParameter("actionCode");
		try {
			us.activerUser(actionCode);
		} catch (UserException e) {
			e.printStackTrace();
			response.getWriter().write(e.getMessage());
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
