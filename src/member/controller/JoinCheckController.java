package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinCheckCtrl")
public class JoinCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String m_id = request.getParameter("j_id");
		String m_pw = request.getParameter("j_pw");
		String m_name = request.getParameter("j_name");
		int m_phone1 = Integer.parseInt(request.getParameter("j_num1"));
		int m_phone2 = Integer.parseInt(request.getParameter("j_num2"));
		int m_phone3 = Integer.parseInt(request.getParameter("j_num3"));
		int m_phone =  m_phone1 + m_phone2 + m_phone3; 
		String m_email = request.getParameter("j_email");
		String m_address = request.getParameter("m_address");

		
		
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
