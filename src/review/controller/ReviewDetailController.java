package review.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.model.reviewDAO;
import review.model.reviewDTO;
import reviewComment.model.reviewCommentDAO;
import reviewComment.model.reviewCommentDTO;


@WebServlet(name = "ReviewDetailCtrl", urlPatterns = { "/ReviewDetailCtrl" })
public class ReviewDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		reviewDAO dao = new reviewDAO();
		reviewDTO dto = new reviewDTO();
		reviewCommentDTO cdto = new reviewCommentDTO();
		reviewCommentDAO cdao = new reviewCommentDAO();
		String num = request.getParameter("num");
		
		dto = dao.getReview(Integer.parseInt(num));
		request.setAttribute("dto", dto);
		
		ArrayList list = (ArrayList)cdao.getreviewCommentList(Integer.parseInt(num));		
		request.setAttribute("list", list);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("index.jsp?page1=reviewDetail");
		dis.forward(request, response);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
