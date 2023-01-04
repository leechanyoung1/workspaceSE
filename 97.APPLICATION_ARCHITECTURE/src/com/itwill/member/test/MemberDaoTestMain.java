package com.itwill.member.test;

import java.util.Date;

import com.itwill.member.Member;
import com.itwill.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		MemberDao memberDao1=new MemberDao();
		System.out.println("0.delete   --> "+memberDao1.delete("dddd"));
		System.out.println("1.insert   --> "+memberDao1.insert(new Member("dddd", "dddd", "디디디", "서울시", 34, "T", null)));
		System.out.println("2.update   --> "+memberDao1.update(new Member("dddd", "dddd", "디변경", "부산시", 37, "F", null)));
		System.out.println("3.selectById-> "+memberDao1.findByPrimaryKey("dddd"));
		System.out.println("4.selectAll--> "+memberDao1.findAll());
	}

}
