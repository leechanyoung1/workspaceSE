package com.itwill03.포함;


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	
	
	private int no;
	private String name;
	private String phone;
	private Book[] rentBook;
	
public BookMember() {
	// TODO Auto-generated constructor stub
}
	

	public BookMember(int no, String name, String phone) {
	super();
	this.no = no;
	this.name = name;
	this.phone = phone;
}


	public BookMember(int no, String name, String phone, Book[] rentBook) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.rentBook = rentBook;
	}

	/*
	<<기능>>
	  회원정보출력 
	 */
	public void print() {
		System.out.println(this.no+"\t"+this.name+"\t"+this.phone);
		if(this.rentBook !=null) {
			for (Book book : rentBook) {
				book.print();
			}
				
			}
	
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

	

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}




	public Book[] getRentBook() {
		return rentBook;
	}

	public void setRentBook(Book[] rentBook) {
		this.rentBook = rentBook;
	}

	
	
	
	
	
	
	
}