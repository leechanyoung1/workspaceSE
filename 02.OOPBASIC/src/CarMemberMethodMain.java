
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 1.차량번호 1234차량 12시에 입차
		 */
		Car car1 = new Car();
		/*
		 * 입차시데이터(번호,시간)대입메소드호출
		 */
		car1.setIpChaData("1234", 12);
		/*
		 * car1차량 16시출차
		 */
		/*
		 * 2-1 출차시간 대입메쏘드호출
		 */
		car1.setOutTime(16);
		/*
		 * 2-2주차요금계산메쏘드호출
		 */
		car1.calculatefee();
		/*
		 * 2-3주차요금영수증출력
		 */
		car1.print();
		
	}

}
