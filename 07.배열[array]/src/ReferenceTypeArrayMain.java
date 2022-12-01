
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a=345;
		Account acc =new Account(8989,"SIm",56000,3.2);
		int[] ia=new int[5];
		ia[0]=23;
		*/
		Account[] accArray = new Account[5];
		accArray[0] =new Account(1111,"kim",80000,1.3);
		accArray[1] =new Account(2222,"sim",40000,5.8);
		accArray[2] =new Account(3333,"min",50000,9.1);
		accArray[3] =new Account(4444,"nim",60000,1.2);
		accArray[4] =new Account(5555,"lee",90000,5.2);
		Account.headerPrint();
		for (int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
		
		
		
	}

}
