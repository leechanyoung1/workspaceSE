
public class IfNested {

	public static void main(String[] args) {
		
		/*
		 * 평점계산(A,B,C,D,F)
		 */
		int kor = 3407;
		char hakjum ='F';
		
		if(kor>=90 && kor<=100) {
			hakjum = 'A';
		}else {
			if(kor>=80 && kor<90) {
				hakjum = 'B';
			}else {
				if(kor>=70 && kor<80) {
					hakjum = 'C';
				}else {
					if(kor>=60 && kor<70) {
						hakjum = 'D';
					}else {
						hakjum = 'F';
					}
				}
			}
			
		}
		System.out.printf("1.학점은 %c 입니다\n",hakjum);
		
		hakjum = 'X';
		if(kor>=90 && kor<=100) {
			hakjum = 'A' ;
		}else if(kor>=80 && kor<90){
			hakjum = 'B' ;
		}else if(kor>=70 && kor<80) {
			hakjum = 'C';
		}else if(kor>=60 && kor<70) {
			hakjum = 'D';
		}else {
			hakjum = 'F';
		}
		
		System.out.printf("2.학점은 %c 입니다\n",hakjum);
		
	}

}
