
public class GajunSmartPhone implements GajunOnOff, GajunVolume {

	@Override
	public void volumeup() {
		System.out.println("ph.volup");

	}

	@Override
	public void volumedown() {
		System.out.println("ph.voldown");

	}

	@Override
	public void on() {
		System.out.println("ph.on");

	}

	@Override
	public void off() {
		System.out.println("ph.off");

	}

}
