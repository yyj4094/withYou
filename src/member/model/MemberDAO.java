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
			System.out.println("DB access ");
		}catch(NamingException e){
			System.out.println("DB access failed");
			e.printStackTrace();
			return;
		}
	}
	
	//User Check Start
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
				m_id=rs.getString("m_id");
				if(m_id.equals(id)){
					m_pw = rs.getString("m_pw");					
					if(m_pw.equals(pwd)){
						System.out.println("login Success");
						result = 1;
					}
				}
			}
		} catch (SQLException e) {
			System.out.println("Fail to get information");
			e.printStackTrace();
		}
		return result;
	}// userCheck() end
	
	//UserInsert() Start
		public void userInsert(MemberDTO dto) {
			try {
				cn=DS.getConnection();
				sql = "insert into member_table values(?,?,?,?,?,?)";
				pst = cn.prepareStatement(sql);
				pst.setString(1, dto.getM_id());
				pst.setString(2, dto.getM_pw());
				pst.setString(3, dto.getM_name());
				pst.setInt(4, dto.getM_phone());
				pst.setString(5, dto.getM_email());
				pst.setString(6, dto.getM_address());
				pst.executeUpdate();
				System.out.println("check1>>> UserInsert Succeeded");
			} catch (SQLException e) {
				System.out.println("check1>>> UserInsert Failed");
				e.printStackTrace();
			}	
		}
}
