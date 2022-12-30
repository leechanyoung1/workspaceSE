package dao.guest;

import java.util.List;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
				
		GuestDao guestDao=new GuestDao();
		System.out.println("1.insert");
		Guest newGuest = new Guest(2,"김맹구","cafg;ja@naver.com","www.fjafaawfw.com","좋아요","아주좋아요");
		guestDao.insert(newGuest);
		//System.out.println("2.delete");
		//System.out.println("3.updatet");
		//System.out.println("4.findByPrimarykey");
		//System.out.println("5.findAll");
			
	}

}
