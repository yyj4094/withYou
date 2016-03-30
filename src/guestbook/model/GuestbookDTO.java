package guestbook.model;

public class GuestbookDTO {
	int g_num;
	String g_name;
	String g_pw;
	String g_contents;
	
	public int getG_num() {
		return g_num;
	}
	public void setG_num(int g_num) {
		this.g_num = g_num;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_pw() {
		return g_pw;
	}
	public void setG_pw(String g_pw) {
		this.g_pw = g_pw;
	}
	public String getG_contents() {
		return g_contents;
	}
	public void setG_contents(String g_contents) {
		this.g_contents = g_contents;
	}

}
