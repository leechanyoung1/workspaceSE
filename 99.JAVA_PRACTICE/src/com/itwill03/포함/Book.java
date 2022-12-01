package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	private int no;
	private String name;
	private String type;
	private String  ex;
	
	public Book() {
		
	}

	public Book(int no, String name, String type, String ex) {
		
		this.no = no;
		this.name = name;
		this.type = type;
		this.ex = ex;
	}
	
	public void print() {
		System.out.println(this.no+"\t"+this.name+"\t"+this.type+"\t"+this.ex);
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getEx() {
		return ex;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}
	
	
}