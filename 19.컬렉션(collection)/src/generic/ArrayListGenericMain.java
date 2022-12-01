package generic;

import java.util.ArrayList;

public class ArrayListGenericMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111,"kim",33000,1.0);
		Account acc2 = new Account(2221,"aim",43000,2.0);
		Account acc3 = new Account(3331,"aim",53000,3.0);
		Account acc4 = new Account(4441,"dim",63000,4.0);
		Account acc5 = new Account(5551,"fim",73000,5.0);
		
		
		
		ArrayList<Account>  accountList = new ArrayList<Account>();
		System.out.println("# list size:"+accountList.size());
		System.out.println("-------1.add(element)----------");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("# list size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("-------2.add(index,element)----------");
		accountList.add(2, new Account(3330,"gsm",99999,9.9));
		System.out.println("# list size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("-------3.set(index,element)----------");
		accountList.set(0, new Account(1000,"big",18818,1.8));
		System.out.println("# list size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("-------4.get(index)----------");
		Account getAccount = accountList.get(0);
		getAccount.print();
		System.out.println("# list size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("-------5.remove(index)----------");
		Account removeAccount = accountList.remove(0);
		removeAccount.print();
		System.out.println("# list size:"+accountList.size());
		System.out.println(accountList);
		
		System.out.println("%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%");
		System.out.println("*************1.계좌전체출력**************");
		
		for (int i = 0; i < accountList.size(); i++) {
			accountList.get(i).print();
		}
		
		for (Account account : accountList) {
			account.print();
		}
		System.out.println("*************2.계좌번호 3333찾기**************");
		for (Account account : accountList) {
			if(account.getNo()==3333) {
				account.print();
				break;
			}
		}
		System.out.println("*************3.계좌주이름 aim여러개찾기**************");
		for (Account account : accountList) {
			if(account.getOwner().equals("aim")) {
				account.print();
			}
					
		}
		System.out.println("*************4.계좌번호 4444번호 계좌1개삭제**************");
		/*
		for (int i = 0; i < accountList.size(); i++) {
			Account account = accountList.get(i);
			if(account.getNo()==4444) {
				accountList.remove(i);
				break;
			}
		}
		*/
		for (Account account : accountList) {
			if(account.getNo()==4444) {
				accountList.remove(account);
			}
		}
		System.out.println("*************4.계좌이름 aim 계좌 여러개삭제**************");
		 for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getOwner().equals("aim")) {
				accountList.remove(i).print();
				i--;
			}
					
		}
	}

}
