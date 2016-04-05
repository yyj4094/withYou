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

@WebServlet("/ProductDoneEditCtrl")
public class ProductDoneEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		ProductDTO dto = new ProductDTO();
		ProductDAO dao = new ProductDAO();
	
		String num = request.getParameter("num");
		
		dto.setP_name(request.getParameter("p_title"));
		dto.setP_contents(request.getParameter("p_contents"));
		dto.setP_price(Integer.parseInt(request.getParameter("p_price")));
		dto.setP_quantity(Integer.parseInt(request.getParameter("p_quantity")));
		dto.setP_color(request.getParameter("p_color"));
		dto.setP_num(Integer.parseInt(request.getParameter("num")));
		
		int result = dao.editProduct(dto);
		
		RequestDispatcher dis = request.getRequestDispatcher("ProductDetailCtrl?num="+num);
		dis.forward(request, response);

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
