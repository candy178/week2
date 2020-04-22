package com.lihaopeng.beans;

public class Heros {
	
	private int id;
	private String hname;
	private Double price;
	private int isHave;
	private String picurl;
	
	private int cid;
	private String cname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getIsHave() {
		return isHave;
	}
	public void setIsHave(int isHave) {
		this.isHave = isHave;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
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
	public Heros() {
		super();
	}
	public Heros(int id, String hname, Double price, int isHave, String picurl, int cid, String cname) {
		super();
		this.id = id;
		this.hname = hname;
		this.price = price;
		this.isHave = isHave;
		this.picurl = picurl;
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Heros [id=" + id + ", hname=" + hname + ", price=" + price + ", isHave=" + isHave + ", picurl=" + picurl
				+ ", cid=" + cid + ", cname=" + cname + "]";
	}
}
