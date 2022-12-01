
public class WhileNested {

	public static void main(String[] args) {
		
		/*
		★★★★★
		 */
		System.out.print("★★★★★\n");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.print("\n");
		System.out.println("1.-------------------------");
		/*
		 *  ★★★★★
		 *  ★★★★★
		 *  ★★★★★
		 *  ★★★★★
		 *  ★★★★★
		 */
		int i =0;
		while(i<5) {
			int j = 0;
			while(j<5) {
				System.out.printf("%s[%d,%d]","★",i,j);
				j++;
			}
			System.out.printf("\n");
			i++;
		}
		System.out.println("2.-------------------------");
		
		/*
		 * 
		 *  ☆★★★★
		 *  ★☆★★★
		 *  ★★☆★★
		 *  ★★★☆★
		 *  ★★★★☆
		 */
		i = 0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i==j) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
				
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.println("3.---------------------------------------");
		/*
		  ☆☆☆☆☆
		  ★☆☆☆☆10
		  ★★☆☆☆20 21
		  ★★★☆☆30 31 32
		  ★★★★☆40 41 42 43
		 */
		i=0;
		while(i<5)  {
			int j=0;
			while(j<5) {
				if(i<j) {
				System.out.print('☆');	
				}else {
					System.out.print('★');
				}
				j++;
			}
			System.out.println();
			i++;
				
		}
 			
		System.out.println("4.---------------------------------------");
		/*
		  ★★★★★
		  ☆★★★★
		  ☆☆★★★
		  ☆☆☆★★
		  ☆☆☆☆★
		 */
		i=0;
		while(i<5) {
			int j=0;
		while(j<5)  {
			if(i>j) {
				System.out.print('☆');
				
			}else {System.out.print('★');}
			
			j++;
		}
			System.out.println();
			i++;
		}
		
		
		
		System.out.println("5.---------------------------------------");
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		i =0;
		while(i<5) {
			int j = 0;
			while(j<=i) {
				System.out.printf("★");
				j++;
			}
			System.out.printf("\n");
			i++;
		}
		
		
		System.out.println("6.---------------------------------------");
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		i =0;
		while(i<5) {
			int j = 0;
			while(j<5-i) {
				System.out.printf("★");
				j++;
			}
			System.out.printf("\n");
			i++;
		}
	}

}
