
public class ControlSleepTreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1.main");
		System.out.println("2.main 쓰레드 3초간 sleep");
		Thread.sleep(3000);
		System.out.println("3.main 쓰레드 3초후 꺠워");
		ControlSleepTread cst = new ControlSleepTread();
		cst.start();
		System.out.println("9.main return");

	}

}
