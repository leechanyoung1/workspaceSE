
public class GajunAudio implements GajunOnOff,GajunVolume {

	@Override
	public void on() {
		System.out.println("ad.on");

	}

	@Override
	public void off() {
		System.out.println("ad.off");

	}

	@Override
	public void volumeup() {
		System.out.println("ad.volup");
		
	}

	@Override
	public void volumedown() {
		System.out.println("ad.voldown");
		
	}

}
