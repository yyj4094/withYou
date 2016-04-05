package review.model;

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

import reviewComment.model.reviewCommentDTO;

public class reviewDAO {
	
	private Connection cn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	private String sql;
	private DataSource DS;
	
	public reviewDAO(){
		try{
			Context init = new InitialContext();
			DS=(DataSource)init.lookup("java:comp/env/jdbc/sch");
			System.out.println("DB접속 성공");
		}catch(NamingException e){
			System.out.println("DB접속 실패");
			e.printStackTrace();
			return;
		}
	}
	
	public List<reviewDTO> getReviewList() {
		List<reviewDTO> reviewlist = new ArrayList<reviewDTO>();	
		System.out.println("chcek>>> 리스트컬렉션호출");
		try {
			sql = "select * from review_table order by r_num";
			cn=DS.getConnection(); 
			st=cn.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()){
				reviewDTO dto = new reviewDTO();
				dto.setR_num(rs.getInt("r_num"));
				dto.setR_title(rs.getString("r_title"));
				dto.setR_name(rs.getString("r_name"));
				dto.setR_date(rs.getDate("r_date"));
				dto.setR_contents(rs.getString("r_contents"));
				
				reviewlist.add(dto);				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return reviewlist;
	}

	public int insertReview(reviewDTO dto) {
		int result = 0;
		try {
			sql = "insert into review_table values(seq_review_r_num.nextval,?,?,?,sysdate)";
			cn = DS.getConnection();
			pst = cn.prepareStatement(sql);
			pst.setString(1, dto.getR_title());
			pst.setString(2, dto.getR_name());
			pst.setString(3, dto.getR_contents());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public reviewDTO getReview(int num) {
		reviewDTO dto = null;
		try {
			sql = "select * from review_table where r_num=?";
			cn = DS.getConnection();
			pst = cn.prepareStatement(sql);
			pst.setInt(1, num); //getReview에서  num값을 받아옴.
			rs = pst.executeQuery();
			
			if(rs.next()){
				dto = new reviewDTO();
				dto.setR_num(rs.getInt("r_num"));
				dto.setR_title(rs.getString("r_title"));
				dto.setR_name(rs.getString("r_name"));
				dto.setR_contents(rs.getString("r_contents"));
				dto.setR_date(rs.getDate("r_date"));				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public int editReview(reviewDTO dto) {
		int result = 0;
		try {
			sql = "update review_table set r_title=?, r_name=?, r_contents=? where r_num=?"; 
			cn = DS.getConnection();
			pst = cn.prepareStatement(sql);
			pst.setString(1, dto.getR_title());
			pst.setString(2, dto.getR_name());
			pst.setString(3, dto.getR_contents());
			pst.setInt(4, dto.getR_num());
			
			result = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return result;
	}
	
	public int deleteReview(reviewDTO dto) {
		int result = 0;
		try {
			sql = "delete from review_table where r_num=?";
			cn = DS.getConnection();
			pst = cn.prepareStatement(sql);
			pst.setInt(1, dto.getR_num());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	
}
		


