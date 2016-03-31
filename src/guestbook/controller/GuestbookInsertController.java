package guestbook.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.ha.backend.Sender;

import guestbook.model.GuestbookDAO;
import guestbook.model.GuestbookDTO;


@WebServlet(name = "GuestbookInsertCtrl", urlPatterns = { "/GuestbookInsertCtrl" })
public class GuestbookInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		GuestbookDAO dao = new GuestbookDAO();
		GuestbookDTO dto = new GuestbookDTO();

		dto.setG_name(request.getParameter("g_name"));
		dto.setG_pw(request.getParameter("g_pw"));
		dto.setG_contents(request.getParameter("g_contents"));

		int result = dao.insertGuestbook(dto);
		if(result==1){
			System.out.println("insert succeed");
		}else{
			System.out.println("insert failed");	
		}
		
		response.sendRedirect("GuestbookListCtrl");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
