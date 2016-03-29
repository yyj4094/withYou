package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.MemberDAO;

@WebServlet("/LoginCheckCtrl")
public class LoginCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String id=request.getParameter("m_id");
		String pwd=request.getParameter("m_pw");
		System.out.println("check1>>> id : " + id + " pwd : " + pwd );

		MemberDAO dao = new MemberDAO();
		int result = dao.userCheck(id,pwd);
		System.out.println("check2>>> result : " + result);

		if(result==1){
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("index.jsp?page=welcome");
		}else{
			response.sendRedirect("index.jsp?page=loginfail");
		}		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}