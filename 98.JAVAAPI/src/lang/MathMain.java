package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * Math 클래스
		 * - 수학함수를 가지고 있는 클래스
		 * -모든메쏘드 static
		 *  -객체생성이 불가능(생성자 접근제어자private)
		 *
		 *
		Math math = new Math();
		*/
		double r =Math.abs(123.783);
		System.out.println(r);
		System.out.println(Math.max(1212,1211));
		System.out.println(Math.min(1212, 1211));
		System.out.println(Math.round(33.55555));
		System.out.println(Math.round(33.55555+10)/10.0);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2, 8));
		System.out.println("------------Math.random--------------");
		
		System.out.println(Math.random()*100);
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println("1~10사이의 정수 5개 랜덤생성");
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println("1~45사이의 정수 6개 랜덤생성");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
	}

}
