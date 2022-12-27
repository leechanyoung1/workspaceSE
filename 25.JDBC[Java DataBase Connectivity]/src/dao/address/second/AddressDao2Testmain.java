package dao.address.second;

public class AddressDao2Testmain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDaoTestMain에서
		 * AddressDao2롤 파라메타를 전달
		 */
		AddressDao2 addressDao2 = new AddressDao2();
		System.out.println("1.insert");
		addressDao2.insert("이가라","569-8595","서울시민");
		System.out.println("2.update");
		addressDao2.update(18,"이자라","777-7777","대전시 중구");
		System.out.println("3.delete");
		addressDao2.delete(19);
		System.out.println("4.findByPrimaryKey");
		addressDao2.findByPrimaryKey(18);
		System.out.println("5.findAll");
		addressDao2.findAll();
		
		
		
	}

}
