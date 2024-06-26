package org.bupyeong.dto;

public class TrafficVO {
	private int tno;
	private String ttype;
	private String no;
	
	public TrafficVO() {}
	
	public TrafficVO(int tno, String ttype, String no) {
		this.tno = tno;
		this.ttype = ttype;
		this.no = no;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "TrafficVO [tno=" + tno + ", ttype=" + ttype + ", no=" + no + "]";
	}
}
