package nogeneric;

import java.util.*;

public class ArrayListMain {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1111,"sim",33220,0.5);
		Account acc2 = new Account(2222,"kim",15156,0.1);
		Account acc3 = new Account(3333,"kim",55150,0.8);
		Account acc4 = new Account(4444,"yim",55880,1.2);
		Account acc5 = new Account(5555,"lim",15150,1.5);
		Account acc6 = new Account(6666,"lim",15150,1.5);
		Account acc7 = new Account(7777,"kim",15150,1.5);
		Account acc8 = new Account(8888,"lim",15150,1.5);
		Account acc9 = new Account(9899,"kim",15150,1.5);
		Account acc10 = new Account(9999,"kim",15150,1.5);
	
		
	ArrayList accountList = new ArrayList();
	int size = accountList.size();
	System.out.println("#size:"+size);
	System.out.println("*****************1.add[맨마지막 index에 객체를 저장]**********");
	accountList.add(acc1);	
	accountList.add(acc2);	
	accountList.add(acc3);	
	System.out.println("#size:"+accountList.size());	
	System.out.println(accountList);
	accountList.add(acc4);	
	accountList.add(acc5);	
	accountList.add(acc6);	
	accountList.add(acc7);	
	accountList.add(acc8);	
	accountList.add(acc9);	
	accountList.add(acc10);	
	System.out.println("#size:"+accountList.size());	
	System.out.println(accountList);
	System.out.println("*****************2.add(index,element)[지정된 index에 객체를 저장]**********");
	accountList.add(2,new Account(3332,"kim",33000,3.3));
	System.out.println("#size:"+accountList.size());	
	System.out.println("*****************3.set(index,element)[지정된 index에 객체를 저장]**********");
	accountList.set(5, new Account(3332,"three",33000,3.3));
	System.out.println("#size:"+accountList.size());
	System.out.println(accountList);
	System.out.println("****************4.get(index)***************");
	Account getaAccount = (Account)accountList.get(1);
	System.out.println(getaAccount);
	System.out.println("****************5.remove(index)***************");
	Account removeAccount = (Account)accountList.remove(accountList.size()-1);
	removeAccount.print();
	System.out.println("#size:"+accountList.size());
	System.out.println(accountList);
	
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%");
	System.out.println("***********1.계좌전체출력***********");
	
	for (int i = 0; i < accountList.size(); i++) {
		Account temp = (Account)accountList.get(i);
		temp.print();
	}
	for (Object objectaccount : accountList) {
		/*
		Account temp = (Account)objectaccount;
		temp.print();
		*/
		((Account)objectaccount).print();
	}
	System.out.println("***********2.계좌번호3333번 한개 찾기***********");
	for (int i = 0; i < accountList.size(); i++) {
		Account tempAccount =(Account)accountList.get(i);
		if(tempAccount.getNo()==3333) {
			tempAccount.print();
			break;
		}
	}
	System.out.println("***********3.계좌주이름 king인계좌 여러개찾기***********");
	for (int i = 0; i < accountList.size(); i++) {
		if(((Account)accountList.get(i)).getOwner().equals("kim")) {
			((Account)accountList.get(i)).print();
		}
			
	}
	System.out.println("***********4.계좌번호 4444번계좌 한개삭제***********");
	for (int i = 0; i < accountList.size(); i++) {
		Account tempAccount = (Account)accountList.get(i);
		if(tempAccount.getNo()==4444) {
			System.out.println("remove전 sizn:"+accountList.size());
			Account rAccount = (Account)accountList.remove(i);
			rAccount.print();
			System.out.println("removegn sizn:"+accountList.size());
			
			break;
		}
	
	}
	System.out.println("***********5.계좌주이름 king인계좌 여러개삭제***********");
	for (int i = 0; i < accountList.size(); i++) {
		Account tempAccount = (Account)accountList.get(i);
		if(tempAccount.getOwner().equals("kim")) {
			Account rAccount = (Account)accountList.remove(i);
			rAccount.print();
			i--;
		}
	}
	System.out.println("***********6.계좌전체출력***********");
	for (int i = 0; i < accountList.size(); i++) {
		Account temp = (Account)accountList.get(i);
		temp.print();
	}
	
	
	
		
		}

}
