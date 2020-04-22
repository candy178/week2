package com.lihaopeng.beans;

public class Camp {
	
	//阵容表
	private int cid;
	private String cname;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Camp() {
		super();
	}
	public Camp(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Camp [cid=" + cid + ", cname=" + cname + "]";
	}
}
