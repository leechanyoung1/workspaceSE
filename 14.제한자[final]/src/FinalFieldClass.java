 /*ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
       */
public class FinalFieldClass {
	
	
	public static final Product product=new Product(1,"새우깡");
	public final int PORT_NUMBER=80;
	public final double INCENTIVE_RATE;
	public static final double PI=3.14159;
	public static final int EARTH_RADIUS=6400;	
	
	public FinalFieldClass() {
		
		
		this.INCENTIVE_RATE=0.1;
		/*The final field FinalFieldClass.PORT_NUMBER cannot be assigned
		this.PORT_NUMBER=90;
		this.INCENTIVE_RATE=0.3;
		FinalFieldClass.PI=5.62;
		FinalFieldClass.EARTH_RADIUS=4545;
		*/
		
		System.out.println(this.PORT_NUMBER);
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		System.out.println(Math.PI);
		
		
		
		
	}
	
	
	
}
