package member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAO {

	private Connection cn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	private String sql;
	private DataSource DS;
	
	public MemberDAO(){
		try{
			Context init = new InitialContext();
			DS=(DataSource)init.lookup("java:comp/env/jdbc/sch");
		}catch(NamingException e){
			e.printStackTrace();
			return;
		}
	}
	
	//�α��� üũ
	public int userCheck(String id, String pwd) {
		
		int result=0;	
		sql = "select * from member_table";
		try {
			cn=DS.getConnection();
			st=cn.createStatement();
			rs=st.executeQuery(sql);
			
			String m_id = "";
			String m_pw = "";
			
			while(rs.next()==true){
				m_id=rs.getString("memId");
				if(m_id.equals(id)){
					m_pw = rs.getString("memPw");					
					if(m_pw.equals(pwd)){
						result = 1;
					}
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}// userCheck() end

}
