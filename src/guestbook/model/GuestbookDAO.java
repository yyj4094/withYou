package guestbook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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

}
