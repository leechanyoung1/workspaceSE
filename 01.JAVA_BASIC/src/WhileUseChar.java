
public class WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 */
		char c1 = 0;
		while(c1<2) {
			System.out.print(c1+" ");
			c1++;
			
			if(c1%100==0) {
			System.out.println();	
			}
		  }
		System.out.println();	
		/*
		 * -영문소문자출력
		 */
		char c2 = 'a';
		while(c2<='z') {
			System.out.print(c2);
			System.out.print(",");
			c2++;
		}
		System.out.println();
		
		
		char c3='a';
		int lettercount=0;
		while(c3<='z') {
			System.out.print(c3+" ");
			lettercount++;
			if(lettercount%5==0) {
				System.out.print("\n");
			}
			c3++;	
		}
		System.out.println();
		char c4 = 'A';
		while(c4<='Z') {
				System.out.print(c4+" ");
				if((c4-'A'+1)%5==0)
						System.out.print("\n");
				c4++;
		}
		
			/*Quiz
			 * -한글출력
			 * -숫자형문자(0~9)출력	
			 */
		System.out.println();
		char han='가';
		while(han<='힣') {
			System.out.print(han);
			if((han-'가'+1)%20==0) {
				System.out.print("\n");
			}
			han++;
		}
		
		
		
		
		
		
		
		
		/*System.out.println();
             char c4 ='가';
             int lettercount2=0;
             
            while(c4<='나') {
            	System.out.print(c4);
            	if(c4!='나')  {
            		System.out.print(",");
            	}
            	lettercount2++;
            	if(lettercount2%20==0) {
            		System.out.println();
            	}
            	
            	c4++;
            }*/
            	
            }
            	
            	
            	
            	
            {

		
		
		
		}

}
