package product.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ProductDAO {

	private Connection cn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	private String sql;
	private DataSource DS;
	
	public ProductDAO(){
		try{
			Context init = new InitialContext();
			DS=(DataSource)init.lookup("java:comp/env/jdbc/sch");
			System.out.println("DB access ");
		}catch(NamingException e){
			System.out.println("DB access failed");
			e.printStackTrace();
			return;
		}
	}

	public ArrayList getProductList() {
		List<ProductDTO> productlist = new ArrayList<ProductDTO>();	
		System.out.println("chcek>>> 리스트컬렉션호출");
		try {
			sql = "select * from product_table order by p_num";
			cn=DS.getConnection(); 
			st=cn.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()){
				ProductDTO dto = new ProductDTO();
				dto.setP_num(rs.getInt("p_num"));
				dto.setP_name(rs.getString("p_name"));
				dto.setP_contents(rs.getString("p_contents"));
				dto.setP_price(rs.getInt("p_price"));
				dto.setP_quantity(rs.getInt("p_quantity"));
				dto.setP_color(rs.getString("p_color"));
				
				productlist.add(dto);				
			}
			System.out.println("list에 저장완료");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("list에 저장실패");
		}
		return (ArrayList) productlist;
	}

	public int ProductList(ProductDTO dto) {
		int result = 0;
		try {
			sql = "insert into product_table values(seq_review_r_num.nextval,?,?,?,?,?)";
			cn = DS.getConnection();
			pst = cn.prepareStatement(sql);
			pst.setString(1, dto.getP_name());
			pst.setInt(2, dto.getP_price());
			pst.setString(3, dto.getP_contents());
			pst.setInt(4,dto.getP_quantity());
			pst.setString(5, dto.getP_color());
			
			result = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}


	
}
