package com.itwill.member.test;

import javax.swing.JOptionPane;

import com.itwill.member.Member;
import com.itwill.member.MemberService;

public class MemberServiceTestMain {
	
	public static void main(String[] args) throws Exception {
		MemberService memberService = new MemberService();
		
		boolean addSuccess1 =memberService.addMember(new Member("Xxxx", "xxxxxxx", "엑스맨", "경기도민", 20, "F", null));
		if(addSuccess1) {
			System.out.println("로그인화면으로이동");
		}else {
			JOptionPane.showMessageDialog(null,"중복된아이디입니다");
		}
		boolean addSuccess2 =memberService.addMember(new Member("bbbb", "bbbb", "비비맨", "강원도민", 33, "T", null));
		if(addSuccess2) {
			System.out.println("로그인화면으로이동");
		}else {
			JOptionPane.showMessageDialog(null,"중복된아이디입니다");
		}
		System.out.println(memberService.login("bbbb", "bbbb"));
		System.out.println(memberService.login("bbbb", "bbba"));
		System.out.println(memberService.login("pppp", "1212"));
		System.out.println("3.diplicateID");
		System.out.println(memberService.isDuplicateId("aaada"));
		System.out.println(memberService.isDuplicateId("bbbb"));
	
	}
	
	
	
}
