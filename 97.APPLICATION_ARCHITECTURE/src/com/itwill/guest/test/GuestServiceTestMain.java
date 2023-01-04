package com.itwill.guest.test;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestServiceTestMain {

	public static void main(String[] args)  throws Exception{
		GuestService guestService=new GuestService();
		Guest newGuest = new Guest(0, "김맹구", null, "akhgej@nfns", "www.hvewuf.comn", "호오라라","이거맛있군");
		System.out.println("1.방명록쓰기");
		System.out.println(">>"+guestService.guestWrite(newGuest));
		System.out.println("2.방명록수정");
		Guest updateGuest = new Guest(3, "변경변경", null, "변경akhgej@nfns", "www.hvewuf.comn", "호오라라","이거맛있군");
		System.out.println(">>"+guestService.guestUpdate(updateGuest));
		System.out.println("3.방명록삭제");
		System.out.println(">>"+guestService.guestDelete(3));
		System.out.println("4.방명록1개보기");
		Guest findGuest = guestService.guestDetail(5);
		System.out.println(">>"+guestService.guestDetail(5));
		findGuest.setGuest_homepage("www.jgjgjgjgjfjfjfjfjfjfjf");
		System.out.println(">>"+guestService.guestUpdate(findGuest));
		System.out.println("5.방명록이름으로검색 보기");
		System.out.println(">>"+guestService.findByGuestName("김봉선"));
		System.out.println("6.방명록 리스트보기");
		System.out.println(">>"+guestService.guestList());
	}

}