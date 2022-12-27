package dao.address.fourth;

import java.util.List;

public class AddressDao4Testmain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDao4에서
		 * AddressDao4Main으로 데이타 리턴(전달)
		 */
		AddressDao4 addressDao4 = new AddressDao4();
		System.out.println("1.insert");
		Address newAddress = new Address(0, "이가라", "569-8595", "서울시민");
		int rowCount =addressDao4.insert(newAddress);
		System.out.println(rowCount);
		System.out.println("2.update");
		Address updateAddress = new Address(4,"누룽지","000-0000", "주소변경");
		rowCount = addressDao4.update(updateAddress);
		System.out.println(rowCount);
		System.out.println("3.delete");
		rowCount = addressDao4.delete(10);
		System.out.println(rowCount);
		System.out.println("4.findByPrimaryKey");
		
		Address findAddress= addressDao4.findByPrimaryKey(1800);
		if(findAddress!=null) {
			System.out.println(">>"+findAddress);
		}else {
			System.out.println(">>"+"조건에 만족하는 주소록 존재안함");
		}
		System.out.println(addressDao4.findByPrimaryKey(3));
		System.out.println(addressDao4.findByPrimaryKey(40));
		System.out.println(addressDao4.findByPrimaryKey(5));
		System.out.println("5.findAll");
		List<Address> addressList =addressDao4.findAll();
		System.out.println(addressList);
		
		
	}

}
