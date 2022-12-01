
public class AccountManyMain {

	public static void main(String[] args) {
		AccountMany accountMany = new AccountMany();
		accountMany.acc0= new Account(1,"kim",3000,0.5);
		accountMany.acc1= new Account(2,"lim",6000,1.5);
		accountMany.acc2= new Account(3,"mim",8000,5.5);
		accountMany.acc3= new Account(4,"nim",9000,4.5);
		accountMany.acc4= new Account(5,"oim",2000,8.5);
		
		Account.headerPrint();
		accountMany.acc0.print();
		accountMany.acc1.print();
		accountMany.acc2.print();
		accountMany.acc3.print();
		accountMany.acc4.print();
	
	}

}
