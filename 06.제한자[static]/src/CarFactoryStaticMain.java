
public class CarFactoryStaticMain {

	public static void main(String[] args) {
		Car c1= new Car(1,"k3","red");
		Car c2= new Car(1,"k5","green");
		Car c3= new Car(1,"k7","blue");
		
		System.out.println("차량총생산대수:"+Car.count);
		Car.headerPrint();
		c1.print();
		c2.print();
		c3.print();
	}

}
