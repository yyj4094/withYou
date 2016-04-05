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

@WebServlet("/ProductInsertCtrl")
public class ProductInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		ProductDAO dao = new ProductDAO();
		ProductDTO dto = new ProductDTO();
		
		dto.setP_name(request.getParameter("p_title"));
		dto.setP_price(Integer.parseInt(request.getParameter("p_price")));
		dto.setP_contents(request.getParameter("p_contents"));
		dto.setP_quantity(Integer.parseInt(request.getParameter("p_quantity")));
		dto.setP_color(request.getParameter("p_color"));
				
		int result = dao.ProductInsert(dto);
		
		
		RequestDispatcher dis = getServletContext().getRequestDispatcher("/ProductListCtrl");
		dis.forward(request, response);		

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
