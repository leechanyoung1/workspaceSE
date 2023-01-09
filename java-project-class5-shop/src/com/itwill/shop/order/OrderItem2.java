package com.itwill.shop.order;
/*
 * 이름     널?       유형         
------ -------- ---------- 
OI_NO  NOT NULL NUMBER(10) 
OI_QTY          NUMBER(10) 
O_NO            NUMBER(10) 
P_NO            NUMBER(10) 

 */

import com.itwill.shop.product.Product;

public class OrderItem2 {
	private int OI_no;
	private int OI_qty;
	private int O_no;
	
	private Product product;
	public OrderItem2() {
		// TODO Auto-generated constructor stub
	}
	public OrderItem2(int oI_no, int oI_qty, int o_no, Product product) {
		super();
		OI_no = oI_no;
		OI_qty = oI_qty;
		O_no = o_no;
		this.product = product;
	}
	public int getOI_no() {
		return OI_no;
	}
	public int getOI_qty() {
		return OI_qty;
	}
	public int getO_no() {
		return O_no;
	}
	public Product getProduct() {
		return product;
	}
	public void setOI_no(int oI_no) {
		OI_no = oI_no;
	}
	public void setOI_qty(int oI_qty) {
		OI_qty = oI_qty;
	}
	public void setO_no(int o_no) {
		O_no = o_no;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "OrderItem2 [OI_no=" + OI_no + ", OI_qty=" + OI_qty + ", O_no=" + O_no + ", product=" + product + "]";
	}
	
	
	
	

}
