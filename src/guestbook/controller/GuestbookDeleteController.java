package guestbook.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.model.GuestbookDAO;
import guestbook.model.GuestbookDTO;


@WebServlet(name = "GuestbookDeleteCtrl", urlPatterns = { "/GuestbookDeleteCtrl" })
public class GuestbookDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		GuestbookDAO dao = new GuestbookDAO();
		GuestbookDTO dto = new GuestbookDTO();
	
		dto.setG_num(Integer.parseInt(request.getParameter("num")));
		
		int result = dao.deleteGBcomment(dto);
		
		response.sendRedirect("GuestbookListCtrl");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
