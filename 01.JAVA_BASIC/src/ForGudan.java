

public class ForGudan {

	public static void main(String[] args) {
		/*
		 * 
		 */
		for (int i = 2; i < 10; i++) {
			for (int j =1 ; j < 10; j++) {
				System.out.printf("%d*%d=%d\t",i,j,i*j);
				if(j%9==0)
					System.out.println();
			}
			 
		}

	}

}
