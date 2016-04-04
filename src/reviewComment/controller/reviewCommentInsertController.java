package reviewComment.controller;

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
import reviewComment.model.reviewCommentDAO;
import reviewComment.model.reviewCommentDTO;


@WebServlet(name = "reviewCommentInsertCtrl", urlPatterns = { "/reviewCommentInsertCtrl" })
public class reviewCommentInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		reviewCommentDAO dao = new reviewCommentDAO();
		reviewCommentDTO dto = new reviewCommentDTO();
		
		String num = request.getParameter("num");
		
		dto.setCm_num(Integer.parseInt(num));
		dto.setRc_name(request.getParameter("rc_name"));
		dto.setRc_contents(request.getParameter("rc_contents"));

		int result = dao.insertreviewComment(dto);
		if(result==1){
			System.out.println("insert succeed");
		}else{
			System.out.println("insert failed");	
		}
		
		response.sendRedirect("ReviewDetailCtrl?num="+num);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
