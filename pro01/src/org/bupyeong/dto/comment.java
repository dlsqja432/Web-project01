package org.bupyeong.dto;

public class comment {
	private int no;
	private String content;
	private String resdate;
	private String aid;
	
	public comment(int no, String content, String resdate, String aid) {
		this.no = no;
		this.content = content;
		this.resdate = resdate;
		this.aid = aid;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	
	@Override
	public String toString() {
		return "comment [no=" + no + ", content=" + content + ", resdate=" + resdate + ", aid=" + aid + "]";
	}
}
