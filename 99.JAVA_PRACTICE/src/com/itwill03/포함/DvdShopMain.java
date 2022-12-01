package com.itwill03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember dm = new DvdMember();
		dm.setNo(1);
		dm.setName("지미");
		dm.setPhone("010-1234-5678");
		
		
		/*
		 * Dvd객체생성
		 */
		Dvd dd = new Dvd(10,"소닉","코믹");
	
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		dm.setRentDvd(dd);
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		dm.print();
	}

}