package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.MemberDAO;
import member.model.MemberDTO;

@WebServlet("/JoinCheckCtrl")
public class JoinCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		int m_phone1 = Integer.parseInt(request.getParameter("j_num1"));
		int m_phone2 = Integer.parseInt(request.getParameter("j_num2"));
		int m_phone3 = Integer.parseInt(request.getParameter("j_num3"));
		int m_phone = m_phone1 + m_phone2 + m_phone3;
		
		MemberDTO dto = new MemberDTO();
		
		dto.setM_id(request.getParameter("j_id"));
		dto.setM_pw(request.getParameter("j_pw"));
		dto.setM_name(request.getParameter("j_name"));
		dto.setM_phone(m_phone);
		dto.setM_email(request.getParameter("j_mail"));
		dto.setM_address(request.getParameter("j_addr"));
		
		MemberDAO dao = new MemberDAO();
		dao.userInsert(dto);
		System.out.println("check>>> Done");
		
		response.sendRedirect("index.jsp?page=welcome");	
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
