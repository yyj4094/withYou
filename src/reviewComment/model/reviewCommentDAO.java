package reviewComment.model;

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

public class reviewCommentDAO {
	private Connection cn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	private String sql;
	private DataSource DS;
	
	public reviewCommentDAO(){
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

	

	public int insertreviewComment(reviewCommentDTO dto) {
		int result = 0;
		try {
			sql = "insert into reviewComment_table values(seq_reviewComment_table_rc_num.nextval,?,?,?)";
			cn = DS.getConnection();
			pst = cn.prepareStatement(sql);
			pst.setInt(1, dto.getCm_num());
			pst.setString(2, dto.getRc_name());
			pst.setString(3, dto.getRc_contents());
			result = pst.executeUpdate();
			System.out.println("insert succeed");
			result=1;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert failed");

		}
		return result;
	}
//delete에서는 왜 매개변수를 주지 않는 이유.
	public int deletereviewComment(reviewCommentDTO dto) {
		int result = 0;
		try {
			sql = "delete reviewComment_table where rc_num=?";
			cn = DS.getConnection();
			pst = cn.prepareStatement(sql);
			pst.setInt(1, dto.getRc_num());
			result = pst.executeUpdate();
			System.out.println("reviewComment_삭제완료");
		} catch (SQLException e) {
			System.out.println("reviewComment_삭제실패");

			e.printStackTrace();
		}
		return result;
	}
	
	public List<reviewCommentDTO> getreviewCommentList(int num) {
		List<reviewCommentDTO> RClist = new ArrayList <reviewCommentDTO>();
		System.out.println("check>>댓글 리스트 컬레션 호출");
		try {
		sql = "select * from reviewComment_table where cm_num = ?";
		cn = DS.getConnection();
		pst = cn.prepareStatement(sql);
		pst.setInt(1, num);
		rs=pst.executeQuery();
		
		while(rs.next()){
			reviewCommentDTO dto = new reviewCommentDTO();
			dto.setRc_num(rs.getInt("rc_num"));
			dto.setCm_num(rs.getInt("cm_num"));
			dto.setRc_name(rs.getString("rc_name"));
			dto.setRc_contents(rs.getString("rc_contents"));
			
			RClist.add(dto);				
		}
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
		return RClist;
	}
}
