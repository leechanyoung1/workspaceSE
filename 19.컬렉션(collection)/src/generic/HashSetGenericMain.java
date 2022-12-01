package generic;

import java.util.HashSet;

public class HashSetGenericMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111,"sim",33220,0.5);
		Account acc2 = new Account(2222,"kim",15156,0.1);
		Account acc3 = new Account(3333,"kim",55150,0.8);
		Account acc4 = new Account(4444,"yim",55880,1.2);
		Account acc5 = new Account(5555,"lim",15150,1.5);
		
		HashSet<Account> accountSet = new HashSet<Account>();
		System.out.println("#set size:"+accountSet.size());
		System.out.println("----------------------1.add------------------------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("#set size:"+accountSet.size());
		System.out.println(accountSet);
		boolean isAdd = accountSet.add(acc5);
		System.out.println("추가여부:"+isAdd);
		System.out.println("#set size:"+accountSet.size());
		System.out.println(accountSet);
		System.out.println("----------------------2.remove------------------------------");
		boolean isRemove=accountSet.remove(acc5);
		System.out.println("삭제여부:"+isRemove);
		System.out.println("#set size:"+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("%%%%%%%%%%%%%%%%%전체출력%%%%%%%%%%%%%%%");
		for(Account account:accountSet){
			account.print();
		}
		
		
		
		
		
		
		
		
		
	}

}
