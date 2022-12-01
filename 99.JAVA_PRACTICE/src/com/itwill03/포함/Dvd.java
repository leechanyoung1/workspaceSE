package com.itwill03.포함;


public class Dvd {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  번호
		타이틀
		쟝르
	 * 
	 * <<기능>>
	 *   Dvd정보출력
	 *   
	 */
	private int no;
	private String title;
	private String type;
	public Dvd() {
		
	}
	
	public Dvd(int no, String title, String type) {
		
		this.no = no;
		this.title = title;
		this.type = type;
	}
	public void print() {
		System.out.println(this.no+"\t"+this.title+"\t"+this.type);
	}
	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getType() {
		return type;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}