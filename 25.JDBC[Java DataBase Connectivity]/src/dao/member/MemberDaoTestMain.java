package dao.member;

import java.util.Date;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		
		
		
		//System.out.println("0.delete   --> ");
		//System.out.println("1.insert   --> ");
		Member newMember = new Member("abcd","abcd","맹구", "강남구", 20, 'T',null);
		int rowCount =memberDao.insert(newMember);
		System.out.println(rowCount);
		//System.out.println("2.update   --> ");
		//System.out.println("3.selectById-> ");
		//System.out.println("4.selectAll--> ");
		
	}

}
