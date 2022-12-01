
public class GajunTv implements GajunOnOff,GajunVolume{
	public void operation1() {
		System.out.println("Tv.operation1()");
	}
	public void operation2() {
		System.out.println("Tv.operation2()");
	}
	@Override
	public void volumeup() {
		System.out.println("Tv.volumeup()");
		
	}
	@Override
	public void volumedown() {
		System.out.println("Tv.volumedown()");
		
	}
	@Override
	public void on() {
		System.out.println("Tv.on()");
		
	}
	@Override
	public void off() {
		System.out.println("Tv.off()");
		
	}
		
}
