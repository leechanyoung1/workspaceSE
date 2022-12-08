
public class SynchronzeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeUpperLowerPrintSharedObject sharedObject = new SynchronizeUpperLowerPrintSharedObject();
		SynchronzeUpperThread up = new SynchronzeUpperThread(sharedObject);
		SynchronzeLowerThread lo = new SynchronzeLowerThread(sharedObject);
		up.start();
		lo.start();
	}

}
