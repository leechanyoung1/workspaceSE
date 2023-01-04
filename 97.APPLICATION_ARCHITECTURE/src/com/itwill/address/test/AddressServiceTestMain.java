package com.itwill.address.test;

import com.itwill.address.Address;
import com.itwill.address.AddressService;

public class AddressServiceTestMain {

	public static void main(String[] args) throws Exception {
		AddressService addressService = new AddressService();
		/*
		 * 1.주소록쓰기
		 */
		Address newAddress = new Address(0, "가이드1","111-1111" ,"LA");
		System.out.println(">>"+addressService.addressWrite(newAddress));
		System.out.println("2.주소록 번호로검색");
		Address findAddress =addressService.addressDetail(4);
		System.out.println(">>"+addressService.addressDetail(4));
		System.out.println("3.주소록수정");
		findAddress.setAddress("주tk소2변경");
		findAddress.setName("이름변경");
		findAddress.setPhone("555-5555");
		
		System.out.println(">>"+addressService.AddressUpdate(findAddress));
		System.out.println(">>"+addressService.addressDetail(4));
		System.out.println("주소록삭제");
		System.out.println(">>"+addressService.addressDelete(2));
		System.out.println(">>"+addressService.addressDelete(3));
		System.out.println("주소록리스트");
		System.out.println(">>"+addressService.addressList());
		

	}

}
