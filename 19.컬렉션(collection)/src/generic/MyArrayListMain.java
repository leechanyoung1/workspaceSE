package generic;

public class MyArrayListMain {

	public static void main(String[] args) {
		
		MyArrayList<Account> myArrayList = new MyArrayList<Account>();
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		
		System.out.println(myArrayList.Size());
		Account account =myArrayList.get(0);
		System.out.println(account);
		Account account2 = myArrayList.remove(0);
		account2.print();
		System.out.println(myArrayList.Size());
	}

}
