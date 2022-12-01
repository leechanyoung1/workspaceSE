
public class ReferenceTypeAccountArrayMain {

	public static void main(String[] args) {
		/*Accout[] accounts = new Accout[6];
		 * accounts[0] = new Account(1111, "kim",8000, 2.5);
		 * accounts[1] = new Account(2222, "kim",8000, 2.5);
		 * accounts[2] = new Account(3333, "kim",8000, 2.5);
		 * accounts[3] = new Account(4444, "kim",8000, 2.5);
		 * accounts[4] = new Account(5555, "kim",8000, 2.5);
		 * accounts[5] = new Account(6666, "kim",8000, 2.5);
		 * 
		*/
		
		
		
		
		
		
		
		System.out.println("--------값목록으로 배열생성{}--------");
		Account acc1 = new Account(1111, "kim",8000, 2.5);
		Account[] accounts = {                                         
				acc1,
				new Account(2222, "lee", 68900, 5.3),
				new Account(3333, "aee", 68900, 6.3),
				new Account(4444, "xee", 68900, 3.3),
				new Account(5555, "cee", 78900, 4.3),
				new Account(6666, "vee", 85900, 5.3),
				new Account(7777, "dee", 88900, 6.3),
				new Account(8888, "eee", 78900, 5.3),
				new Account(9999, "bee", 58900, 6.3),
			};
		System.out.println("1.은행총계좌수:"+accounts.length);
		System.out.println("2.은행계좌 전체출력:");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			/*
			Account tempAccount = accounts[i];
			tempAccount.print();
			*/
			
			accounts[i].print();
		}
		System.out.println("3.은행계좌들 총잔고");
		int totBalance = 0;
		for (int i = 0; i < accounts.length; i++) {
			//totBalance= totBalance+accounts[i].getBalance();
			totBalance+=accounts[i].getBalance();
		}
		System.out.println(">>"+totBalance);
		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");
		for (int i = 0; i < accounts.length; i++) {
			//Account account = accounts[i];
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
		}
		System.out.println("5.은행 계좌들중에서 계좌잔고 50000원이상인 VIP계좌 여러개 찾아서 출력");
		for(Account tempAccount:accounts) {
			if(tempAccount.getBalance()>=50000) {
				tempAccount.print();
			}
		}
		/*
	for (int i = 0; i < accounts.length; i++) {
		if(accounts[i].getBalance()>=50000) {
			accounts[i].print();		
			}
	}
	*/
		System.out.println("6.은행 계좌들중에서 계좌이율 2.0 이상인 계좌 여러개 찾아서 출력[Quiz]");
		
		System.out.println("6.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력[String객체배우고난후에]");
		
		System.out.println("7.6666번계좌 3000원입금");
		for(Account account:accounts) {
			if(account.getNo()==6666) {
				account.print();
				account.deposit(3000);
				account.print();
				break;
			}
		}
		System.out.println("8.9999번계좌 3000원출금[Quiz]");
		
		System.out.println("9.계좌잔고순으로 오름차순정렬");
		System.out.println("#############정렬전############");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("#############정렬후############");
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance()>accounts[j+1].getBalance()) {
					/*
					 * 주소값교환
					 */
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]= tempAccount;
				}else if(accounts[j].getBalance()==accounts[j+1].getBalance()) {
						if(accounts[j].getIyul()>accounts[j+1].getIyul()) {
							Account tempAccount = accounts[j];
							accounts[j]=accounts[j+1];
							accounts[j+1]= tempAccount;
						}
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.println("9.계좌잔고순으로 내림차순정렬");
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance()<accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]= tempAccount;
				}
			}
		}
		System.out.println("9.계좌번호순으로 오름(내림)차순정렬[Quiz]");
		System.out.println("9.계좌이름순으로 오름(내림)차순정렬(String 클래스 배운후 추가");
		System.out.println("10.5555계좌한개 이율을 3.6으로변경");
		for(Account ad:accounts) {
			if(ad.getNo()==5555) {
				ad.print();
				ad.setIyul(3.6);
				ad.print();
				break;
			}
		}
		System.out.println("11.VIP계좌(잔고50000원이상)여러개 잔고 50원 증가");
		for(Account ab:accounts) {
			if(ab.getBalance()>=50000) {
				ab.deposit(50);
				ab.print();
				}
			}
		
		
		System.out.println("-------------Account에 재정의된 toString메쏘드----------");
		for(Account account:accounts)
			System.out.println(account);
		
		System.out.println(accounts[accounts.length-1]);
		

		System.out.println("----------------------------Account객체추가[OPTION]----------------------------");
		System.out.println("----------------------------Account객체삭제[OPTION]----------------------------");
		/********************OPTION***********************
		  1. accounts배열 객체에 새로생성한계좌객체 추가 
		  		A. accounts.length+1 개짜리 임시배열생성
		 		B. accounts의 모든계좌객체 임시배열로 이동
				C. 임시배열에 새로운  Account객체추가
		 		D. accounts에 임시배열주소대입
		 
		  2. accounts배열 객체에서 계좌번호 4444번계좌객체삭제
		  	 	A. accounts 에서 8888계좌찾아서 null대입
			 	B. accounts.length-1 개짜리 임시배열생성
			 	C. accounts null이아닌 모든계좌 임시배열로이동
			  	D. accounts 에 임시배열대입 
		****************************************************/	  
		
		
		
		
		
		
		
	}

}
