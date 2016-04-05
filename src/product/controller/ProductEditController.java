package product.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.model.ProductDAO;
import product.model.ProductDTO;

@WebServlet("/ProductEditCtrl")
public class ProductEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		ProductDAO dao = new ProductDAO();
		ProductDTO dto = new ProductDTO();
		
		String num = request.getParameter("num");
		
		dto = dao.getProduct(Integer.parseInt(num));
		request.setAttribute("dto", dto);
		RequestDispatcher dis = request.getRequestDispatcher("index.jsp?page1=ProductEdit");
		dis.forward(request, response);
	
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
