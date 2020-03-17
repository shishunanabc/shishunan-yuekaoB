package com.shishunan.entity;

public class Parts {
	private Integer pid;
	private String pname;
	public Parts() {
		super();
	}
	public Parts(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Parts [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
}
