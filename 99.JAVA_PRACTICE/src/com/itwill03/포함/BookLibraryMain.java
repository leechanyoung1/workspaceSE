package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bm1 = new BookMember();
		bm1.setNo(1);
		bm1.setName("지미");
		bm1.setPhone("010-1234-5678");
		BookMember bm2 = new BookMember(1, "구미", "010-5555-2222");
		
		
		/*
		 * 책객체생성
		 */
		Book[] book = new Book[3];
		book[0]=new Book(111,"책1","시","재미있다");
		book[1]=new Book(111,"책2","시","재미있다");
		book[2]=new Book(111,"책3","시","재미있다");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		
		bm1.setRentBook(book);
		
		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bm1.print();
		
		
	}
}