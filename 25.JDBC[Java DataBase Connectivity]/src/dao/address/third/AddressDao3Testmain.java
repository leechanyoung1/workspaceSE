package dao.address.third;

public class AddressDao3Testmain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDao3TestMain에서
		 * AddressDao3로 파라메타객체(DTO,VO) 전달
		 */
		AddressDao3 addressDao3 = new AddressDao3();
		System.out.println("1.insert");
		Address newAddress = new Address(0, "이가라", "569-8595", "서울시민");
		addressDao3.insert(newAddress);
		System.out.println("2.update");
		Address updateAddress = new Address(4,"누룽지","000-0000", "주소변경");
		addressDao3.update(updateAddress);
		System.out.println("3.delete");
		addressDao3.delete(19);
		System.out.println("4.findByPrimaryKey");
		addressDao3.findByPrimaryKey(18);
		System.out.println("5.findAll");
		addressDao3.findAll();
		
		
		
	}

}
