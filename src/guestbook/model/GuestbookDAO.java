package guestbook.model;

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

public class GuestbookDAO {
	private Connection cn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	private String sql;
	private DataSource DS;
	
	public GuestbookDAO(){
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

	public ArrayList getGuestbookList() {
		List<GuestbookDTO> guestbooklist = new ArrayList<GuestbookDTO>();	
		System.out.println("chcek>>> 리스트컬렉션호출");
		try {
			sql = "select * from guestbook_table order by g_num";
			cn=DS.getConnection(); 
			st=cn.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()){
				GuestbookDTO dto = new GuestbookDTO();
				dto.setG_num(rs.getInt("g_num"));
				dto.setG_name(rs.getString("g_name"));
				dto.setG_contents(rs.getString("g_contents"));
				guestbooklist.add(dto);				
			}
			System.out.println("list에 저장완료");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("list에 저장실패");
		}
		return (ArrayList) guestbooklist;
	}

	public int insertGuestbook(GuestbookDTO dto) {
		int result = 0;
		try {
			sql = "insert into guestbook_table values(seq_adminboard_goods_num.nextval,?,?,?)";
			cn = DS.getConnection();
			pst = cn.prepareStatement(sql);
			pst.setString(1, dto.getG_name());
			pst.setString(2, dto.getG_pw());
			pst.setString(3, dto.getG_contents());
			result = pst.executeUpdate();
			System.out.println("insert succeed");
			result=1;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert failed");

		}
		return result;
	}

	public int deleteGBcomment(GuestbookDTO dto) {
		int result = 0;
		try {
			sql = "delete from guestbook_table where g_num=?";
			cn = DS.getConnection();
			pst = cn.prepareStatement(sql);
			pst.setInt(1, dto.getG_num());
			result = pst.executeUpdate();
			System.out.println("GB_삭제완료");
		} catch (SQLException e) {
			System.out.println("GB_삭제실패");

			e.printStackTrace();
		}
		return result;
	}

}
