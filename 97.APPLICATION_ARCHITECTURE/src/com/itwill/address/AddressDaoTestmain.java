package com.itwill.address;

import java.util.List;

public class AddressDaoTestmain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDao4에서
		 * AddressDao4Main으로 데이타 리턴(전달)
		 */
		AddressDao addressDao = new AddressDao();
		System.out.println("1.insert");
		Address newAddress = new Address(0, "이가라", "569-8595", "서울시민");
		int rowCount =addressDao.insert(newAddress);
		System.out.println(rowCount);
		System.out.println("2.update");
		Address updateAddress = new Address(4,"누룽지","000-0000", "주소변경");
		rowCount = addressDao.update(updateAddress);
		System.out.println(rowCount);
		System.out.println("3.delete");
		rowCount = addressDao.delete(10);
		System.out.println(rowCount);
		System.out.println("4.findByPrimaryKey");
		
		Address findAddress= addressDao.findByPrimaryKey(1800);
		if(findAddress!=null) {
			System.out.println(">>"+findAddress);
		}else {
			System.out.println(">>"+"조건에 만족하는 주소록 존재안함");
		}
		System.out.println(addressDao.findByPrimaryKey(3));
		System.out.println(addressDao.findByPrimaryKey(40));
		System.out.println(addressDao.findByPrimaryKey(5));
		System.out.println("5.findAll");
		List<Address> addressList =addressDao.findAll();
		System.out.println(addressList);
		
		
	}

}
