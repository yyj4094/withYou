package review.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.model.reviewDAO;
import review.model.reviewDTO;


@WebServlet(name = "ReviewDeleteCtrl", urlPatterns = { "/ReviewDeleteCtrl" })
public class ReviewDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		reviewDAO dao = new reviewDAO();
		reviewDTO dto = new reviewDTO();
		
		String num = request.getParameter("num");
		
		dto.setR_num(Integer.parseInt(num));
		
		int result = dao.deleteReview(dto);
		
		if(result <=0){
			System.out.println("삭제 실패");
		}
		
		response.sendRedirect("ReviewListCtrl");
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
