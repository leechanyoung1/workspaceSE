
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 짝수홀수판별
		 */
		
		int number = 20 ;
		switch (number%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;

		}
		char direction = 'D';
		switch (direction) {
		case 'A':
		case 'a':
			System.out.println("move left~");
			break;
		case 'D':
		case 'd':
			System.out.println("move right~");
			break;
		case 'W':
		case 'w':
			System.out.println("move up~");
			break;
		case 'X':
		case 'x':
			System.out.println("move down~");
			break;
		case 'S':
		case 's':
			System.out.println("move rotate~");
			break;
		default:
			System.out.println("don't move");
			break;
		}
		/*
		 * Quiz: 대소문자 구분없이 X,x실행하도록 해보세여
		 * 
		 */
		
	}

}
