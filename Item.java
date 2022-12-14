package com.tns.lambdademo;
public class Item{
	private int id;
	private String iname;
	public double price;
	public Item(int id,String iname,double price) {
		super();
		this.id = id;
		this.iname = iname;
		this.price = price;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
public String toString() {
	return "Item (id=" +id +",iname=" + iname + ",price=" +  price + ")";

	

	}

}
