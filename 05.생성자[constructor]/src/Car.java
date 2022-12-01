/*
 * 1.주차장에서 차객체를 생성할클래스(틀)
 * 2. Car 객체의 주소를 저장할수있는 타입
 */
/**
 * 차객체를 생성하기위한클래스
 * @author LEE
 *@version 1.0
 */
public class Car {
	/*
	 * 클래스의 구성요소
	 *1.멤버필드(변수)[속성]:차객체의 속성데이터를 저장할변수
	 *2.멤버메소드[기능]    :차객체가 외부에제공하는가능
	 */
	/*
	 * 멤버필드(속성)
	 */
	private String no;  //차량번호
	private int intime;  //입차시간
	private int outTime;//출차시간
	private int fee;    //주차요금
	
	/*
	 * 생성자메쏘드[초기화]
	 */
	/*
	 * 멤버필드의 기본값을 가진 차객체 생성
	 */
	/**
	 * 기본초기값을가진 차객체를생성
	 */
	public Car() {
		
	}
	/*
	 * 차량번호,입차시간을 인자로 받아서
	 * 멤버필드의 값을 가진차객체생성
	 */
	/**
	 * 입차데이터로 초기화되된 차량객체생성
	 * @param no    차량번호
	 * @param inTime   입차시간
	 */
	public Car(String no , int inTime) {
		this.no = no;
		this.intime = inTime;
	}
	
	/*
	 * 차량멤버데이터를 인자로 받아서 
	 * 멤버필드의 값을 가진차객체생성
	 */
	/**
	 * 매겨변수로 초기화
	 * @param no 차량번호
	 * @param inTime 입차시간
	 * @param outTime 출차시간
	 * @param fee 주차요금
	 */
	public Car(String no, int inTime,int outTime,int fee) {
		this.no = no;
		this.intime= inTime;
		this.outTime = outTime;
		this.fee= fee;
		
			
	}
	
	
	
	
	
	/*
	 * 멤버메소드[기능]
	 */
	/*
	 * 입차시데이터(번호,시간)대입
	 */
	/**
	 * 입차시 입차데이터 대입메쏘드
	 * @param no 차량번호
	 * @param intime 입차시간
	 */
	public void setIpChaData(String no,int intime) {
		this.no = no;
		this.intime = intime;
	}
	/*
	 * 출차시간 멤버필드outTime에 출차시간데이터 대입(set)
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	
	/*
	 * 주차요금계산
	 */
	/**
	 * 주차요금계산
	 */
	public void calculatefee() {
		this.fee = (this.outTime-this.intime)*1000;
	}
	/*
	 * 헤더정보출력
	 */
	public void headerPrint() {
		System.out.println("-------------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-------------------------------------");
	}
	
	/*
	 * 차량정보출력
	 */
	public void print() {
		
		System.out.printf("%6s %7d %8d %9d\n",this.no,this.intime,this.outTime,this.fee);	
	}
	/*getter,setter
	*alt+shift+s-->r
	*/
	public String getNo() {
		return no;
	}
	public int getIntime() {
		return intime;
	}
	public int getOutTime() {
		return outTime;
	}
	/**
	 * 
	 * @return 주차요금
	 */
	public int getFee() {
		return fee;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setIntime(int intime) {
		this.intime = intime;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
}
