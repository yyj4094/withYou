package reviewComment.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.model.GuestbookDAO;
import guestbook.model.GuestbookDTO;
import reviewComment.model.reviewCommentDAO;
import reviewComment.model.reviewCommentDTO;


@WebServlet(name = "reviewCommentDeleteCtrl", urlPatterns = { "/reviewCommentDeleteCtrl" })
public class reviewCommentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		reviewCommentDAO dao = new reviewCommentDAO();
		reviewCommentDTO dto = new reviewCommentDTO();
		
		String num = request.getParameter("num");
		String rnum = request.getParameter("r_num");
				
		dto.setRc_num(Integer.parseInt(num));
		
		int result = dao.deletereviewComment(dto);
		
		response.sendRedirect("ReviewDetailCtrl?num="+rnum);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
