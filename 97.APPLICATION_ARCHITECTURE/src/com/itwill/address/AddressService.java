package com.itwill.address;

import java.util.List;

public class AddressService {
private AddressDao addressDao;

public AddressService() throws Exception {
	addressDao = new AddressDao();
	}
	/*
	 * 주소록쓰기
	 */
	public int addressWrite(Address address) throws Exception {
		
		return addressDao.insert(address);
	}
	/*
	 *주소록 번호로 1개보기 
	 */
	public Address addressDetail(int no) throws Exception {
		return addressDao.findByPrimaryKey(no);
	}
	/*
	 * 주소록 번호로 1개 수정
	 */
	public int AddressUpdate(Address updateAddress) throws Exception {
		return addressDao.update(updateAddress);
	}
	
	/*
	 * 주소록번호로 삭제하기
	 */
	public int addressDelete(int no) throws Exception {
		return addressDao.delete(no);
	}
	/*
	 *주소록전체보기 
	 */
	public List<Address> addressList() throws Exception {
		return addressDao.findAll();
	}
}
