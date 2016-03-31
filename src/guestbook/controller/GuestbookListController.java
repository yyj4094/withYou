package guestbook.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.model.GuestbookDAO;


@WebServlet(name = "GuestbookListCtrl", urlPatterns = { "/GuestbookListCtrl" })
public class GuestbookListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		GuestbookDAO dao = new GuestbookDAO();
		ArrayList list = (ArrayList)dao.getGuestbookList();
		request.setAttribute("list", list);
		
		RequestDispatcher dis = request.getRequestDispatcher("/index.jsp?page1=guestbookView");
		dis.forward(request, response);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
