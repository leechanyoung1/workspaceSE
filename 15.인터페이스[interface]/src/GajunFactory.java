
public class GajunFactory {

	public static void main(String[] args) {
	System.out.println("-------가전제품공장--------");
	GajunTv tv1 = new GajunTv();
	GajunTv tv2 = new GajunTv();
	GajunTv tv3 = new GajunTv();
	
	
	GajunAudio ad1=new GajunAudio();
	GajunAudio ad2=new GajunAudio();
	
	
	GajunSmartPhone sp1 = new GajunSmartPhone();
	GajunSmartPhone sp2 = new GajunSmartPhone();
	
	GajunOnOff gajun1 = tv1;
	GajunOnOff[] gajunArray= new GajunOnOff[7];
	gajunArray[0]=gajun1;
	gajunArray[1]=tv2;;
	gajunArray[2]=tv3;
	gajunArray[3]=ad1;
	gajunArray[4]=ad2;
	gajunArray[5]=sp1;
	gajunArray[6]=sp2;
	
	
	
	System.out.println("-------가전제품검사소--------");
	/*
	 * 난 절대로 자식클래스타입을 사용안할래요
	 * 난 부모타입[GajunVolume,GajunOnOff]만 사용할래요
	 * 그래야 가전제품검사 프로그램을 한번 만들어서 
	 * 변경없이 계속사용할수있으니까요~
	 */
	
	GajunOnOff[] recvGajunArray =gajunArray;
	for (int i = 0; i < recvGajunArray.length; i++) {
		System.out.println("----------검사시작-----------");
		recvGajunArray[i].on();
		GajunVolume tempGajun =(GajunVolume)recvGajunArray[i];
		tempGajun.volumeup();
		tempGajun.volumedown();
		recvGajunArray[i].off();
		System.out.println("---------검사끝-----------");
	}
	
	/*
	GajunGumsa gajunGumsa = new GajunGumsa();
	gajunGumsa.setGajuns(gajunArray);
	gajunGumsa.gumsa();
	*/
	}

}
