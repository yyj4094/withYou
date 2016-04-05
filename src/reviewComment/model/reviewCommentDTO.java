package reviewComment.model;

public class reviewCommentDTO {
	int rc_num,cm_num;
	String rc_name,rc_contents;
	
	public int getCm_num() {
		return cm_num;
	}
	public void setCm_num(int cm_num) {
		this.cm_num = cm_num;
	}
	
	public int getRc_num() {
		return rc_num;
	}
	public void setRc_num(int rc_num) {
		this.rc_num = rc_num;
	}
	public String getRc_name() {
		return rc_name;
	}
	public void setRc_name(String rc_name) {
		this.rc_name = rc_name;
	}
	public String getRc_contents() {
		return rc_contents;
	}
	public void setRc_contents(String rc_contents) {
		this.rc_contents = rc_contents;
	}

}
