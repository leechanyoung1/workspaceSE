package com.itwill03.포함;


public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	private int no;
	private String name;
	private String phone;
	private Dvd rentDvd;//빌린dvd
	/*
	<<기능>>
	  회원정보출력 
	 */

	
	public void print() {
		System.out.println(this.no+"\t"+this.name+"\t"+this.phone);
		this.rentDvd.print();
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public Dvd getRentDvd() {
		return rentDvd;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	
	
}